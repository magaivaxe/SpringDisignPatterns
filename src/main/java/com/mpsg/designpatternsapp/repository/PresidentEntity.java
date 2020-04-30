package com.mpsg.designpatternsapp.repository;


@Entity
@Table(name = "PRESIDENT")
public class PresidentEntity {

  @Id
  @GeneratedValue
  @Column(name = "PRESIDENT_ID")
  private long id;
  @Column(name = "FIRST_NAME")
  private String firstName;
  @Column(name = "MIDDLE_INITIAL")
  private String middleInitial;
  @Column(name = "LAST_NAME")
  private String lastName;
  @Column(name = "EMAIL_ADDRESS")
  private String emailAddress;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleInitial() {
    return middleInitial;
  }

  public void setMiddleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String toString() {
    return String.format("PresidentEntity [id=%s, firstName=%s, middleInitial=%s, lastName=%s, emailAddress=%s]", id, firstName,
                         middleInitial, lastName, emailAddress);
  }

}
