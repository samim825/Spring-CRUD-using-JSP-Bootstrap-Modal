package com.spring.repository;

import com.spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by User on 5/12/2020.
 */
public interface EmployeeRepo extends JpaRepository<Employee ,Long> {
}
