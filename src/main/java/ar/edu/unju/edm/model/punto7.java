package ar.edu.unju.edm.model;

public class punto7 {
	int num, aux=37;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String secuencia() {
		String resultadoSecuencia="",aux1;
		int i=2;
		for(int j=40;j>0;j--) {
			aux1=String.valueOf(num);
			resultadoSecuencia=resultadoSecuencia+" "+aux1;
			if(aux==0) {
				num=num-aux;
				aux=aux+i;
			}else {
				num=num+aux;
				aux=aux-i;
			}
		}return resultadoSecuencia;
	}
}
