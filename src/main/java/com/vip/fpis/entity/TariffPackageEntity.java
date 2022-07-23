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

@Table(name = "tariff_package")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TariffPackageEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int minutes;
	private int sms;
	private double mb;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "tariff_packet_type_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private TariffPackageTypeEntity type;
}
