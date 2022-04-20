package ar.edu.unju.edm.model;

public class punto9 {
	int num; 
	String aux;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String secuencia(){
		String resultadoSecuencia3=" ";
		for(int i=20;num>=160;num=num-i){
			aux=String.valueOf(num);
			resultadoSecuencia3= resultadoSecuencia3 + " " + aux;
		}return resultadoSecuencia3;
	}
}
