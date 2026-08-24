
        import java.util.Scanner;
public class Vote{
    public static void main(String[] args) {
        int[] Ages = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of 10 students: ");
        for (int i = 0; i < Ages.length; i++) {
            Ages[i] = input.nextInt();
        }

        for (int i = 0; i < Ages.length; i++) {
            if (Ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (Ages[i] >= 18) {
                System.out.println("Eligible to vote: " + Ages[i]);
            } else {
                System.out.println(" Not Eligible: " + Ages[i]);
            }
        }
    }
}
