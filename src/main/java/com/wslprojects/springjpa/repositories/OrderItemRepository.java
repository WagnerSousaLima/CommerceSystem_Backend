package com.wslprojects.springjpa.repositories;

import com.wslprojects.springjpa.entities.OrderItem;
import com.wslprojects.springjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
