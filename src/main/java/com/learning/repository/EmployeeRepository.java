package com.learning.repository;

import com.learning.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//extended crud and jpa repository in one:-
public interface EmployeeRepository extends CrudRepository<Employee,String>, JpaRepository<Employee,String> {

}
