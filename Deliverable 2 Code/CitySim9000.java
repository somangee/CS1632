import java.util.Scanner;

public class CitySim9000{

	public static void main(String[] args){
		int drivers = 0;
		String[] locationName = {"Mall", "Bookstore", "Coffee Shop", "University", "Outside City"};
		
		if (args.length == 0 || args.length > 1 || !isInteger(args[0], 10)){
			System.out.println("Please type a single integer to pass as an argument. This will correspond to the seed passed to the random number generator.");
			System.exit(0);
		}
		
		while(drivers < 5){
			Driver d = new Driver(Integer.parseInt(args[0]));
			d.firstLocation();
			do{
				System.out.print("Driver "+drivers+" heading from " +locationName[d.returnLocation()]+ " to ");
				//Change location.
				d.newLocation();
				d.streetDriven();
				System.out.print(locationName[d.returnLocation()]+" via "+d.returnStreet()+"\n");
			}while(d.returnLocation() != 4);
			System.out.print("Driver "+drivers+" has left the city!\n-----\n");
			drivers++;
		}

	}

	//Is used to check if value is an int by using Scanner and checking if the element is a valid digit for the radix
	private static boolean isInteger(String s, int radix){
		Scanner scan = new Scanner(s.trim());
    	if(!scan.hasNextInt(radix)) return false;
    	scan.nextInt(radix);
    	return !scan.hasNext();
	}

}