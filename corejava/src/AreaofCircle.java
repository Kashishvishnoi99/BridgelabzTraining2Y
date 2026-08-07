import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double Area = 3.18 * radius*radius;
        System.out.println("Area: "+Area);
    }
}
