package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;
@Component
public class punto2 {
	private int anio;
	public punto2() {
		// TODO Auto-generated constructor stub
	}
	public punto2(int anio) {
		super();
		this.anio = anio;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String calcularBisiesto () {
		
		if((this.anio % 4 ==0)&&(this.anio % 100 != 0 || this.anio % 400 == 0)) {
			return "es un anio bisiesto" ;
		}
		else {
			return "no es un anio bisiesto";
		}
		
	}
}
