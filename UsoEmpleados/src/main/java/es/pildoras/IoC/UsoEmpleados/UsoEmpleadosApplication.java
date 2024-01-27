package es.pildoras.IoC.UsoEmpleados;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class UsoEmpleadosApplication {

	public static void main(String[] args) {
						
		//Creacion de objetos tipo Empleado
				
		Empleados Empleado1 = new SecretarioEmpleado();//Es del tipo JefeEmpleado pero usamos la interfaz
						
				
		//Uso objetos creados
		System.out.println(Empleado1.getTareas());
		
		//--------BEANS--------
			//Se usan para que un objeto de un tipo de clase/interfaz, pueda usar metodos de otras clases sin tener que crearlas si esta en esa interfaz
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Al empleado Juan le damos el contexto especificado, de miEmpleado(Como esta en el XML y con la class de la interfaz)
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		contexto.close();	//Cerrar XML
		
		
		//SpringApplication.run(UsoEmpleadosApplication.class, args);	Esto para que quede inicializada la consola
	}

}
