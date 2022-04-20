package ar.edu.unju.edm.model;

public class punto11 {
	int num;
	String aux;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String secuencia() {
		String resultadoSecuencia5=" ";
		do {
			aux=String.valueOf(num);
			resultadoSecuencia5=resultadoSecuencia5+" "+aux;
			num=num-20;
		}while(num>=160);
		return resultadoSecuencia5;
	}
}
