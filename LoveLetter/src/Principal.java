
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		int num = 0, tokens=0;
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
			num=menu_eleccion.nextInt();
			}
			while ((num>4) || (num<=0));
			
		}else{
			
		switch (num){
		case 1:
			if(tokens==0){
				
					System.out.println("Antes de iniciar debe ingresar un numero de tokens.");
					num=menu_eleccion.nextInt();
				
			}else{
			System.out.println("ha seleccionado jugar una partida.\nIngrese lo que a continuacion se le pide:");
			   System.out.println("Ingrese su nombre: ");
			   Scanner nom1 = new Scanner(System.in);
			   String usuario = nom1.nextLine();
			   
			   System.out.println("Ingrese el nombre de su rival: ");
			   Scanner nom2 = new Scanner(System.in);
			   String rival = nom2.nextLine();
			   
			}//fin else   
	    break;
		case 2:
			   System.out.println("ha seleccionado el numero de tokens para jugar.\nEscriba un numero entero de 1 a 3 para el numero de tokens.");
			   Scanner token_num = new Scanner(System.in);
			   tokens=token_num.nextInt();
			   			if ((tokens>3) || (tokens<=0)){
			   				do{
			   				System.out.println("El numero maximo para un token es 3.\nIngrese otro valor.");
				            tokens=token_num.nextInt();
			   				}
			   				while ((tokens>3) || (tokens<=0));
			   			}else{
			   				switch(tokens){
			   				case 1:
			   					  System.out.println("Para la proxima partida se jugara con 1 token");
			   					  
			   				break;
			   				case 2:
			   					  System.out.println("Para la proxima partida se jugara con 2 tokens");
			   				break;
			   				case 3:
			   					  System.out.println("Para la proxima partida se jugara con 3 tokens");
			   				break;
			   				}//fin switch tokens
			   			}
		break;
		case 3:
			   System.out.println("A continuacion se muestran las reglas del juego:");
			   
		break;
		case 4:
			   System.exit(1);
		break;
		} //fin switch
		}//fin else
		
	}



}
