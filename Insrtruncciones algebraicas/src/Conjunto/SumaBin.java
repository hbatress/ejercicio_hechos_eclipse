package Conjunto;

public class SumaBin {
	/*
	public static String add(String binary1, String binary2) {
        // Añadir ceros a la izquierda para que ambos números tengan la misma longitud
        int maxLength = Math.max(binary1.length(), binary2.length());
        binary1 = "0".repeat(maxLength - binary1.length()) + binary1;
        binary2 = "0".repeat(maxLength - binary2.length()) + binary2;
        
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = maxLength-1; i >= 0; i--) {
            int digit1 = binary1.charAt(i) - '0';
            int digit2 = binary2.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.insert(0, carry);
        }
        
        return result.toString();
    }
    
    
    */
    public static String addBinaryWithCarry(String binary1, String binary2) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        // asegurarse de que ambos números binarios tengan la misma cantidad de dígitos
        while (binary1.length() < binary2.length()) {
            binary1 = "0" + binary1;
        }
        while (binary2.length() < binary1.length()) {
            binary2 = "0" + binary2;
        }
        
        // sumar los números binarios con acarreo
        for (int i = binary1.length() - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(binary1.charAt(i));
            int bit2 = Character.getNumericValue(binary2.charAt(i));
            int sum = bit1 + bit2 + carry;
            carry = 0;
            if (sum > 1) {
                carry = 1;
                sum = sum - 2;
            }
            result.append(sum);
        }
        
        // agregar el acarreo final, si es necesario
        if (carry == 1) {
            result.append(carry);
        }
        
        // invertir el resultado y devolverlo como una cadena de caracteres
        return result.reverse().toString();
    }
}
