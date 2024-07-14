package com.wslprojects.springjpa.repositories;

import com.wslprojects.springjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
