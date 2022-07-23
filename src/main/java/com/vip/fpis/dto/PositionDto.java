package com.vip.fpis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionDto implements Serializable {

	private static final long serialVersionUID = -835591269844672368L;
	private Long id;
	private String name;
	private OrganizationUnitDto organizationUnit;
	private PositionDto position;

}
