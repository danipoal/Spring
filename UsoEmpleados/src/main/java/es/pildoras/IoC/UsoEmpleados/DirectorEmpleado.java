package es.pildoras.IoC.UsoEmpleados;

public class DirectorEmpleado implements Empleados {
	
	
	//Creacion de campo tipo creacionInforme(interfaz)
	//Constructor que inyecta dependencia
	
	private CreacionInformes informeNuevo;
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la plantilla de empleados, soy director";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director" + informeNuevo.getInforme();
	}

	//Metodo init. Para ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		//Aqui todas las tareas a ejecutar antes de que este ON
		System.out.println("Aqui van las tareas a exe antes de que el BEAN este ON");
	}
	
	//Metodo destroy. Para ejecutar tareas despues de que haya sido usado
	public void metodoFinal() {
		//Aqui todas las tareas a ejecutar antes de que este ON
		System.out.println("Aqui van las tareas a exe despues de que el BEAN este OFF");
	}
}
