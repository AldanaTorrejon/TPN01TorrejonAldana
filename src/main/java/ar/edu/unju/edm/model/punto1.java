package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;

@Component
public class punto1 {
	//atributos
	private Integer num1;
	
	//constructores
	public punto1() {
		// TODO Auto-generated constructor stub
	}
	public punto1(Integer num1) {
		super();
		this.num1 = num1;
	}
	//getter y setter
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	//otros metodos
	public int resolverFactorial(){
		int num=1;
		
		for( int i = 1; i == num1; i++) {
			num*= i;
		} 
		return num;
	}
}
