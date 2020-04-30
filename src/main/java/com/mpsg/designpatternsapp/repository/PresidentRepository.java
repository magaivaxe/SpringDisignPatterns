package com.mpsg.designpatternsapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface PresidentRepository extends CrudRepository<PresidentEntity, Long> {

  PresidentEntity findByEmailAddress(String emailAddress);
}
