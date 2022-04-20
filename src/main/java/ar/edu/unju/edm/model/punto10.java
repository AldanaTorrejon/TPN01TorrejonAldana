package ar.edu.unju.edm.model;

public class punto10 {
	int num;
	String aux;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String secuencia() {
		String resultadoSecuencia4=" ";
		while(num>=160) {
			aux=String.valueOf(num);
			resultadoSecuencia4=resultadoSecuencia4+" "+aux;
			num=num-20;
		}return resultadoSecuencia4;
	}
}
