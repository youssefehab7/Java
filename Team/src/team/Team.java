/*

 */
package team;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int rounds=sc.nextInt();
         int answers=0;
        for(int x=0;x<rounds;x++){
        System.out.println("Insert only 1 or 0");
        
        System.out.println("first opinion");
        int a=sc.nextInt();
        System.out.println("second opinion");
        int b=sc.nextInt();
        System.out.println("third opinion");
        int c=sc.nextInt();
        
        if(a>1 || b>1 || c>1){
            break;
        }
        sum=a+b+c;
        if(sum>=2){
            answers++;
            
        }
     
        }
        
        System.out.println("viene accettato "+answers);
        

    }

}
