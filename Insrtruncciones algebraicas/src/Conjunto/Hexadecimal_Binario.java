package Conjunto;
import java.math.BigInteger;

public class Hexadecimal_Binario {

	//private String numero;
	
	public Hexadecimal_Binario() {
		
	}
	public static String  conversion(String numero) {
		
		BigInteger decimalNumber = new BigInteger(numero, 16); 
        return decimalNumber.toString(2); 
	}
	
	


}

