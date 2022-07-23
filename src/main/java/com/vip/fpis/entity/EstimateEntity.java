package com.vip.fpis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "estimate")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstimateEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private String note;
	private double discount;
	@Column(name = "price_with_discount")
	private double priceWithDiscount;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "employee_send_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private EmployeeEntity employeeSend;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "employee_receive_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private EmployeeEntity employeeReceive;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "estimate")
	@RestResource(exported = false)
	private List<EstimateItemEntity> estimateItems = new ArrayList<>();

	public void addEstimateItem(EstimateItemEntity estimateItem) {
		estimateItems.add(estimateItem);
		estimateItem.setEstimate(this);
	}

	public void removeRequestItem(EstimateItemEntity estimateItem) {
		estimateItems.remove(estimateItem);
		estimateItem.setEstimate(null);
	}
}
