package com.travelex.exame.imc;

import java.text.DecimalFormat;

import lombok.Data;

@Data
public class IMC {
	
	private Double peso;
	private Double altura;
	private Double result;
	
	
	public String calculaIMC(IMC params) {
		
		String ret = "Índice: %s. %s";
		String resultIMC = "";
		params.setResult(params.getPeso() / Math.sqrt(params.getAltura()));
		
        if (params.getResult() < 18.5) {
        	resultIMC = "Abaixo do peso.";
        } else if (params.getResult() >= 18.6 && params.getResult() <= 24.9){
            resultIMC = "Normal.";
        } else if (params.getResult() >= 25 && params.getResult() <= 29.9){
            resultIMC = "Sobrepeso";
        } else {
            resultIMC = "Obeso";
        }

        
		return String.format(ret, new DecimalFormat("#,##0.00").format(params.getResult()), resultIMC);
	}

}
