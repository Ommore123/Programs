package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.series.springboot.model.Student;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
