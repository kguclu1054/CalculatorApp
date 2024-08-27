package main;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calculatorapp calculatorapp = new Calculatorapp();

		 System.out.print("Operatör girin (+, -, *, /): ");
	     String operator = scanner.next();
	     
	     System.out.print("İlk sayıyı girin: ");
	      int firstNumber = scanner.nextInt();
	        
	     System.out.print("İlk sayıyı girin: ");
	     int secondNumber = scanner.nextInt();
	     
	     int result;
	     
	     switch(operator) {
	         case "+" :
	        	 result = Calculatorapp.ekle(firstNumber, secondNumber);
	        	 break;
	         case "-" :
	        	 result = Calculatorapp.cikart(firstNumber, secondNumber);
	        	 break;
	         case "*" :
	        	 result = Calculatorapp.carpma(firstNumber, secondNumber);
	        	 break;
	         case "/" :
	        	 result = Calculatorapp.bölme(firstNumber, secondNumber);
	             break;
	         default: System.out.println("Geçersiz operatör!");
	         return;
	     }
	     
	     System.out.println("Sonuç " + result);
	     
	}
	

}

class Calculatorapp{
	
	public static int ekle(int a, int b) {
		int topla = a + b;
		return topla;
	}
	
	public static int cikart(int a, int b) {
		if(a < b) {
			System.out.println("a-b den küçüktür geçersiz işlem");
			return 0;
		}else {
			int cikar = a - b;
			return cikar;
		}
	}
	
	public static int carpma(int a, int b) {
		int carp = a * b;
		return carp;
	}
	
	public static int bölme(int a, int b) {
		if(b == 0) {
			System.out.println("sayı 0 a bölünmez");
			return 0;
		}
		
		int böl = a / b;
		return böl;
	}	
	
}
