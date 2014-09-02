 
import java.util.*;


public class Principal {

	public static int num=0, tokens=0, token_usuario=0, token_rival=0, card1=0, card2=0, card3=0, card4=0, c2=0, c3=0, c4=0;
	public static String nombreCarta="", cartasFuera="", nomCard1="", nomCard2="", nomCard3="", nomCard4="";
	public static void main(String[] args) {
		System.out.println("- = Bienvenido a Love Letter = -");
		System.out.println("(1) Jugar una partida.");
		System.out.println("(2) Seleccionar el numero de tokens a jugar.");
		System.out.println("(3) Mostrar las reglas del juego.");
		System.out.println("(4) Salir.");
		Scanner menu_eleccion = new Scanner(System.in);
		num=menu_eleccion.nextInt();
				if((num>4) || (num<=0)){
					System.out.println("no ha ingresado ningun valor que este dentro del menu");
					System.exit(1);
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
									   Random aleatorio_jugador = new Random();
									   int randomJugador = aleatorio_jugador.nextInt(2);
									   if (randomJugador==0){
										   System.out.println("Inicia el usuariol");
									   }else if(randomJugador==1){
										   System.out.println("Inicia el rival (PC)");
									   }
							   //(inicia ciclo para quitar 4 cartas)\\
									   for (int i=0; i<4; i++){
										   Random aleatorio_cartas = new Random();
										   int randomCartas = aleatorio_cartas.nextInt(16);
										   if (i==0){
											   if (randomCartas<=4){
												   nomCard1="(1) Guard";
												   card1=randomCartas;
											   }else if(randomCartas<=6){
												   nomCard1="(2) Priest";
												   card1=randomCartas;
											   }else if(randomCartas<=8){
												   nomCard1="(3) Baron";
												   card1=randomCartas;
											   }else if(randomCartas<=10){
												   nomCard1="(4) Handmaid";
												   card1=randomCartas;
											   }else if(randomCartas<=12){
												   nomCard1="(5) Prince";
												   card1=randomCartas;
											   }else if(randomCartas==13){
												   nomCard1="(6) King";
												   card1=randomCartas;
											   }else if(randomCartas==14){
												   nomCard1="(7) Countess";
												   card1=randomCartas;
											   }else if(randomCartas==15){
												   nomCard1="(8) Princess";
												   card1=randomCartas;
											   }
										   }else if(i==1){//(fin if I=0)\\
											   do{
												   Random aleatorio_card2 = new Random();
												   int randomCard2 = aleatorio_card2.nextInt(15);
												   if(card1==randomCard2){
													   c2=c2-1;
												   }else{
													   if(randomCard2<=4){
														   nomCard2="(1) Guard";
														   card2=randomCard2;
													   }else if(randomCard2<=6){
														   nomCard2="(2) Priest";
														   card2=randomCard2;
													   }else if(randomCard2<=8){
														   nomCard2="(3) Baron";
														   card2=randomCard2;
													   }else if(randomCard2<=10){
														   nomCard2="(4) Handmaid";
														   card2=randomCard2;
													   }else if(randomCard2<=12){
														   nomCard2="(5) Prince";
														   card2=randomCard2;
													   }else if(randomCard2==13){
														   nomCard2="(6) King";
														   card2=randomCard2;
													   }else if(randomCard2==14){
														   nomCard2="(7) Countess";
														   card2=randomCard2;
													   }
													   c2=c2+1;
												   }
											   }
											   while (c2<1);					   
										   }else if(i==2){ //(Fin si i=1)\\
											   do{
												   Random aleatorio_card3 = new Random();
												   int randomCard3 = aleatorio_card3.nextInt(14);
												   if((card1==randomCard3) || (card2==randomCard3)){
													   c3=c3-1;
												   }else{
													   if(randomCard3<=4){
														   nomCard3="(1) Guard";
														   card3=randomCard3;
													   }else if(randomCard3<=6){
														   nomCard3="(2) Priest";
														   card3=randomCard3;
													   }else if(randomCard3<=8){
														   nomCard3="(3) Baron";
														   card3=randomCard3;
													   }else if(randomCard3<=10){
														   nomCard3="(4) Handmaid";
														   card3=randomCard3;
													   }else if(randomCard3<=12){
														   nomCard3="(5) Prince";
														   card3=randomCard3;
													   }else if(randomCard3==13){
														   nomCard3="(6) King";
														   card3=randomCard3;
													   }
													   c3=c3+1;
												   }
											   }
											   while(c3<1);
										   }else if(i==3){ //(fin si i=2)\\
											   do{
												   Random aleatorio_card4 = new Random();
												   int randomCard4 = aleatorio_card4.nextInt(13);
												   if((card1==randomCard4) || (card2==randomCard4) || (card3==randomCard4)){
													   c4=c4-1;
												   }else{
													   if(randomCard4<=4){
														   nomCard4="(1) Guard";
														   card4=randomCard4;
													   }else if(randomCard4<=6){
														   nomCard4="(2) Priest";
														   card4=randomCard4;
													   }else if(randomCard4<=8){
														   nomCard4="(3) Baron";
														   card4=randomCard4;
													   }else if(randomCard4<=10){
														   nomCard4="(4) Handmaid";
														   card4=randomCard4;
													   }else if(randomCard4<=12){
														   nomCard4="(5) Prince";
														   card4=randomCard4;
													   }
													   c4=c4+1;
												   }
												   
											   }
											   while(c4<1);
										   } //(fin si i=3)\\
									} //(fin ciclo for)\\
							 System.out.println("las cartas fuera son: " + nomCard1 + nomCard2 + nomCard3 + nomCard4);

							   
							   
							   
							   
							   ///dentro del ciclo
							   System.out.println(usuario + ": " + token_usuario + "           " + rival + ": " + token_rival );
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
						
					} //(fin swich menu)\\
					
					
				}
	}
	
}
