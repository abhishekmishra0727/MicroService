package com.chary.bhaumik.consumer.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String id;
    private String name;
    private String price;
    private String customerId;
    
}
