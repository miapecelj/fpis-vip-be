package com.vip.fpis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vip.fpis.dto.EmployeeDto;
import com.vip.fpis.mapper.EmployeeDtoEntityMapper;
import com.vip.fpis.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeDtoEntityMapper mapper;

	@GetMapping("/{firstname}/{lastname}")
	public ResponseEntity<?> findByName(@PathVariable String firstname, @PathVariable String lastname) {
		try {
			List<EmployeeDto> employees = new ArrayList<>();
			if (firstname != null && lastname == null) {
				employees = employeeRepository.findByFirstName(firstname).stream()
						.map(employee -> mapper.toDto(employee)).collect(Collectors.toList());
			}
			if (firstname == null && lastname != null) {
				employees = employeeRepository.findByLastName(lastname).stream().map(employee -> mapper.toDto(employee))
						.collect(Collectors.toList());
			} else {
				employees = employeeRepository.findByFirstNameAndLastName(firstname, lastname).stream()
						.map(employee -> mapper.toDto(employee)).collect(Collectors.toList());
			}
			return ResponseEntity.status(HttpStatus.OK).body(employees);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

}
