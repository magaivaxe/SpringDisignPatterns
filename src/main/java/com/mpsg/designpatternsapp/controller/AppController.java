package com.mpsg.designpatternsapp.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mpsg.designpatternsapp.builder.Contact;
import com.mpsg.designpatternsapp.builder.ContactBuilder;
import com.mpsg.designpatternsapp.factory.Pet;
import com.mpsg.designpatternsapp.factory.PetFactory;
import com.mpsg.designpatternsapp.repository.PresidentEntity;
import com.mpsg.designpatternsapp.repository.PresidentRepository;

@RestController
@RequestMapping("/")
public class AppController {

  @Autowired
  private PetFactory petFactory;

  @Autowired
  private PresidentRepository presidentRepository;

  @Autowired
  RestTemplate restTemplate; // The rest template do a simulations of querry to call a service.

    @GetMapping
    public String getDefault(){
        return "{\"message\": \"Hello World\"}";
    }

  @PostMapping("adoptPet/{type}/{name}")
  public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
    Pet pet = this.petFactory.createPet(type);
    pet.setName(name);
    pet.feed();
    return pet;
  }

  @GetMapping("presidents")
  public List<Contact> getPresidents() {
    List<Contact> contacts = new ArrayList<>();

    Contact contact = new Contact();
    contact.setFirstName("Dilma");
    contact.setLastName("Russef");
    contact.setEmailAddress("dilma@russef");
    contacts.add(contact);

    // classic method
    contacts.add(new Contact("Fernando", "Collor", "fer@collor"));

    // add with contact builder
    contacts.add(new ContactBuilder().setFirstName("Lula").setLastName("Silva").setEmailAddress("lula@silva").buildContact());

    return contacts;
  }

  @GetMapping("presidents/{id}")
  public PresidentEntity getPresidentById(@PathVariable Long id) {
    return presidentRepository.findById(id).get();
  }

  // template patters and MVC
  @GetMapping("presidentContact/{id}")
  public Contact getPresidentContact(@PathVariable Long id) {
    PresidentEntity entity =
        restTemplate.getForEntity("http://localhost:8080/presidents/{id}", PresidentEntity.class, id).getBody();
    return new ContactBuilder().setFirstName(entity.getFirstName()).setLastName(entity.getLastName())
        .setEmailAddress(entity.getEmailAddress()).buildContact();
  }

}
