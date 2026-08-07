import java.util.Scanner;

public class VolumeofCylinder {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = 3.18*radius*radius*height;
        System.out.println("volume: "+volume);
    }
}
