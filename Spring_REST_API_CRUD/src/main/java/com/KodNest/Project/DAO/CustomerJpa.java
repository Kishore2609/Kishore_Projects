package com.KodNest.Project.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.KodNest.Project.Entity.Customer;

public interface CustomerJpa extends JpaRepository<Customer, Integer> {

}
