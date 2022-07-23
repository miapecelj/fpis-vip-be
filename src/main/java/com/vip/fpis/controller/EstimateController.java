package com.vip.fpis.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vip.fpis.dto.EstimateDto;
import com.vip.fpis.service.EstimateService;

@RestController
@RequestMapping("/estimate")
public class EstimateController {
	@Autowired
	private EstimateService estimateService;

	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(estimateService.getById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(estimateService.getAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping("/find/{dateString}")
	public ResponseEntity<?> findByDate(@PathVariable String dateString) {
		try {
			System.out.println(dateString);
			SimpleDateFormat sdfDateDMY = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdfDateDMY.parse(dateString);
			List<EstimateDto> requests = estimateService.findByDate(date);
			return ResponseEntity.status(HttpStatus.OK).body(requests);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody EstimateDto estimate) {
		try {
			estimateService.save(estimate);
			return ResponseEntity.status(HttpStatus.OK).body("Succesfuly saved");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody EstimateDto estimate, @PathVariable Long id) {
		try {
			estimateService.update(estimate, id);
			return ResponseEntity.status(HttpStatus.OK).body("Succesfuly saved");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

}
