package com.xworkz.terroristapp.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NonNull

public abstract class AbstractAuditDTO implements Serializable{

	private String createdBy;
	private LocalDateTime createdAt;
	private String updatedBy;
	private LocalDateTime updatedAt;
	
	
	
	
}