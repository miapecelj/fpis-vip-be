package com.vip.fpis.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstimateDto implements Serializable {

	private static final long serialVersionUID = 1984434922345453915L;
	private Long id;
	private Date date;
	private String note;
	private double discount;
	private double priceWithDiscount;
	private EmployeeDto employeeSend;
	private EmployeeDto employeeReceive;
	private List<EstimateItemDto> estimateItems = new ArrayList<>();
}
