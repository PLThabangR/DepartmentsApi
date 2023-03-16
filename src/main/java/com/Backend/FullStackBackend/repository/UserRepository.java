package com.Backend.FullStackBackend.repository;

import com.Backend.FullStackBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
