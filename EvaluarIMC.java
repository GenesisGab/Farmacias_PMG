
public class EvaluarIMC {


	public void composicionCorporal(double imc) {
		if (imc<18.5) {
			System.out.println("\n�De acuerdo a su IMC Menor a 18.5");
			System.out.println(" Su composici�n corporal es tipo: Peso Inferior al normal");
			
			//DESCRIPCION
			System.out.println("\n�Una persona que est� baja de peso es propensa a tener ");
			System.out.println(" problemas de salud, incluyendo: infertilidad, retrasos en ");
			System.out.println(" el desarrollo, sistema inmunitario debilitado, osteoporosis");
			System.out.println(" desnutirici�n.");
			System.out.println("");
			System.out.println("-----------------------------------------------------");
			System.out.println("ALGUNOS ALIMENTOS RECOMENDADOS PARA SUBIR DE PESO:");
			System.out.println("-----------------------------------------------------");
			
			//INSTANCIAR RECOMENDACIONES
			Recomendaciones recomFaltaPeso = new Recomendaciones();
			recomFaltaPeso.RecomenFaltaPeso();
			
			System.out.println("\nFavor consultar a su medico de confianza para su evaluaci�n clinica");
			
		}if (imc>=18.5 && imc<=24.9) {
			System.out.println("\n�De acuerdo a su IMC Mayor a 18.5:");
			System.out.println(" Su composici�n corporal es tipo: Normal");
			System.out.println("\nFelicitaciones, lo exhortamos a seguir cuidando su salud");
			
		}if (imc>=25.0 && imc<=29.9) {
			System.out.println("\n�De acuerdo a su IMC Mayor a 25.0:");
			System.out.println(" Su composici�n corporal es tipo: Peso Superior al Normal (Sobrepeso)");
			
			//INFORMACION
			System.out.println("\n�Seg�n la OMC el SOBREPESO es un factor de riesgo para numerosas");
			System.out.println(" enfermedades cr�nicas, entre las que se incluyen: La diabetes, las");
			System.out.println(" enfermedades cardiovasculares y el c�ncer.");
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("      Recomendaciones       ");
			System.out.println("----------------------------");

			//INSTANCIAR RECOMENDACIONES
			Recomendaciones recomendarobesidad = new Recomendaciones();
			recomendarobesidad.RecomenSobrePesoYObesidad();
			
			System.out.println("\nFavor consultar a su medico de confianza para su revisi�n clinica");
			
		}if (imc>30) {
			System.out.println("\n�De acuerdo a su IMC Mayor a 30");
			System.out.println("Su composici�n Corporal es tipo: Obesa");
			System.out.println("\n�Seg�n la OMC la OBESIDAD es un factor de riesgo para numerosas");
			System.out.println("enfermedades cr�nicas, entre las que se incluyen: La diabetes, las");
			System.out.println("enfermedades cardiovasculares y el c�ncer.");
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("|     Recomendaciones      |");
			System.out.println("----------------------------");
			
			//INSTANCIAR RECOMENDACIONES
			Recomendaciones recomendarobesidad = new Recomendaciones();
			recomendarobesidad.RecomenSobrePesoYObesidad();
			
			System.out.println("\nFavor consultar a su medico de confianza para su revisi�n clinica");
			
		}
	
	}
	
}
