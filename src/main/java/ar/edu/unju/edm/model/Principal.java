package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;
@Component
public class Principal {
	  int num;
	  public void setNum(int num) {
	    this.num = num;
	  }
	  public int getNum() {
	    return num;
	  }
	  public int main(){
	    int fact=1;
	    while(num!=0){
	      fact=fact*num;
	      num--;
	    }return fact;
	 }
}
