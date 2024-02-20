package es.pildoras.pruebaanotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	private CreacionInformeFinanciero informeFinanciero;
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	public DirectorFinanciero(@Qualifier("informeFinancieroDtoCompras")CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
		
	}
	
	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Tareas DirectorFinanciero";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}


	

}
