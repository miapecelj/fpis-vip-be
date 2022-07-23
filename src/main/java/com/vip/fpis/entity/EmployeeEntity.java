package com.vip.fpis.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "employee")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "position_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private PositionEntity position;
}
