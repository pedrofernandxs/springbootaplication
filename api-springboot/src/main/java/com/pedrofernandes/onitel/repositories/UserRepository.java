package com.pedrofernandes.onitel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrofernandes.onitel.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
