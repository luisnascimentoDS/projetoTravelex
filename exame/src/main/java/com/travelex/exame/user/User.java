package com.travelex.exame.user;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public abstract class User {
	
	private String firstName;
	private String lastName;
	private String fullName;
	private String shortName;
	
	public User(String name) {
		this.splitName(name);
	}
	
	private void splitName(String name) {
		
		List<String> preposicoes = Arrays.asList("de", "da", "do", "das", "dos");
		String splited[] = name.trim().split(" ");		
		
		List<String> nomes = Arrays.asList(splited);
		nomes = nomes.stream()
				.filter(n -> !preposicoes.contains(n))
				.collect(Collectors.toList());
		
		int size = nomes.size();
		this.fullName = name.toUpperCase();
		this.firstName = nomes.get(0).trim();
		this.shortName = nomes.get(0).concat(" ");
		this.lastName = "";
		
		int count = 0;
		
		for(String str: nomes) {
			if(count > 0 && count < (size-1)) {
				this.lastName = this.lastName.concat(str.trim()).concat(" ");
				char [] letra = str.toUpperCase().toCharArray();
				this.shortName = this.shortName + (letra[0]) + ". ";
			} else if (count > 1 && count <= (size-1)) {
				this.lastName = this.lastName.concat(str.trim());
				this.shortName = this.shortName.concat(str.trim());
			}
			count++;
		}

	}

}
