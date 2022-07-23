package com.vip.fpis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstimateItemDto implements Serializable {

	private static final long serialVersionUID = 4674177061329114648L;
	private Long id;
	private int orderNumber;
	private DeviceDto device;
	private TariffPackageDto tariffPackage;
}
