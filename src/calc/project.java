package calc;
import java.util.*;

public class project {
	static double resultado; 
	public static void main(String[] args) {
		   
		Scanner scanner=new Scanner(System.in);
		System.out.println ("Digite o 1º número:  ");
		double num1=scanner.nextDouble();
		System.out.println ("Digite o 2º número ");
		double num2=scanner.nextDouble();
		System.out.print("Escolha uma das opções: \n 01: Somar \n 02: Subtrair \n 03: Multiplicar  \n 04: Dividir: \n Opção escolhida: ");
		int num3= scanner.nextInt();

		switch (num3)
		{

		    case 1:
		        resultado = num1+num2;
		        break;
		    case 2:
		        resultado = num1-num2;
		        break;
		    case 3:
		        resultado = num1*num2;
		        break;
		    case 4:
		        resultado = num1/num2;
		        break;
		        
		}
		System.out.println("Resultado igual a: "+ resultado);

}
}
