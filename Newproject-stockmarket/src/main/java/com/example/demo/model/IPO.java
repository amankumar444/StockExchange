package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IPODetail")
public class IPO {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ipoId;
	
	private Integer sharePrice;
	private Integer totalShares;
	private String openingDateTime;
	private String remarks;
	
}
