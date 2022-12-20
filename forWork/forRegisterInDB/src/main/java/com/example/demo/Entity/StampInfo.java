package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StampInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column
	private Date startDate;
	
	@Column
	private Date endDate;
	
	@Column
	private String title;
	
	@Column
	private boolean Allday;
}
