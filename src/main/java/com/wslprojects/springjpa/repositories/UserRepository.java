package com.wslprojects.springjpa.repositories;

import com.wslprojects.springjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
