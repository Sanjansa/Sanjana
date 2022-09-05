package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Vegetable is the Entity representing Vegetables table in database
 * 
 * @author Khan, Saif
 *
 */
@Entity
@Table(name = "vegetable_details")
public class Vegetable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "vegetable_id")
	private int vegetableId;
	@NotBlank(message = "Name is mandatory")
	@Column(name = "vegetable_name")
	private String vegetableName;
	@Column(name = "vegetable_price")
	private long vegetablePrice;
	@Column(name = "vegetable_quantity")
	private long vegetableQuantity;

	/**
	 * Vegetable default constructor
	 */

	public Vegetable() {
		super();

	}

	public Vegetable(int vegetableId, @NotBlank(message = "Name is mandatory") String vegetableName,
			long vegetablePrice, long vegetableQuantity) {
		super();
		this.vegetableId = vegetableId;
		this.vegetableName = vegetableName;
		this.vegetablePrice = vegetablePrice;
		this.vegetableQuantity = vegetableQuantity;
	}

	public int getVegetableId() {
		return vegetableId;
	}

	public void setVegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
	}

	public String getVegetableName() {
		return vegetableName;
	}

	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}

	public long getVegetablePrice() {
		return vegetablePrice;
	}

	public void setVegetablePrice(long vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
	}

	public long getVegetableQuantity() {
		return vegetableQuantity;
	}

	public void setVegetableQuantity(long vegetableQuantity) {
		this.vegetableQuantity = vegetableQuantity;
	}

	@Override
	public String toString() {
		return "Vegetable [vegetableId=" + vegetableId + ", vegetableName=" + vegetableName + ", vegetablePrice="
				+ vegetablePrice + ", vegetableQuantity=" + vegetableQuantity + "]";
	}

}
