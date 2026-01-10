import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {

        System.out.println("hello today we are working on relational operators");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1, 2 or 3: ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                
                System.out.println("hey");
                break;
            default:
                System.out.println("noty boy");
        }
    }
}

