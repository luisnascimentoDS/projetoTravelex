package com.travelex.exame.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Robo extends User {

	public Robo(String name) {
		super(name);
	}

}
