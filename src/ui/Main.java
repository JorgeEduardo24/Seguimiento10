package ui;
import java.util.Scanner;
import model.Championship;

public class Main {
    private static Scanner sc;
	private static Championship championship;
	
	public Main() {
	sc= new Scanner(System.in);
	}
                
    public static void main(String[] args) {
	Main ppal= new Main();
	ppal.createChampionship();
    }            

    private void createChampionship() {
        int races, year;

      		System.out.println("Ingrese la informacion del campeonato");
       		System.out.println("Ingrese el año");
                year = sc.nextInt();

        	System.out.println("Ingrese el numero de la carreras en el año");
                races = sc.nextInt();
			String name;
			int age;
			int[] scores = new int[races];
			String team = "";

		sc.nextLine();
	   championship = new Championship(year, races);
	   System.out.println("Ingrese el nombre del piloto");
	   name = sc.nextLine();
	   System.out.println("Ingrese la edad del piloto");
	   age = sc.nextInt(); sc.nextLine();

        	
	
		System.out.println("Seleccione el equipo del piloto\n"+
				"***************SELECCIÓN DE EQUIPO**************** \n"+
				"(1) Si el piloto pertenece al SCUDERIA FERRARI\n"+
				"(2) Si el piloto pertenece al MCLAREN F1 TEAM\n"+
				"(3) Si el piloto pertenece al RED BULL RACING\n"+
				"(4) Si el piloto pertenece al MERCEDES AMG\n"+
				"(5) Si el piloto pertenece al RACING POINT\n"+
				"(6) Si el piloto pertenece al ALFA ROMEO\n"+
				"(7) Si el piloto pertenece al RENAULT\n"+
				"(8) Si el piloto pertenece al WILLIAMS\n");
		
		int selection = sc.nextInt();
		switch (selection){
			case 1:
					team = "SCUDERIAFERRARI";
			break;
			
			case 2:
					team = "MCLARENF1TEAM";
			break;
			
			case 3:
					team = "REDBULLRACING";
			break;
			
			case 4:
					team = "MERCEDESAMG";
			break;
			
			case 5:
					team = "RACINGPOINT";
			break;
			
			case 6:
					team = "ALFAROMEO";
			break;
			
			case 7:
					team = "RENAULT";
			break;
			
			case 8:
					team = "WILLIAMS";
			break;
			
			default: 
			System.out.println("El número ingresado no pertenece a ningún equipo");
		}

		for(int i = 0; i < races; i++){
			System.out.println("Ingrese los tiempos en segundos en la carrera "+(i+1));
			scores[i]=sc.nextInt();
		}

		championship.addPilot(name, age, scores, team);
		System.out.println(championship.showAverageTimes());
	}

    
}
