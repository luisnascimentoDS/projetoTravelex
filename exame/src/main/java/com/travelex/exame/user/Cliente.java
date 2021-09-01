package com.travelex.exame.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Cliente extends User{

	public Cliente(String name) {
		super(name);
	}

}
