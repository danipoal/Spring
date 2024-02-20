package es.pildoras.pruebaanotations;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaanotations")
@PropertySource("classpath:application.properties")
public class EmpleadosConfig {
	
	//Definir el Bean para uso InformeFinanciero DTO COmpras
	@Bean //Esto es ID BEAN
	public CreacionInformeFinanciero informeFinancieroDtoCompras(){
		
		return new InformeFinancieroDtoCompras();
	}
	
	//2- definir Bean Director financiero e inyectar dpdencias
	@Bean //Esto BEAN Inyectado
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
