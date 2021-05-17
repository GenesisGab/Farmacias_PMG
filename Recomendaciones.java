
public class Recomendaciones {

	String recom[] = new String[5];
	String recom1[] = new String[10];
	
	public void RecomenSobrePesoYObesidad(){
	
	recom[0]= "1. Limitar el consumo de alimentos que sean ricos en azucares y grasas";
	recom[1]= "2. Comer varias veces al día fruta y verdura";
	recom[2]= "3. Realizar actividad fisica frecuente: Unos 60 min. para jovenes y 150 mintuos semanales para adulto";
	recom[3]= "4. Deja de fumar";
	recom[4]= "5. Es importante no obsesionarse";
	
	for (int i=0;i<5;i++) {
		System.out.println(recom[i]);
	}		
}
		
	public void RecomenFaltaPeso() {
		recom1[0]="1. Leche";
		recom1[1]="2. Batidos de proteínas";
		recom1[2]="3. Arroz";
		recom1[3]="4. Carnes rojas";
		recom1[4]="5. Nueces y mantequilla de nueces";
		recom1[5]="6. Pan integral";
		recom1[6]="7. Otros almidones, como papas, maiz, etc.";
		recom1[7]="8. Suplementos proteinicos";
		recom1[8]="9. Salmon";
		recom1[9]="10. Huevos";
		
		for (int i=0;i<10;i++) {
			System.out.println(recom1[i]);
		}
	}
	
	
}
