package es.pildoras.pruebaanotations;

import org.springframework.stereotype.Component;

@Component("x2")
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación Informe Financiero en trim1";
	}

}
