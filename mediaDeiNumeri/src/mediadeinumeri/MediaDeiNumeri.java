
package mediadeinumeri;
import java.util.ArrayList;
import java.util.Scanner;
public class MediaDeiNumeri {

    
    public static void main(String[] args) {
       int dec = 1;
       int somma=0;
       int cont=0;
       int media;
       
       Scanner sc =new Scanner (System.in);
       
       ArrayList <Integer> voti = new ArrayList<Integer>();
       
       while(dec == 1){
       
      System.out.println("inserisce il numero ");
     
       voti.add(sc.nextInt());
       somma=somma+voti.get(cont);
       System.out.println("vuole continuare");
       dec=sc.nextInt();
       
       cont++;
           
       }
       media=somma/voti.size();
       System.out.println(media);
    }
    
}
