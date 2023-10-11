package org.java.app.pojo;

import java.time.LocalDate;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Deal {
	
	private LocalDate startDate;
	private LocalDate endDate;
	private String name;
	
	public Deal() {}
	
	@ManyToOne
	@JoinColumn(name = "pizza_id", nullable = false)
	private Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}


	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}


	public Deal(LocalDate startDate, LocalDate endDate, String name) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.name = name;
	}


	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Deal [getStartDate()=" + getStartDate() + ", getEndDate()=" + getEndDate() + ", getName()=" + getName()
				+ "]";
	}
	
}
