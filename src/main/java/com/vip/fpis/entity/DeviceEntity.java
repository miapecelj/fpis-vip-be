package com.vip.fpis.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "device")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeviceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String model;
	private String color;
	private double price;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "manufacturer_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private ManufacturerEntity manufacturer;
}
