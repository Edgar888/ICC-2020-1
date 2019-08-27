import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {

	String apellidoP;
	String apellidoM;
	String nombre;			//cadenas de nombre y apellidos 
  	byte dia;
	byte mes;
	byte año;  			//fecha de nacimiento 

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Como te llamas?"); 
			System.out.print("Apellido Paterno:");
			apellidoP = teclado.nextLine();
							

			System.out.print("Apellido Materno:");
			apellidoM = teclado.nextLine();

			System.out.print("Nombre:");
			nombre = teclado.nextLine();
						
					/*optener el nombre completo de la persona para, suponiendo 						 * que tiene un solo nombre
 					 */
		System.out.println("Faceha de Nacimiento DD/MM/AA");
			System.out.print("dia:");
			dia = teclado.nextByte();

			System.out.print("mes:");
			mes = teclado.nextByte();

			System.out.print("año:");
			año =teclado.nextByte();
					
					/*con la fecha de nacimiento con byte para que solo se pueda
					 *agregar dos numeros para poder sacar la fecha de 						 *nacimiento con el formato DD/MM/AA    
					 */

		System.out.println("Tu RFC es: " + apellidoP.charAt(0) + apellidoP.charAt(1) + apellidoM.charAt(0) + nombre.charAt(0) + año + mes + dia );	


					/*imprimer el RFC con las variables establecidas de el nombre 						 *completo y con la facha de cumpleaños suponiendo que no 						 *tiene un cero a la izquierda 	
					 */

		
		
	}

}
