 public class HeyJude{
         

   public static void main(String[] args) {
  	
  
         String h = ("Hey Jude ");
         String d = ("don't ");
         String m = ("make it bad ");
         String t = ("take a sad song and make it better ");
         String b = ("be afraid ");
         String y = ("you were made to go out and get her ");
         String l = ("let me down ");
         String y2 = ("you have found her, now go and get her ");
 
         String r = ("remember to ");
         String l2 = ("let her into you heart ");
         String l3 = ("let her under you skin ");

         String t2 = ("then you ");
         String c = ("can start ");
         String bx = ("begin ");
         String t3 = ("to make it better ");

         String b2 = ("better ");
         String b22 = ("better, oh"); 
         String n = ("na ");

         int i = 0;
         int k = 0;
      while (i < 13){
       	 
       	 
       	   if (i == 0 || i == 2 || i == 6 || i==10 ) {
       	 	System.out.print (h);
       	    }

           if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11){
            System.out.println ("     ");
          }

          if (i==0 || i ==10){
            System.out.println (d + m);
           }   

           if (i == 0 || i == 10){
          System.out.println (t);
            } 

          if (i == 2){
            System.out.println(d + b);
           }

          if (i == 6){
            System.out.println(d + l);
          }

          if (i == 2 || i == 6){
            System.out.println(y);
           }
           
          if (i == 0 || i == 6){
          System.out.println(r + l2);
            }

          if (i== 2 || i== 10 ){
            System.out.println(r + l3);
           }      	   
       	   
       	   if (i == 0 || i == 2 || i == 6 || i == 10 ){
       	   	System.out.print(t2);
           }

       	   if (i == 0 || i == 6){
       	   	System.out.println(c + t3);
           }

       	   
       	   if (i== 2 || i== 10){
       	   	System.out.println(bx + t3 );
           }

           
           if (i== 4 || i == 8|| i ==10 || i == 12){ 
            while (k<10){ 
              System.out.print( n );
              k++;
            } 
            k = 0;            
            }

            if (i == 10 ){
            System.out.println ( b22);
           }

           if (i == 12){
            System.out.println (n + h);
           } 





       	     
	
       	   	
       	   
       	   



       	  
       	  
 			i++;
       	}
    }

 

 }