package com.example.jpabasics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
//We will make an interface instead of class, since we do not want to implement JPA methods manually, instead hibernate should take
//care of that
public interface UserRepository extends JpaRepository<User , Integer> { //<Model , Data type of primary key in that model db>
}
