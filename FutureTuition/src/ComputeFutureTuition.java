import java.util.Scanner;
public class ComputeFutureTuition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Starting Tuition: ");
		double StartingTuition = input.nextDouble();
		System.out.print("Rate: ");
		double Rate = input.nextDouble();

        System.out.println("The total cost of 4 years tution");

        for (int i = 0; i < 4; i++) {
        	double AllYearsTuition = StartingTuition*Math.pow(Rate,i);
            System.out.printf("%2d yrs from now: $%5.2f\n", 
                    (i + 1), AllYearsTuition);
        }

	}

}
