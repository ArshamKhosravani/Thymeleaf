package com.mapsa.thymeleaf.repository;

import com.mapsa.thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
