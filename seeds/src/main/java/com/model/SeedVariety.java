package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "seed_variety")
public class SeedVariety {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type; 
    private String benefits;
    private String description;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBenefits() {
		return benefits;
	}
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SeedVariety(Long id, String name, String type, String benefits, String description) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.benefits = benefits;
		this.description = description;
	}
	public SeedVariety() {
		super();
	}
	@Override
	public String toString() {
		return "SeedVariety [id=" + id + ", name=" + name + ", type=" + type + ", benefits=" + benefits
				+ ", description=" + description + "]";
	}
	
	

    // Getters and Setters
    
}
