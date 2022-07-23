package com.vip.fpis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeviceDto implements Serializable {

	private static final long serialVersionUID = 8218784532785817017L;
	private Long id;
	private String name;
	private String model;
	private String color;
	private double price;
	private ManufacturerDto manufacturer;
}
