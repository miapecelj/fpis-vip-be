package com.vip.fpis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.EmployeeEntity;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	List<EmployeeEntity> findByFirstNameAndLastName(String firstName, String lastName);

	List<EmployeeEntity> findByFirstName(String firstName);

	List<EmployeeEntity> findByLastName(String lastName);

}
