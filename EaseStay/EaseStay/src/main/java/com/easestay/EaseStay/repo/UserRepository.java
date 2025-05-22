package com.easestay.EaseStay.repo;

import com.easestay.EaseStay.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {
    //user repository to perform CURD operations on the user table

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
