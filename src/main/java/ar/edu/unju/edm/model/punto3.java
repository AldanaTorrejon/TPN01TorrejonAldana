package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;
@Component
public class punto3 {
	int num; 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String par() {
		String resultado;
		if(num%2==0) {
			resultado="Es par";
		}else {
			resultado="Es impar";
		}return resultado;
	}
}
