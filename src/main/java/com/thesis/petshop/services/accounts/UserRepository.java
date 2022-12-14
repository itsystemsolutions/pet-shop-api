package com.thesis.petshop.services.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String name);

    Optional<User> findByEmail(String email);

    List<User> findAllByType(String type);
}
