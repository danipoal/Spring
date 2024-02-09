package es.pildoras.IoC.UsoEmpleados;

public class JefeEmpleado implements Empleados{

	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono eso por un Jefe";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el informe de jefeEmpleado:"+informeNuevo.getInforme();
	}
}
