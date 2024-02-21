package com.example.demo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployRepository extends JpaRepository<Employ, Integer> {
	@Query(value="select * from Employ Where Dept=?")
	List<Employ> searchByDept(String d);
}
