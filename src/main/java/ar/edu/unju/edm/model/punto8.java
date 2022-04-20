package ar.edu.unju.edm.model;

public class punto8 {
	int num;
	String aux;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String secuencia() {
		String resultadoSecuencia2=" ";
		do {
			num=num+4;
			aux=String.valueOf(num);
			resultadoSecuencia2=resultadoSecuencia2+" "+aux;
		}while(num<100);
		return resultadoSecuencia2;
	}
}
