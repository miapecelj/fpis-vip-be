package com.vip.fpis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerDto implements Serializable {

	private static final long serialVersionUID = -314240784446387785L;
	private Long id;
	private String name;
}
