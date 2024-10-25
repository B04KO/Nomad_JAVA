import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        double feet;
        double meters;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter  a value for feet: ");
        feet = input.nextDouble();
        meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
