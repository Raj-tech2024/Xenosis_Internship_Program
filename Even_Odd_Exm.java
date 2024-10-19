import java.util.Scanner;

public class Even_Odd_Exm {
    public static void main(String[] args) {
        int number;

        //Take Input From The User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want:");
        number = sc.nextInt();

        //Check Condition for Even or Odd
        if(number%2==0)
        {
            System.out.println("Given number is even number:");
        }else
        {
            System.out.println("Given number is odd number");
        }
    }
}
