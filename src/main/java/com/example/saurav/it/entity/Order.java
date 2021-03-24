package com.example.saurav.it.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "order_Tb")
@Data

public class Order {
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;

}
