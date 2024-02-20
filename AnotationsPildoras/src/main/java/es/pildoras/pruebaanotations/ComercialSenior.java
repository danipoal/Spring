package es.pildoras.pruebaanotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

//@Component("ComercialSenior")
public class ComercialSenior implements Empleados {

	@PreDestroy
	public void ejecutarDespues() {
		System.out.println("Esto despues de destruir bean");
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Tareas de comercial Senior";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}
	
	//Para que haga un informeFinanciero hay que hacer estos pasos
	//1- Crear un objeto de la interfaz en la clase
	//@Autowired
	//@Qualifier("x1")
	private CreacionInformeFinanciero nuevoInforme;
	
	//2- Creamamos el constructor con este parametro

	public ComercialSenior(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	//3-Anotaciones, en la clase del informe financiero Component
	// Anotacion Autowired en Constructor, que busca si alguna clase impolementa la interfaz con la que hemos creado
	
	//4- getInforme en el return: nuevoInforme.getInformeFinanciero();
	//-------------------------------------------------------------------------
	

	
}
