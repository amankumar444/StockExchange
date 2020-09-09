package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Exchange")
public class SharePrice {

	@Id
	private Integer companyId;
	private String companyName;
	private String exchangeName;
	private String stockPrice;
	private String date;
	private String time;
	
}
