import java.net.Socket;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {

        System.out.println("hello today we are working on relational operators");

        Scanner sc = new Scanner(System.in);
        // switch (a) {
        //     case 1:
        //         System.out.println("hi");
        //         break;
        //     case 2:7
        //         System.out.println("hello");
        //         break;
        //     case 3:
                
        //         System.out.println("hey");
        //         break;
        //     default:
        //         System.out.println("noty boy");
      
                 switch (a) {   
                    // case 1:System.out.println("Monday");
                    //     break;
                    //     case 2:System.out.println("Tuesday");
                    //     break;
                    //     case 3:System.out.println("wednesday");
                    //     break;
                    //     case 4:System.out.println("Thursday");
                    //     break;
                    //     case 5:System.out.println("Friday");
                    //     break;
                    //     case 6:System.out.println("Saturday");
                    //     break;
                    //     case 7:System.out.println("Sunday");
                    //     break; 
                    //     default: System.out.println("invalid days");
                    //     break;
                 }

                    System.out.print("Enter A,E,I,O,U:");
                     char ch  = sc.next().charAt(0);

                         System.out.print("Enter A,E,I,O,U: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");

        }
    }

   }
