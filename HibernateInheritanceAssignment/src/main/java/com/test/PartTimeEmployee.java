package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PART_TIME")
public class PartTimeEmployee extends Employee{
private int hourlyrate;

public int getHourlyrate() {
	return hourlyrate;
}

public void setHourlyrate(int hourlyrate) {
	this.hourlyrate = hourlyrate;
}
}
