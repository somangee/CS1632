import java.util.Random;

public class Driver{
	Random randNumSeed;
	Random randNum;
	int location, randSeed, viaStreet;
	String[][] streets = {{"Fourth Ave.", "Meow St."}, {"Chirp St.", "Fourth Ave."}, {"Meow St.", "Fifth Ave."}, {"Chirp St.", "Fifth Ave."}, {"Fourth Ave.", "Fifth Ave."}};
	int[][] possibleTravelLoc = {{1, 2}, {3, 4}, {0, 4}, {1, 2}, {0, 3}};
	String street;

	public Driver(int seed){
		randNum = new Random();
		randNumSeed = new Random(seed);
		location = randNum.nextInt(5);
		randSeed = randNumSeed.nextInt(2);
	}

	public void newLocation(){
		outerloop:
		for(int x = 0; x<5; x++){
			for(int y = 0; y<2; y++){
				if(randSeed == y && location == x){
					location = possibleTravelLoc[x][y];
					street = streets[x][y];
					break outerloop;
				}
			}
		}

	}
	
	public int returnLocation(){
		return location;
	}
	public String returnStreet(){
		return street;
	}
}