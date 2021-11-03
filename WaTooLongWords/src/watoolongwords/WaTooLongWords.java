/*
 Let's consider a word too long, if its length is strictly more than 10 characters.
All too long words should be replaced with a special abbreviation.
This abbreviation is made like this: we write down the first and the last letter of a word and between them
we write the number of letters between the first and the last letters. 
That number is in decimal system and doesn't contain any leading zeroes.
 */
package watoolongwords;
import java.util.*;

public class WaTooLongWords {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        String st;
        st=sc.nextLine();

      if(st.length()>=10){
          System.out.print(st.charAt(0));
          System.out.print(st.length()-2);
          System.out.println(st.substring(st.length() - 1));
     
      }
       

       
      
      
       
       }
        
        }
        
        
        
    
    

