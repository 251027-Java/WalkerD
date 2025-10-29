public class GradeConverter {

    public double grade;

    public GradeConverter(double grade){
        this.grade = grade;
    }

    public void convert(){
        if (grade <= 100 && grade >= 90){
            IO.println("Your letter grade is 'A'!");
        } else if (grade <= 89 && grade >= 80){
            IO.println("Your letter grade is 'B'!");
        } else if (grade <= 79 && grade >= 70){
            IO.println("Your letter grade is 'C'!");
        } else if (grade <= 69 && grade >= 60) {
            IO.println("Your letter grade is 'D'!");
        } else {
            IO.println("Your letter grade is 'F'!");
        }
    }
}
