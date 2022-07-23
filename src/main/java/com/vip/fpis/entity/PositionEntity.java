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

@Table(name = "position")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "organization_unit_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private OrganizationUnitEntity organizationUnit;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "position_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private PositionEntity position;

}
