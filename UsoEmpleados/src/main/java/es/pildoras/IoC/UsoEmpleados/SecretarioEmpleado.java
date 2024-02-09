package es.pildoras.IoC.UsoEmpleados;

public class SecretarioEmpleado implements Empleados {

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de jefes, por un secretario";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario" + informeNuevo.getInforme();
	}

}
