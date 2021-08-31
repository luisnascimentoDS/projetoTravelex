package com.travelex.exame.imc;

import org.springframework.stereotype.Service;

@Service
public class IMCServiceImpl implements IMCService {

	@Override
	public String calcularIMC(IMC params) throws Exception {
		if(validarParams(params)) {
			return new IMC().calculaIMC(params);
		} else {
			throw new Exception("Parametros inválidos!");
		}
	}
	
	private Boolean validarParams(IMC params) {
		return params.getPeso() != null && params.getAltura() != null;
	}
	
}
