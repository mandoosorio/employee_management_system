package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.models.Employee;

@Repository
//similar to sequelize or mongoose, tells project that it will use built in methods to query database
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
