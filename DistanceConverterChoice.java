import java.util.Scanner;

public class DistanceConverterChoice {
	public static void main(String[] args) {
		double Distance;
		double FinalDistance;
		int Choice;
		
		Scanner in = new Scanner(System.in);
		
		Choice = 0;
		
		while (Choice != 9)
		{
			System.out.println("Welcome to my program!");
			System.out.println("If you want to convert to Kilometers please press (1).");
			System.out.println("If you want to convert to Miles please press (2).");
			System.out.println("To exit please press (9).");
			Choice = in.nextInt();
			System.out.println();
		
			if (Choice ==1)
			{	
				System.out.println("Please enter your distance in miles: ");
				Distance = in.nextDouble();
				System.out.println();
				FinalDistance = (Distance * 1.609);
				System.out.print(Distance +" miles is ");
				System.out.printf("%.4f", FinalDistance);
				System.out.println("km\n");
			}
			
			else if (Choice == 2)
			{
				System.out.println("Please enter your distance in KM: ");
				Distance = in.nextDouble();
				System.out.println();
				FinalDistance = (Distance * 0.621);
				System.out.print(Distance +"KM is ");
				System.out.printf("%.4f", FinalDistance);
				System.out.println("miles\n");
			}
		
		}
		
	}
}