package com.vip.fpis.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto implements Serializable {

	private static final long serialVersionUID = -2971091053289022797L;
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private PositionDto position;
}
