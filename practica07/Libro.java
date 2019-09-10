/**
 * almacena la descripcion de un libro 
 * @author Ecgar Montiel Ledesma 
 * @version 1.0
 */
public class Libro{

	     public String titulo; // guarda el titulo del libro
    	 public String autor; //guarda el autor del libro 
    	 public String adp; // guarda el año de publicacion del libro 


    public Libro (){
		this.titulo = "etc"; 
    	this.autor = " " ; 
    	this.adp = "0"     ;
	} //aqui se le asegna por defaul a la bariable 

	public Libro (String titulo, String autor, String adp){
		this.titulo = titulo;
        this.autor = autor;
        this.adp = adp;
	}



    	  
	


}