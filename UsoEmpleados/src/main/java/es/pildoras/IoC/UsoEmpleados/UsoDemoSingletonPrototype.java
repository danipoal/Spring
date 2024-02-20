package es.pildoras.IoC.UsoEmpleados;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cargamos el xml2 para usarlo
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		//Carga de beans
		SecretarioEmpleado Jorge = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		System.out.println(Jorge);	//Esto imprime la dirección de memoria del objeto
		System.out.println(Pedro);	//Imprime la misma dirección de memoria xk es un objeto singleton
	
		//Al poner en el xml BEAN el scope= prototype se crea un objeto para cada bean
	
		//Aqui probaremos los metodos INIT y DESTROY para ejecutar los beans antes de ON y after OFF
		DirectorEmpleado Maria2 = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		
		System.out.println(Maria2.getInforme());
		
		contexto.close();
	
	}

}
