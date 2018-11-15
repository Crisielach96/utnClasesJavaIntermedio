package com.utn.clase3Bis;

import java.util.Calendar;

public class Fecha {

	private int dia, mes, a�o;
	
	
	

	public Fecha(int dia, int mes, int a�o) {
		
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		
		
		if (!fechaCorrecta()) {
			Calendar fechaSistema = Calendar.getInstance();
			setDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
			setMes(fechaSistema.get(Calendar.MONTH));
			setA�o(fechaSistema.get(Calendar.YEAR));
			
			
		}
		
		
	}
	
	

	private boolean esBisiesto() {

		return ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0)));
	}

	// sobrecarga de metodo Asignar fecha
	public void asignarFecha() {
		// este metodo asigna la fecha del sistema
		Calendar fechaSistema = Calendar.getInstance();
		setDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
		setMes(fechaSistema.get(Calendar.MONTH));
		setA�o(fechaSistema.get(Calendar.YEAR));

	}

	// primer metodo sobrecargado
	public void asignarFecha(int d) {
		Calendar fechaSistema = Calendar.getInstance();
		setDia(d);
		setMes(fechaSistema.get(Calendar.MONTH));
		setA�o(fechaSistema.get(Calendar.YEAR));

	}

	// segundo metodo sobrecargado
	public void asignarFecha(int d, int m) {
		Calendar fechaSistema = Calendar.getInstance();
		setDia(d);
		setMes(m);
		setA�o(fechaSistema.get(Calendar.YEAR));

	}

	// segundo metodo sobrecargado
	public void asignarFecha(int d, int m ,int a) {
		
		setDia(d);
		setMes(m);
		setA�o(a);

	}
	
	public boolean fechaCorrecta() {
		boolean diaCorrecto ,mesCorrecto , anyoCorrecto;
		anyoCorrecto = (a�o > 0);
		mesCorrecto = ((mes >= 1 ) && (mes <=12));
		
		switch (mes) {
		case 2:
			if(esBisiesto())
				diaCorrecto =(dia >=1 && dia <= 29);
			else {
				diaCorrecto =(dia >=1 && dia <= 28);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto =(dia >=1 && dia <= 30);
			break;

		default:
			
			diaCorrecto =(dia >=1 && dia <= 31);
			break;
			
		
		}
		return diaCorrecto && mesCorrecto && anyoCorrecto;
		
		
	}

	// get and set
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
}
