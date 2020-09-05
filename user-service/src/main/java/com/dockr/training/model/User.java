package com.dockr.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 32424454353451L;

	@Id
	@GeneratedValue
	private int id;

	/** The name. */
	private String name;

	/** The age. */
	private String age;

	/** The email. */
	private String email;

}
