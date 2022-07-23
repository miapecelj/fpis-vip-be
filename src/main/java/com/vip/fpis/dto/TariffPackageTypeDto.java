package com.vip.fpis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TariffPackageTypeDto implements Serializable {

	private static final long serialVersionUID = -5785694915029209614L;
	private Long id;
	private String name;
}
