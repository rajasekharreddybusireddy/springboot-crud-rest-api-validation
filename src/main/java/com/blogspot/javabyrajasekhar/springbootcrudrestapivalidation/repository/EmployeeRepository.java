	package com.blogspot.javabyrajasekhar.springbootcrudrestapivalidation.repository;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.blogspot.javabyrajasekhar.springbootcrudrestapivalidation.model.Employee;
	
	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	}
