package com.dockr.training.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User{
	
	private static final long serialVersionUID = 32424454353451L;

	private int id;

	/** The name. */
	private String name;

	/** The age. */
	private String age;

	/** The email. */
	private String email;

}
