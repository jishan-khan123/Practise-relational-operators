import java.util.Scanner;

public class day3 {
  public static void main(String[] args) {
    
System.out.println("hello java today we are practise on loops");
        Scanner sc = new Scanner(System.in);
       
        
        // int a = 786;
        // System.out.println(Integer.toBinaryString(a));
        // find number of power 
        System.out.println("enter number");
        int bass = sc.nextInt();
        System.out.println("enter power number");
         int power = sc.nextInt();

         int result =1 ;

         for(int i=1; i<=power;i++){
          result = result * bass ;
        }
        
        System.out.println("Result = " + result);

        
        
        
         
      }
  }





    
    

