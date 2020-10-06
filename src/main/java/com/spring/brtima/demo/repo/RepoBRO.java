package com.spring.brtima.demo.repo;

import com.spring.brtima.demo.model.EntityBro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoBRO extends JpaRepository<EntityBro,Integer> {
}
