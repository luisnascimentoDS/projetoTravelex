package com.travelex.exame.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Gerente extends User {

	public Gerente(String name) {
		super(name);
	}

}
