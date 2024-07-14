package com.wslprojects.springjpa.repositories;

import com.wslprojects.springjpa.entities.Order;
import com.wslprojects.springjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
