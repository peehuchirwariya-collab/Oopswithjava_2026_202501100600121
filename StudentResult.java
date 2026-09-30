//Q.Student Examination Result {
//A university wants to calculate a student's average marks. The program should handle:
//.Marks outsides the range 0-100
//.division by zero when no subject are entered
//. invalid input }
// sol:-
import java.util.Scanner;
public class StudentResult{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the number of subjects: ");
            int n = sc.nextInt();
            if(n <= 0){
                throw new ArithmeticException("No subject entered. Cannot calculate average .");
            }
            int total =0;
            for(int i=1;i<=n;i++){
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = sc.nextInt();
                if(marks < 0 || marks > 100){
                    throw new IllegalArgumentException("Marks should be between 0 and 100.");
                }
                total += marks;
            }
            double average = total/(double)n;
            System.out.println("Total Marks ="+ total);
            System.out.println("Average Marks ="+ average);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}