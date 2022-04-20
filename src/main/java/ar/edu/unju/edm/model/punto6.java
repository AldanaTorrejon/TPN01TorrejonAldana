package ar.edu.unju.edm.model;

public class punto6 {
	int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String nota() {
		String resultado;
		if(num==6) {
			resultado="Alumno regularizado";
		}else {
			if(num>7 && num<=10) {
				resultado="El alumno promociona";
			}else {
				if(num<6 && num>=1) {
					resultado="El alumno desaprueba";
				}else {
					resultado="Valor no permitido";
				}
			}
		}return resultado;
	}
}
