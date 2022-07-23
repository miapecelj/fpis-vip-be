package com.vip.fpis.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

@Table(name = "estimate_item")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstimateItemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "order_number")
	private int orderNumber;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "device_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private DeviceEntity device;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "tariff_package_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private TariffPackageEntity tariffPackage;
	@ManyToOne(fetch = FetchType.LAZY)
	private EstimateEntity estimate;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof EstimateItemEntity))
			return false;
		return id != null && id.equals(((EstimateItemEntity) o).getId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
