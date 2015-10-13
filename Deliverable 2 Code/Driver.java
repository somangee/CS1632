import java.util.Random;

public class Driver{
	Random randNumSeed;
	Random randNum;
	int location, randSeed, viaStreet;
	String[][] streets = {{"Fourth Ave.", "Meow St."}, {"Chirp St.", "Fourth Ave."}, {"Meow St.", "Fifth Ave."}, {"Chirp St.", "Fifth Ave."}, {"Fourth Ave.", "Fifth Ave."}};
	int[][] possibleTravelLoc = {{1, 2}, {3, 4}, {0, 4}, {1, 2}, {0, 3}};
	String street = "";

	public Driver(int seed){
		randNum = new Random();
		randNumSeed = new Random(seed);
		randSeed = randNumSeed.nextInt(2);
	}
	public int firstLocation(){
		location = randNum.nextInt(5);
		return location;
	}

	public int newLocation(){
		outerloop:
		for(int x = 0; x<5; x++){
			for(int y = 0; y<2; y++){
				if(randSeed == y && location == x){
					location = possibleTravelLoc[x][y];
					break outerloop;
				}
			}
		}
		return location;
	}

	public String streetDriven(){
		outerloop2:
		for(int x = 0; x<5; x++){
			for(int y = 0; y<2; y++){
				if(randSeed == y && location == x){
					street = streets[x][y];
					break outerloop2;
				}
			}
		}
		return street;
	}
	
	public int returnLocation(){
		return location;
	}
	public String returnStreet(){
		return street;
	}
}