package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ExchangeData")
public class StockExchange {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer exchangeId;
	
	private String stockExchange;
	private String brief;
	private String address;
	private String remarks;
}