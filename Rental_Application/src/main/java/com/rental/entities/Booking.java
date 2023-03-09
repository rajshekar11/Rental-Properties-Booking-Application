package com.rental.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Booking {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer bid;
	    private int numberOfMonth;
	    private int numberOfTenant;
	    @OneToOne
	    private Tenant tenant;
	    @ManyToOne
	    private Property property;
}
