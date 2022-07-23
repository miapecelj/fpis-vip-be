package com.vip.fpis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TariffPackageDto implements Serializable {

	private static final long serialVersionUID = 353124628938217657L;
	private Long id;
	private String name;
	private int minutes;
	private int sms;
	private double mb;
	private TariffPackageTypeDto type;
}
