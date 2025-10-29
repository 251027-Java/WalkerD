import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
        IO.println("Hello World");

        Scanner scan = new Scanner(System.in);
        double grade = 0;
        GradeConverter gc;
        boolean invalidInput = true;

        while (invalidInput){
            try {
                IO.println("Enter value between 0 and 100: ");
                grade = scan.nextDouble();
                if ((grade <= 100) && (grade >= 0)){
                    invalidInput = false;
                } else {
                    IO.println("Value out of range. Try again!");
                }
            } catch (Exception e) {
                System.out.println("Not a number. Try again!");
                scan.nextLine();
            }

        }
        gc = new GradeConverter(grade);
        gc.convert();
        scan.close();

    }
}

