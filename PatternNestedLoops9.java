import java.util.Scanner;

public class PatternNestedLoops9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}