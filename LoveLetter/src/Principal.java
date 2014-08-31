 
import java.util.*;


public class Principal {

	public static int num = 0, tokens = 0, token_partida1 = 0, token_partida2 = 0;
	public static String cartasFuera="", nombreCarta="";
	public static void main(String[] args) {
		System.out.println("- = Bienvenido a Love Letter = -");
		System.out.println("(1) Jugar una partida.");
		System.out.println("(2) Seleccionar el numero de tokens a jugar.");
		System.out.println("(3) Mostrar las reglas del juego.");
		System.out.println("(4) Salir.");
		Scanner menu_eleccion = new Scanner(System.in);
		num=menu_eleccion.nextInt();
				if((num>4) || (num<=0)){
					do{
					System.out.println("no ha ingresado ningun valor que este dentro del menu");
					System.exit(1);
					}
					while ((num>4) || (num<=0));
				}else{
						switch (num){
						case 1:
							if(tokens==0) {
								System.out.println("Antes de empezar debe elegir un numero de tokens.");
								Principal.main(null);
							}else{
							System.out.println("ha seleccionado jugar una partida.\nIngrese lo que a continuacion se le pide:");
							   System.out.println("Ingrese su nombre: ");
							   Scanner nom1 = new Scanner(System.in);
							   String usuario = nom1.nextLine();
							   
							   System.out.println("Ingrese el nombre de su rival: ");
							   Scanner nom2 = new Scanner(System.in);
							   String rival = nom2.nextLine();
							   
							   
							   Random aleatorio_juga = new Random();
							   int randomJuga = aleatorio_juga.nextInt(2);
							   randomJuga=randomJuga*10;
							   if (randomJuga==0){
								   System.out.println("Inicia el jugador principal");
							   }else{
								   System.out.println("Inicia el jugador dos (PC)");
							   }
							   
							   
							   //(random para las cartas fuera)//
							   for (int i=0; i<4; i++){
								   Random aleatorio_cartas = new Random();
								   int randomCartas = aleatorio_cartas.nextInt(16);
								   randomCartas=randomCartas;
								   if (i==3){
									   nombreCarta="(?) ???";
									   cartasFuera= cartasFuera + " - " + nombreCarta;
									   
								   }else{
									   if (randomCartas<=4){
										   nombreCarta="(1) Guard";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }else if (randomCartas<=6){
										   nombreCarta="(2) Priest";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }else if (randomCartas<=8){
										   nombreCarta="(3) Baron";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }else if (randomCartas<=10){
										   nombreCarta="(4) Handmaid";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }else if (randomCartas<=12){
										   nombreCarta="(5) Prince";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }else if (randomCartas==13){
										   nombreCarta="(6) King";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }else if (randomCartas==14){
										   nombreCarta="(7) Countess";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }else if (randomCartas==15){
										   nombreCarta="(8) Princess";
										   cartasFuera= cartasFuera + " - " + nombreCarta;
										   
									   }
								   }
							   }
							   System.out.println("Las cartas que estan fuera son:");
							   System.out.println(cartasFuera);
							   
							   
							   
							   
							   ///dentro del ciclo
							   System.out.println(usuario + ": " + token_partida1 + "           " + rival + ": " + token_partida2 );
							}
							   
					    break;
						case 2:
							   System.out.println("ha seleccionado el numero de tokens para jugar.\nEscriba un numero entero de 1 a 3 para el numero de tokens.");
							   Scanner token_num = new Scanner(System.in);
							   tokens=token_num.nextInt();
							   			if ((tokens>3) || (tokens<=0)){
							   				System.out.println("El numero maximo para un token es 3.\nIngrese otro valor.");
								            Principal.main(null);
							   			}else{
							   				switch(tokens){
							   				case 1:
							   					  System.out.println("Para la proxima partida se jugara con 1 token");
							   					  Principal.main(null);
							   				break;
							   				case 2:
							   					  System.out.println("Para la proxima partida se jugara con 2 tokens");
							   					  Principal.main(null);
							   				break;
							   				case 3:
							   					  System.out.println("Para la proxima partida se jugara con 3 tokens");
							   					  Principal.main(null);
							   				break;
							   				}//fin switch tokens
							   			}
						break;
						case 3:
							   System.out.println("A continuacion se muestran las reglas del juego:");
							   System.out.println("(1) Guard:\nPermite adivinar la mano del rival (cartas del 2-8) si adivina,\nel jugador rival sale del juego. (5 en el mazo)");
							   System.out.println("(2) Priest:\nPermite ver la mano del jugador rival. (2 en el mazo)");
							   System.out.println("(3) Baron:\nCompara manos con el rival, el jugador con la carta mas baja sale del juego.\nEn caso de empate no sucede nada. (2 en el mazo)");
							   System.out.println("(4) Handmaid:\nEl jugador que utiliza esta carta es inmune a los ataques\nde los demas por un (1) turno. (2 en el mazo)");
							   System.out.println("(5) Prince:\nPermite “botar” la mano del jugador o la del rival.\nY da una carta nueva del deck. (2 en el mazo)");
							   System.out.println("(6) King:\nIntercambia manos entre jugadores.(1 en el mazo)");
							   System.out.println("(7) Countess:\nSi el jugador tiene un Prince o King en su mano\ny la Countess debe jugar la Countess. (1 en el mazo)");
							   System.out.println("(8) Princess:\nSi el jugador juega esta carta pierde el juego. (1 en el mazo)");
							   Principal.main(null);
						break;
						case 4:
							   System.exit(1);
						break;
						
					} 
					
					
				}
	}
	
}
