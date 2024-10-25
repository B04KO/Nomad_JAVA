import java.util.Scanner;

public class lab2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double new_gratuity = subtotal * (gratuity / 100);
        double  total = subtotal + new_gratuity;
        System.out.print(" The gratuity is $" + new_gratuity + " and total is $" + total);


    }
}
