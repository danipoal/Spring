package es.pildoras.pruebaanotations;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class AnotationsPildorasApplication {

	public static void main(String[] args) {

		//SpringApplication.run(AnotationsPildorasApplication.class, args);
		
		//Leer el xml
			//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Leer el .class de conifguracion
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		
		//Pedir Bean al contenedor
			//Empleados Maria = contexto.getBean("ComercialSenior", Empleados.class);
			
			//System.out.println(Maria.getInforme());
		//
		
		//@Bean
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println(empleado.getInforme());
		System.out.println(empleado.getEmail());

	contexto.close();	//Cerrar XML
	
	
		
	}

}
