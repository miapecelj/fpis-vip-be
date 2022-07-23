package com.vip.fpis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationUnitDto implements Serializable {

	private static final long serialVersionUID = 5681216238092853156L;
	private Long id;
	private String name;

}
