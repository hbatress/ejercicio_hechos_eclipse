package Conjunto;

public class Binario_Hexadecimal {

    private String binaryNumber;
    
    public Binario_Hexadecimal() {
       
    } 
    public Binario_Hexadecimal(String binaryNumber) {
        this.binaryNumber = binaryNumber;
    }
    
    
    public String convertToHexadecimal() {
        // Añadir ceros a la izquierda para que la longitud sea múltiplo de 4
        int missingZeros = binaryNumber.length() % 4;
        if (missingZeros != 0) {
            binaryNumber = "0".repeat(4 - missingZeros) + binaryNumber;
        }
        
        // Dividir en grupos de 4 y convertir a hexadecimal
        StringBuilder hexNumber = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String group = binaryNumber.substring(i, i+4);
            int decimalValue = Integer.parseInt(group, 2);
            hexNumber.append(Integer.toHexString(decimalValue));
        }
        
        return hexNumber.toString();
    }
	
	
}
