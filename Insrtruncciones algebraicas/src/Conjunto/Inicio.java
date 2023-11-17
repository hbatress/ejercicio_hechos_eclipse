package Conjunto;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String Numero1=null,Numero2=null;
			//String hexNumber = "A1B";
			 System.out.println("Ingrese W1: ");
			 Numero1 = scanner.nextLine();
			 System.out.println("Ingrese W2: ");		 
			Numero2=scanner.nextLine(); 
	
			 String bin1 = Hexadecimal_Binario.conversion(Numero1);
				 
		    String bin2 = Hexadecimal_Binario.conversion(Numero2);
		    System.out.println("El número binario equivalente a " + Numero1 + " es: " + bin1);
		    System.out.println("El número binario equivalente a " + Numero2 + " es: " + bin2);
		    
		    SumaBin binaryAdder = new SumaBin();
	        String result = binaryAdder.addBinaryWithCarry(bin1, bin2);
	        System.out.println(result); // debería imprimir "11000"
	        /*String sum = SumaBin.add(bin1, bin2);
	        System.out.println(sum);
	        */
		    Binario_Hexadecimal converter = new Binario_Hexadecimal(result);

	        String NumHexa = converter.convertToHexadecimal();
	        
	        System.out.println(NumHexa);
	
	        scanner.close();
	}

}
