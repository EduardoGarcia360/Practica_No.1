 
import java.util.Random;
import java.util.Scanner;


public class Principal {

	public static int num=0, tokens=0, token_usuario=0, token_rival=0, card1=0, card2=0, card3=0, card4=0, c2=0, c3=0, c4=0, a=0, gpc=0;
	public static int cTotales=16, cRestantes=16, cM1=0, cM2=0, CardmanoU1=0, CardmanoR1=0, CardmanoU2=0, CardmanoR2=0, guardpc=-1;
	public static int cNU1=0, cNU2=0, cNR1=0, cNR2=0, UCard=0, turno=0, toke=0, guardeleccion=0, princeeleccion=0, Carta_usada=-1;
	public static int cemU1=-1, cemU2=-1, cemU3=-1, cemU4=-1, cemU5=-1, cemU6=-1, cemR1=-1, cemR2=-1, cemR3=-1, cemR4=-1, cemR5=-1, cemR6=-1;
	public static String nombreCarta="", cartasFuera="", nomCard1="", nomCard2="", nomCard3="", nomCard4="";
	public static String nomCardmanoR1="", nomCardmanoU1="", nomCardmanoR2="", nomCardmanoU2="", nomTemporal="";
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
										   System.out.println("Inicia " + usuario + " usuario.");
										   a=2;
									   }else if(randomJugador==1){
										   System.out.println("Inicia " + rival + " rival(pc)");
										   a=3;
									   }
									   
									   //inicia
									   Principal.Cartasdescartadas();
									   System.out.println("las cartas fuera son: " + nomCard1 + nomCard2 + nomCard3 + nomCard4);
									   //fin
									   
									   //inicia
									   Principal.Primeramano();
									   //inicia for principal
										for(toke=0;toke<tokens;toke++){
											if(toke<tokens){
												System.out.println(usuario + ": " + token_usuario + " tokens. " + rival + ": " + token_rival + " tokens." );
												for(turno=a; turno<20; turno++){
														if(turno%2==0){
															if(nomCardmanoU1==""){
																 Principal.NuevacartaU1();
																 System.out.println("el estado del mazo restante es: " + cRestantes + " carta(s).");
															}else if(nomCardmanoU2==""){
																Principal.NuevacartaU2();
																System.out.println("el estado del mazo restante es: " + cRestantes + " carta(s).");
															}
															System.out.println("el rival tiene en su mano: " + nomCardmanoR1 + " , " + nomCardmanoR2);
															System.out.println("--------------------------------------------------------");
															System.out.println("tienes en tu mano: " + nomCardmanoU1 + " , " + nomCardmanoU2);
															System.out.println("(1) usar carta#1\n(2) usar carta#2\n(3) termina el juego");
															Principal.TurnoUsuario();
															turno=turno+20;
														}else if(turno%2==1){
															if(nomCardmanoR1==""){
																Principal.NuevacartaR1();
																System.out.println("el estado del mazo restante es: " + cRestantes + " carta(s).");
															} else if(nomCardmanoR2==""){
																Principal.NuevacartaR2();
																System.out.println("el estado del mazo restante es: " + cRestantes + " carta(s).");
															}
															System.out.println("el rival tiene en su mano: " + nomCardmanoR1 + " , " + nomCardmanoR2);
															System.out.println("--------------------------------------------------------");
															System.out.println("tienes en tu mano: " + nomCardmanoU1 + " , " + nomCardmanoU2);
															System.out.println("(1) usar carta#1\n(2) usar carta#2\n(3) termina el juego");
															Principal.TurnoRival();
														}
												}//fin for para turnos
												
											}
										}//fin for principal
										if(token_usuario < token_rival){
											System.out.println("el rival ha ganado el favor de la princesa");
											System.exit(1);
										}else if(token_usuario > token_rival){
											System.out.println("el usuario ha ganado el favor de la princesa");
											System.exit(1);
										}else if(token_usuario==token_rival){
											System.out.println("Ha habido un empate");
											System.exit(1);
										}
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
	private static void TurnoRival() {
		Random aleatorio_cartarival = new Random();
		int aleatoriorival = aleatorio_cartarival.nextInt(2);
		switch (aleatoriorival){
		case 0:
			Principal.CondicionesCartaR1();
		break;
		case 1:
			System.out.println("almenos entro aqui2");
			turno=turno+20;
		break;
		}
	}
	private static void CondicionesCartaR1() {
		if((CardmanoR1>=0) & (CardmanoR1<=4)){
			System.out.println("la pc trata de divinar alguna de tus cartas");
			Random aleatorio_guardpc = new Random();
			guardpc = aleatorio_guardpc.nextInt(8);
			Principal.CartaGuardR1();
			turno=turno+20;
		}
		if((CardmanoR1==5) || (CardmanoR1==6)){
			System.out.println("la pc ha visto tus cartas");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoR1;
			nomCardmanoR1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}
		if((CardmanoR1==7) || (CardmanoR1==8)){
			Principal.CartaBaronR1();
			turno=turno+20;
		}
		if((CardmanoR1==9) || (CardmanoR1==10)){
			System.out.println("protegido");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoR1;
			nomCardmanoR1="";
			Principal.CementerioRival();
			turno=turno+20;
		}
		if((CardmanoR1==11) || (CardmanoR1==12)){
			Random prince_pcrandom = new Random();
			int princepcrandom = prince_pcrandom.nextInt(2);
			switch (princepcrandom){
			case 0:
				System.out.println("la pc ha elegido botar tu mano");
				cRestantes=cRestantes-1;
				nomCardmanoU1="";
				nomCardmanoU2="";
				Carta_usada=CardmanoU1;
				Principal.CementerioUsuario();
				Carta_usada=CardmanoU2;
				Principal.CementerioUsuario();
				Principal.NuevacartaU1();
				turno=turno+20;
			break;
			case 1:
				System.out.println("la pc ha elegido botar su propia mano");
				cRestantes=cRestantes-1;
				nomCardmanoR1="";
				nomCardmanoR2="";
				Carta_usada=CardmanoR1;
				Principal.CementerioRival();
				Carta_usada=CardmanoR2;
				Principal.CementerioRival();
				Principal.NuevacartaR1();
				turno=turno+20;
			break;
			}
		}
		if(CardmanoR1==13){
			System.out.println("se van a intercambiar manos entre jugadores.");
			nomTemporal=nomCardmanoR1;
			nomCardmanoR1=nomCardmanoU1;
			nomCardmanoU1=nomTemporal;
			
			nomTemporal=nomCardmanoR2;
			nomCardmanoR2=nomCardmanoU2;
			nomCardmanoU2=nomTemporal;
			turno=turno+20;
		}
		if(CardmanoR1==14){
			System.out.println("la pc ha usado a la countess");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoR1;
			Principal.CementerioRival();
			turno=turno+20;
		}	
		if(CardmanoR1==15){
			System.out.println("la pc ha jugado a la princes. usuario es el ganador");
			token_usuario=token_usuario+1;
			turno=turno+1;
		}
	}
	private static void CartaBaronR1() {
		Random aleatorio_baronpc = new Random();
		int baronpc = aleatorio_baronpc.nextInt(8);
		switch (baronpc){
		case 0:
			if((CardmanoU1>=5) || (CardmanoU2>=5)){
				System.out.println("gano el usuario la pc tiene la menor carta");
				token_usuario=token_usuario+1;
			}else{
				System.out.println("empate no paso nada");
			}
			Carta_usada=CardmanoR1;
			cRestantes=cRestantes-1;
			nomCardmanoR1="";
			Principal.CementerioRival();
		break;
		case 1:
			if((CardmanoU1>=7) || (CardmanoU2>=7)){
				System.out.println("gano el usuario la pc tiene la menor carta");
				token_usuario=token_usuario+1;
				
			}else if((CardmanoU1<=4) || (CardmanoU2<=4)){
				System.out.println("gano la pc");
				token_rival=token_rival+1;
				
			}else {
				System.out.println("empate nada ha pasado");
				
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoR1;
			nomCardmanoR1="";
			Principal.CementerioRival();
		break;
		case 2:
			if((CardmanoU1>=9) || (CardmanoU2>=9)){
				System.out.println("gano el usuario la pc tiene la menor carta");
				token_usuario=token_usuario+1;
				
			}else if((CardmanoU1<=6) || (CardmanoU2<=6)){
				System.out.println("gano la pc");
				token_rival=token_rival+1;
				
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoR1;
			nomCardmanoR1="";
			Principal.CementerioRival();
		break;
		case 3:
			if((CardmanoU1>=11) || (CardmanoU2>=11)){
				System.out.println("gano el usuario la pc tiene la menor carta");
				token_usuario=token_usuario+1;
			}else if((CardmanoU1<=8) || (CardmanoU2<=8)){
				System.out.println("gano la pc");
				token_rival=token_rival+1;
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoR1;
			nomCardmanoR1="";
			Principal.CementerioRival();
		break;
		case 4://prince
			if((CardmanoR1>=13) || (CardmanoR2>=13)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				
			}else if((CardmanoR1<=10) || (CardmanoR2<=10)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
		break;
		case 5://king
		break;
		case 6://countess
		break;
		case 7://princess
		break;
		}
		
	}
	private static void CartaGuardR1() {
		do{
			Random aleatorio_guardpc = new Random();
			guardpc = aleatorio_guardpc.nextInt(8);
			if(guardpc==0){
				gpc=gpc-1;
			}else{
				gpc=gpc+10;
			}
		}
		while(gpc < 1);
		switch (guardpc){
		case 1:
			if((CardmanoU1==5) || (CardmanoU2==5) || (CardmanoU1==6) || (CardmanoU2==6)){
				System.out.println("la pc adivino tu carta tienes un pries");
				token_rival=token_rival+1;
				
			}else{
				System.out.println("la pc fallo, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoR1;
				nomCardmanoR1="";
				Principal.CementerioRival();
		break;
		case 2:
			if((CardmanoU1==7) || (CardmanoU2==7) || (CardmanoU1==8) || (CardmanoU2==8)){
				System.out.println("la pc adivino tu carta tienes un baron");
				token_rival=token_rival+1;
				
			}else{
				System.out.println("la pc fallo, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoR1;
				nomCardmanoR1="";
				Principal.CementerioRival();
		break;
		case 3:
			if((CardmanoU1==9) || (CardmanoU2==9) || (CardmanoU1==10) || (CardmanoU2==10)){
				System.out.println("la pc adivino tu carta tienes un handmaid");
				token_rival=token_rival+1;
				
			}else{
				System.out.println("la pc fallo, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoR1;
				nomCardmanoR1="";
				Principal.CementerioRival();
		break;
		case 4:
			if((CardmanoU1==11) || (CardmanoU2==11) || (CardmanoU1==12) || (CardmanoU2==12)){
				System.out.println("la pc adivino tu carta tienes un prince");
				token_rival=token_rival+1;
				
			}else{
				System.out.println("la pc fallo, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoR1;
				nomCardmanoR1="";
				Principal.CementerioRival();
		break;
		case 5:
			if((CardmanoU1==13) || (CardmanoU2==13)){
				System.out.println("la pc adivino tu carta tienes un king");
				token_rival=token_rival+1;
				
			}else{
				System.out.println("la pc fallo, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoR1;
				nomCardmanoR1="";
				Principal.CementerioRival();
		break;
		case 6:
			if((CardmanoU1==14) || (CardmanoU2==14)){
				System.out.println("la pc adivino tu carta tienes un countess");
				token_rival=token_rival+1;
				
			}else{
				System.out.println("la pc fallo, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoR1;
				nomCardmanoR1="";
				Principal.CementerioRival();
		break;
		case 7:
			if((CardmanoU1==15) || (CardmanoU2==15)){
				System.out.println("la pc adivino tu carta tienes la princess");
				token_rival=token_rival+1;
				
			}else{
				System.out.println("la pc fallo, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoR1;
				nomCardmanoR1="";
				Principal.CementerioRival();
		break;
		}
		
	}
	private static void TurnoUsuario() {
			System.out.println("ingrese algo para empezar:");
			Scanner U_eleccion = new Scanner(System.in);
			UCard = U_eleccion.nextInt();
		switch (UCard) {
			case 1:
				Principal.CondicionesCartaU1();
		    break;
			case 2:
				Principal.CondicionesCartaU2();
			break;
			case 3:
				System.out.println("te has rendido ha ganado la pc");
				token_rival=token_rival+1;
				turno=turno+20;
		    break;
		}
	}
	private static void CondicionesCartaU2() {
		if((CardmanoU2>=0) & (CardmanoU2<=4)){
			System.out.println("elija la carta que cree usted que tiene el rival");
			System.out.println("ingresando el numero correspondiente");
			System.out.println("(2) Priest - (3) Baron - (4) Handmaid - (5) Prince - (6) King - (7) Countess - (8) Princess");
			Scanner guard_eleccion = new Scanner(System.in);
			guardeleccion = guard_eleccion.nextInt();
			Principal.CartaGuardU2();
		}
		if((CardmanoU2==5) || (CardmanoU2==6)){
			System.out.println("las cartas del rival ya las puedes ver");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}
		if((CardmanoU2==7) || (CardmanoU2==8)){
			Principal.CartaBaronU2();
		}
		if((CardmanoU2==9) || (CardmanoU2==10)){
			System.out.println("protegido");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}
		if((CardmanoU2==11) || (CardmanoU2==12)){
			System.out.println("ingrese (1) para botar su mano. ingrese (2) para botar la mano del rival.");
			Scanner prince_eleccion = new Scanner(System.in);
			princeeleccion = prince_eleccion.nextInt();
			if(princeeleccion==1){
				cRestantes=cRestantes-1;
				nomCardmanoU1="";
				nomCardmanoU2="";
				Carta_usada=CardmanoU1;
				Principal.CementerioUsuario();
				Carta_usada=CardmanoU2;
				Principal.CementerioUsuario();
				Principal.NuevacartaU1();
			}else if(princeeleccion==2){
				cRestantes=cRestantes-1;
				nomCardmanoR1="";
				nomCardmanoR2="";
				Carta_usada=CardmanoR1;
				Principal.CementerioRival();
				Carta_usada=CardmanoR2;
				Principal.CementerioRival();
				Principal.NuevacartaR1();
			}
		}
		if(CardmanoU2==13){
			System.out.println("se van a intercambiar manos entre jugadores.");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU1=nomCardmanoR1;
			nomCardmanoU2=nomCardmanoR2;
			nomCardmanoR1=nomCardmanoU1;
			nomCardmanoR2=nomCardmanoU2;
			Principal.CementerioUsuario();
		}
		if(CardmanoU2==14){
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			Principal.CementerioUsuario();
		}
		if(CardmanoU2==15){
			System.out.println("has jugado a la princess perdiste el juego gana el rival");
			turno=turno+20;
		}
		
	}
	private static void CartaBaronU2() {
		if(CardmanoU1<5){
			if((CardmanoR1>=5) || (CardmanoR2>=5)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else{
				System.out.println("empate no paso nada");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU1<7){
			if((CardmanoR1>=7) || (CardmanoR2>=7)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else if((CardmanoR1<=4) || (CardmanoR2<=4)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU1<9){
			if((CardmanoR1>=9) || (CardmanoR2>=9)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else if((CardmanoR1<=6) || (CardmanoR2<=6)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU1<11){
			if((CardmanoR1>=11) || (CardmanoR2>=11)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else if((CardmanoR1<=8) || (CardmanoR2<=8)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU1<13){
			if((CardmanoR1>=13) || (CardmanoR2>=13)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else if((CardmanoR1<=10) || (CardmanoR2<=10)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU1==13){
			if((CardmanoR1>=14) || (CardmanoR2>=14)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else if((CardmanoR1<=12) || (CardmanoR2<=12)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU1==14){
			if((CardmanoR1==15) || (CardmanoR2==15)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else if((CardmanoR1<=13) || (CardmanoR2<=13)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU1==15){
			System.out.println("gana el usuario");
			token_usuario=token_usuario+1;
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU2;
			nomCardmanoU2="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}
	}
	private static void CartaGuardU2() {
		if(guardeleccion==2){
			if((CardmanoR1==5) || (CardmanoR2==5) || (CardmanoR1==6) || (CardmanoR2==6)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU2;
				nomCardmanoU2="";
				Principal.CementerioUsuario();
		}else if(guardeleccion==3){
			if((CardmanoR1==7) || (CardmanoR2==7) || (CardmanoR1==8) || (CardmanoR2==8)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU2;
				nomCardmanoU2="";
				Principal.CementerioUsuario();
		}else if(guardeleccion==4){
			if((CardmanoR1==9) || (CardmanoR2==9) || (CardmanoR1==10) || (CardmanoR2==10)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU2;
				nomCardmanoU2="";
				Principal.CementerioUsuario();
		}else if(guardeleccion==5){
			if((CardmanoR1==11) || (CardmanoR2==11) || (CardmanoR1==12) || (CardmanoR2==12)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU2;
				nomCardmanoU2="";
				Principal.CementerioUsuario();
		}else if(guardeleccion==6){
			if((CardmanoR1==13) || (CardmanoR2==13)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU2;
				nomCardmanoU2="";
				Principal.CementerioUsuario();
		}else if(guardeleccion==7){
			if((CardmanoR1==14) || (CardmanoR2==14)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU2;
				nomCardmanoU2="";
				Principal.CementerioUsuario();
		}else if(guardeleccion==8){
			if((CardmanoR1==15) || (CardmanoR2==15)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				turno=turno+20;
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU2;
				nomCardmanoU2="";
				Principal.CementerioUsuario();
		}
		
	}
	private static void CondicionesCartaU1() {
		if((CardmanoU1>=0) & (CardmanoU1<=4)){
			System.out.println("elija la carta que cree usted que tiene el rival");
			System.out.println("ingresando el numero correspondiente");
			System.out.println("(2) Priest - (3) Baron - (4) Handmaid - (5) Prince - (6) King - (7) Countess - (8) Princess");
			Scanner guard_eleccion = new Scanner(System.in);
			guardeleccion = guard_eleccion.nextInt();
			Principal.CartaGuardU1();
		}
		if((CardmanoU1==5) || (CardmanoU1==6)){
			System.out.println("las cartas del rival ya las puedes ver");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}
		if((CardmanoU1==7) || (CardmanoU1==8)){
			Principal.CartaBaronU1();
		}
		if((CardmanoU1==9) || (CardmanoU1==10)){
			System.out.println("protegido");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}
		if((CardmanoU1==11) || (CardmanoU1==12)){
			System.out.println("ingrese (1) para botar su mano. ingrese (2) para botar la mano del rival.");
			Scanner prince_eleccion = new Scanner(System.in);
			princeeleccion = prince_eleccion.nextInt();
			if(princeeleccion==1){
				cRestantes=cRestantes-1;
				nomCardmanoU1="";
				nomCardmanoU2="";
				Carta_usada=CardmanoU1;
				Principal.CementerioUsuario();
				Carta_usada=CardmanoU2;
				Principal.CementerioUsuario();
				Principal.NuevacartaU1();
			}else if(princeeleccion==2){
				cRestantes=cRestantes-1;
				nomCardmanoR1="";
				nomCardmanoR2="";
				Carta_usada=CardmanoR1;
				Principal.CementerioRival();
				Carta_usada=CardmanoR2;
				Principal.CementerioRival();
				Principal.NuevacartaR1();
			}
			turno=turno+20;
		}
		if(CardmanoU1==13){
			System.out.println("se van a intercambiar manos entre jugadores.");
			nomTemporal=nomCardmanoU1;
			nomCardmanoU1=nomCardmanoR1;
			nomCardmanoR1=nomTemporal;
			
			nomTemporal=nomCardmanoU2;
			nomCardmanoU2=nomCardmanoR2;
			nomCardmanoR2=nomTemporal;
			turno=turno+20;
		}
		if(CardmanoU1==14){
			System.out.println("has usado a la countess");
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			Principal.CementerioUsuario();
			turno=turno+20;
		}
		if(CardmanoU1==15){
			System.out.println("has jugado a la princess perdiste el juego gana el rival");
			token_rival=token_rival+1;
			turno=turno+20;
		}
		
	}
	private static void CartaBaronU1() {
		if(CardmanoU2<5){
			if((CardmanoR1>=5) || (CardmanoR2>=5)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				turno=turno+20;
			}else{
				System.out.println("empate no paso nada");
			}
			Carta_usada=CardmanoU1;
			cRestantes=cRestantes-1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}else
		if(CardmanoU2<7){
			if((CardmanoR1>=7) || (CardmanoR2>=7)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				
			}else if((CardmanoR1<=4) || (CardmanoR2<=4)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				
			}else {
				System.out.println("empate nada ha pasado");
				
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}else
		if(CardmanoU2<9){ //baron
			if((CardmanoR1>=9) || (CardmanoR2>=9)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				
			}else if((CardmanoR1<=6) || (CardmanoR2<=6)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}else
		if(CardmanoU2<11){ //handmaid
			if((CardmanoR1>=11) || (CardmanoR2>=11)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				
			}else if((CardmanoR1<=8) || (CardmanoR2<=8)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}else
		if(CardmanoU2<13){ //prince
			if((CardmanoR1>=13) || (CardmanoR2>=13)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				
			}else if((CardmanoR1<=10) || (CardmanoR2<=10)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}else
		if(CardmanoU2==13){ //king
			if((CardmanoR1>=14) || (CardmanoR2>=14)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				
			}else if((CardmanoR1<=12) || (CardmanoR2<=12)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}else
		if(CardmanoU2==14){ //princess
			if((CardmanoR1==15) || (CardmanoR2==15)){
				System.out.println("gano el rival");
				token_rival=token_rival+1;
				
			}else if((CardmanoR1<=13) || (CardmanoR2<=13)){
				System.out.println("gana el usuario");
				token_usuario=token_usuario+1;
				
			}else {
				System.out.println("empate nada ha pasado");
			}
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
		}else
		if(CardmanoU2==15){
			System.out.println("gana el usuario");
			token_usuario=token_usuario+1;
			cRestantes=cRestantes-1;
			Carta_usada=CardmanoU1;
			nomCardmanoU1="";
			Principal.CementerioUsuario();
			turno=turno+20;
		}
		
	}
	private static void CartaGuardU1() {
		if(guardeleccion==2){
			if((CardmanoR1==5) || (CardmanoR2==5) || (CardmanoR1==6) || (CardmanoR2==6)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU1;
				nomCardmanoU1="";
				Principal.CementerioUsuario();
				turno=turno+20;
		}else if(guardeleccion==3){
			if((CardmanoR1==7) || (CardmanoR2==7) || (CardmanoR1==8) || (CardmanoR2==8)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU1;
				nomCardmanoU1="";
				Principal.CementerioUsuario();
				turno=turno+20;
		}else if(guardeleccion==4){
			if((CardmanoR1==9) || (CardmanoR2==9) || (CardmanoR1==10) || (CardmanoR2==10)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU1;
				nomCardmanoU1="";
				Principal.CementerioUsuario();
				turno=turno+20;
		}else if(guardeleccion==5){
			if((CardmanoR1==11) || (CardmanoR2==11) || (CardmanoR1==12) || (CardmanoR2==12)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU1;
				nomCardmanoU1="";
				Principal.CementerioUsuario();
				turno=turno+20;
		}else if(guardeleccion==6){
			if((CardmanoR1==13) || (CardmanoR2==13)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU1;
				nomCardmanoU1="";
				Principal.CementerioUsuario();
				turno=turno+20;
		}else if(guardeleccion==7){
			if((CardmanoR1==14) || (CardmanoR2==14)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU1;
				nomCardmanoU1="";
				Principal.CementerioUsuario();
				turno=turno+20;
		}else if(guardeleccion==8){
			if((CardmanoR1==15) || (CardmanoR2==15)){
				System.out.println("el ganador es el usuario");
				token_usuario=token_usuario+1;
				
			}else{
				System.out.println("el rival no tiene esa carta, nada ha pasado");
			}
				cRestantes=cRestantes-1;
				Carta_usada=CardmanoU1;
				nomCardmanoU1="";
				Principal.CementerioUsuario();
				turno=turno+20;
		}
	}
 	private static void CementerioRival() {
		if (cemR1==-1){
			cemR1=Carta_usada;
		}else if(cemR2==-1){
			cemR2=Carta_usada;
		}else if(cemR3==-1){
			cemR3=Carta_usada;
		}else if(cemR4==-1){
			cemR4=Carta_usada;
		}else if(cemR5==-1){
			cemR5=Carta_usada;
		}else if(cemR6==-1){
			cemR6=Carta_usada;
		}
	}
	private static void CementerioUsuario() {
		if (cemU1==-1){
			cemU1=Carta_usada;
		}else if(cemU2==-1){
			cemU2=Carta_usada;
		}else if(cemU3==-1){
			cemU3=Carta_usada;
		}else if(cemU4==-1){
			cemU4=Carta_usada;
		}else if(cemU5==-1){
			cemU5=Carta_usada;
		}else if(cemU6==-1){
			cemU6=Carta_usada;
		}
	}
	private static void NuevacartaR2() {
		do{
			Random nuevacartaR2 = new Random();
			int nuevaCR2 = nuevacartaR2.nextInt(cTotales);
			if((nuevaCR2==card1) || (nuevaCR2==card2) || (nuevaCR2==card3) || (nuevaCR2==card4) || (nuevaCR2==CardmanoU1) || (nuevaCR2==CardmanoU2) || (nuevaCR2==CardmanoR1)){
				cNR2=cNR2-1;
			}else{
				if (nuevaCR2<5){
					CardmanoR2=nuevaCR2;
					nomCardmanoR2="(1) Guard";
				}else if(nuevaCR2<7){
					CardmanoR2=nuevaCR2;
					nomCardmanoR2="(2) Priest";
				}else if(nuevaCR2<9){
					CardmanoR2=nuevaCR2;
					nomCardmanoR2="(3) Baron";
				}else if(nuevaCR2<11){
					CardmanoR2=nuevaCR2;
					nomCardmanoR2="(4) Handmaid";
				}else if(nuevaCR2<13){
					CardmanoR2=nuevaCR2;
					nomCardmanoR2="(5) Prince";
				}else if(nuevaCR2==13){
					CardmanoR2=nuevaCR2;
					nomCardmanoR2="(6) King";
				}else if(nuevaCR2==14){
					CardmanoR2=nuevaCR2;
					nomCardmanoR2="(7) Countess";
				}else if(nuevaCR2==15){
					CardmanoR2=nuevaCR2;
					nomCardmanoU1="(8) Princess";
				}
				cRestantes=cRestantes-1;
				cNR1=cNR1+10;
			}
		}
		while(cNR2<1);
	}
	private static void NuevacartaR1() {
		do{
			Random nuevacartaR1 = new Random();
			int nuevaCR1 = nuevacartaR1.nextInt(cTotales);
			if((nuevaCR1==card1) || (nuevaCR1==card2) || (nuevaCR1==card3) || (nuevaCR1==card4) || (nuevaCR1==CardmanoU1) || (nuevaCR1==CardmanoU2) || (nuevaCR1==CardmanoR2)){
				cNR1=cNR1-1;
			}else{
				if (nuevaCR1<5){
					CardmanoR1=nuevaCR1;
					nomCardmanoR1="(1) Guard";
				}else if(nuevaCR1<7){
					CardmanoR1=nuevaCR1;
					nomCardmanoR1="(2) Priest";
				}else if(nuevaCR1<9){
					CardmanoR1=nuevaCR1;
					nomCardmanoR1="(3) Baron";
				}else if(nuevaCR1<11){
					CardmanoR1=nuevaCR1;
					nomCardmanoR1="(4) Handmaid";
				}else if(nuevaCR1<13){
					CardmanoR1=nuevaCR1;
					nomCardmanoR1="(5) Prince";
				}else if(nuevaCR1==13){
					CardmanoR1=nuevaCR1;
					nomCardmanoR1="(6) King";
				}else if(nuevaCR1==14){
					CardmanoR1=nuevaCR1;
					nomCardmanoR1="(7) Countess";
				}else if(nuevaCR1==15){
					CardmanoR1=nuevaCR1;
					nomCardmanoU1="(8) Princess";
				}
				cRestantes=cRestantes-1;
				cNR1=cNR1+10;
			}
		}
		while (cNR1<1);
	}
	private static void NuevacartaU2() {
		do{
			Random nuevacartaU2 = new Random();
			int nuevaCU2 = nuevacartaU2.nextInt(cTotales);
			if((nuevaCU2==card1) || (nuevaCU2==card2) || (nuevaCU2==card3) || (nuevaCU2==card4) || (nuevaCU2==CardmanoU1) || (nuevaCU2==CardmanoR1) || (nuevaCU2==CardmanoR2)){
				cNU2=cNU2-1;
			}else{
				if (nuevaCU2<5){
					CardmanoU2=nuevaCU2;
					nomCardmanoU2="(1) Guard";
				}else if(nuevaCU2<7){
					CardmanoU2=nuevaCU2;
					nomCardmanoU2="(2) Priest";
				}else if(nuevaCU2<9){
					CardmanoU2=nuevaCU2;
					nomCardmanoU2="(3) Baron";
				}else if(nuevaCU2<11){
					CardmanoU2=nuevaCU2;
					nomCardmanoU2="(4) Handmaid";
				}else if(nuevaCU2<13){
					CardmanoU2=nuevaCU2;
					nomCardmanoU2="(5) Prince";
				}else if(nuevaCU2==13){
					CardmanoU2=nuevaCU2;
					nomCardmanoU2="(6) King";
				}else if(nuevaCU2==14){
					CardmanoU2=nuevaCU2;
					nomCardmanoU2="(7) Countess";
				}else if(nuevaCU2==15){
					CardmanoU2=nuevaCU2;
					nomCardmanoU1="(8) Princess";
				}
				cRestantes=cRestantes-1;
				cNU2=cNU2+10;
			}
		}
		while (cNU2<1);
	}
	private static void NuevacartaU1() {
		do{
			Random nuevacartaU1 = new Random();
			int nuevaCU1 = nuevacartaU1.nextInt(cTotales);
			if((nuevaCU1==card1) || (nuevaCU1==card2) || (nuevaCU1==card3) || (nuevaCU1==card4) || (nuevaCU1==CardmanoU2) || (nuevaCU1==CardmanoR1) || (nuevaCU1==CardmanoR2)){
				cNU1=cNU1-1;
			}else{
				if (nuevaCU1<5){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(1) Guard";
				}else if(nuevaCU1<7){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(2) Priest";
				}else if(nuevaCU1<9){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(3) Baron";
				}else if(nuevaCU1<11){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(4) Handmaid";
				}else if(nuevaCU1<13){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(5) Prince";
				}else if(nuevaCU1==13){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(6) King";
				}else if(nuevaCU1==14){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(7) Countess";
				}else if(nuevaCU1==15){
					CardmanoU1=nuevaCU1;
					nomCardmanoU1="(8) Princess";
				}
				cRestantes=cRestantes-1;
				cNU1=cNU1+10;
			}
		}
		while(cNU1<1);
	}
	private static void Primeramano() {
		for(int conteoMano=0; conteoMano<2; conteoMano++){
			if(conteoMano==0){
				do{
					Random aleatorio_mano = new Random();
					int randomMano = aleatorio_mano.nextInt(cTotales);
					if ((randomMano==card1) || (randomMano==card2) || (randomMano==card3) || (randomMano==card4)){
						cM1=cM1-1;
					}else{
						if (randomMano<5){
							CardmanoU1=randomMano;
							nomCardmanoU1="(1) Guard";
						}else if(randomMano<7){
							CardmanoU1=randomMano;
							nomCardmanoU1="(2) Priest";
						}else if(randomMano<9){
							CardmanoU1=randomMano;
							nomCardmanoU1="(3) Baron";
						}else if(randomMano<11){
							CardmanoU1=randomMano;
							nomCardmanoU1="(4) Handmaid";
						}else if(randomMano<13){
							CardmanoU1=randomMano;
							nomCardmanoU1="(5) Prince";
						}else if(randomMano==13){
							CardmanoU1=randomMano;
							nomCardmanoU1="(6) King";
						}else if(randomMano==14){
							CardmanoU1=randomMano;
							nomCardmanoU1="(7) Countess";
						}else if(randomMano==15){
							CardmanoU1=randomMano;
							nomCardmanoU1="(8) Princess";
						}
						cRestantes=cRestantes-1;
						cM1=cM1+20;
					}//(fin else)\\
				}
				while(cM1<1);
			}else if(conteoMano==1){
				do{
					Random aleatorio_mano = new Random();
					int randomMano = aleatorio_mano.nextInt(cTotales);
					if ((randomMano==card1) || (randomMano==card2) || (randomMano==card3) || (randomMano==card4) || (randomMano==CardmanoU1)){
						cM2=cM2-1;
					}else{
						if (randomMano<5){
							CardmanoR1=randomMano;
							nomCardmanoR1="(1) Guard";
						}else if(randomMano<7){
							CardmanoR1=randomMano;
							nomCardmanoR1="(2) Priest";
						}else if(randomMano<9){
							CardmanoR1=randomMano;
							nomCardmanoR1="(3) Baron";
						}else if(randomMano<11){
							CardmanoR1=randomMano;
							nomCardmanoR1="(4) Handmaid";
						}else if(randomMano<13){
							CardmanoR1=randomMano;
							nomCardmanoR1="(5) Prince";
						}else if(randomMano==13){
							CardmanoR1=randomMano;
							nomCardmanoR1="(6) King";
						}else if(randomMano==14){
							CardmanoR1=randomMano;
							nomCardmanoR1="(7) Countess";
						}else if(randomMano==15){
							CardmanoR1=randomMano;
							nomCardmanoR1="(8) Princess";
						}
						cRestantes=cRestantes-1;
						cM2=cM2+20;
					}//(fin else)\\
				}
				while (cM2<1);
			}//(fin else conteomanoigual a 1)\\
		}
	}
	private static void Cartasdescartadas() {
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
				   cRestantes=cRestantes-1;
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
						   cRestantes=cRestantes-1;
						   c2=c2+20;
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
						   cRestantes=cRestantes-1;
						   c3=c3+20;
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
						   cRestantes=cRestantes-1;
						   c4=c4+20;
					   }
				   }
				   while(c4<1);
			   } //(fin si i=3)\\
		} 
	}
	
}//finclase
