package Ajedrez;

import processing.core.PApplet;

public class Tablero extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Ajedrez.Tablero");
    }

    @Override
    public void settings() {
        size(800,800);        
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        
    /**
     * tomando en cuenta que el plano carteciano empieza en la parte 
     * superior izquierda con coordenadas 0,0 siendo x , y   
     * primer 0 se mueve de en el eje de las y 
     * segundo 0 se mueve en ele de las x 
     * los siguentes dos valores son el tamaño del cuadro
     */ 

     int x = 800;
     int y = 800;

     for(int i=0; i<(x/8); i++){
        for(int k=0; k<(y/8); k++){
            if ((i%2 != 0 && k%2 !=0) || (i%2 == 0 && k%2 == 0)){
               fill(0xFFFFFFFF); 
            } else {
                fill(0xFF000000); 
              }
            rect(k * (x/8), i * (y/8), x/8, y/8);
        }   
      
     }

       
      
      


      

      
      
      

    }

}
