package com.hk.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mobiles
{
	@Id
	@SequenceGenerator(name="gen",sequenceName = "mobile_seq",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen",strategy = GenerationType.SEQUENCE)
	private Integer mobile_id;
	@Column(length = 20)
	private String model;
	@Column(length = 10)
	private String brand;
	private double price;
	@Column(length = 20)
	private String networktype;
	@Column(length = 20)
	private String processor;
	@Column(length = 25)
	private String cam;
	public Integer battery;
	public Integer year;

}
