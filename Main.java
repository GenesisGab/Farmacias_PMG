import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
			// DEFINICION VARIABLES
			double libras; //Valor ingresado por usuario en libras
			double metros; //Valor ingresado por usuario en metros
			double kg;     //Conversión de libras a kilogramos
			double imcUsuario;
			
			
			// FORMULA A AUTILIZAR IMC = Kg / Metros Cuadrados 
			
			
			// DATOS INGRESADOS POR EL USUARIO
			System.out.println(" __^__                                      __^__");
			System.out.println("( ___ )------------------------------------( ___ )");
			System.out.println(" | / |           FARMACIAS PMG              | \\ |");
			System.out.println(" | / |  INGRESO DE DATOS PARA CALCULAR EL   | \\ |");
			System.out.println(" |___|    INDICE DE MASA CORPORAL(IMC)      |___| ");
			System.out.println("(_____)------------------------------------(_____)");
			System.out.println();
					
			System.out.print("Ingrese su peso en Libras     ==> ");
			Scanner pesolibras = new Scanner(System.in);
			libras = pesolibras.nextDouble();
				
			System.out.print("Ingrese su estatura en Metros ==> ");
			Scanner estaturaMetros=new Scanner(System.in);		
			metros = estaturaMetros.nextDouble();
			
			
			//Instancia para la conversión de Libras a Kilogramos
			ConversorDeLibrasAKg convertirLibras = new ConversorDeLibrasAKg();
			kg = convertirLibras.ConvertirLibrasAKilogramos(libras);
			
			
			//Instancia para calcular el IMC
			CalcularIMC calculoIMC = new CalcularIMC();
			imcUsuario = calculoIMC.calculoDelIMC(kg,metros);
			
			
			//Impresión del Indice de Masa Corporal
			System.out.println("\n•Su IMC es: "+imcUsuario);
			
			
			//Evaluación del resultado del IMC
			EvaluarIMC evaluacion = new EvaluarIMC();
			evaluacion.composicionCorporal(imcUsuario);
	}

}
