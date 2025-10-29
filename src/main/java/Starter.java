import java.util.Scanner;

public class Starter {

    public static void main(String[] args){
        IO.println("Hello World");

        Scanner scan = new Scanner(System.in);
        double grade;
        GradeConverter gc;

        IO.println("Enter your number grade: ");
        try {
            grade = scan.nextDouble();
            gc = new GradeConverter(grade);
            gc.convert();
        } catch (Exception e){
            System.out.println("Not a number. Try again!");
        }
    }
}
