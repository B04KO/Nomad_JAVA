import java.util.Scanner;

public class lab2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length  of cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is\n" + area);
        System.out.println("The volume is\n" + volume);
    }
}
