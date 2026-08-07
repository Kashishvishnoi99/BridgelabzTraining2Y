import java.util.Scanner;

public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers:2 ");
        double Kilometers = sc.nextDouble();
        double Miles = Kilometers * 0.621371;
        System.out.println("Kilometers to Miles is : "+Miles);
    }
}
