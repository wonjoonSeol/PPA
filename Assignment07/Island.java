import java.util.Random;

/** PPA Assignment 7 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models island with treasures buried in one of its locations
 */
public class Island {
	private String name;
	private TreasureChest[] locations;
	
	/**
         * method Island constructs with name and locations of treasure chests when initialised
         */		
	public Island(String name, TreasureChest[] locations){
		this.name = name;
		Random rnd = new Random();
		int random = rnd.nextInt(locations.length); 

		locations[random] = new TreasureChest();
		this.locations = locations;
	}
	
	/**
         * method getName returns name
         */		
	public String getName(){
		return name;
	}
	
	/**
         * method getLocation returns locations
         */		
	public TreasureChest[] getLocation(){
		return locations;
	}
	
	/**
         * method dig supplied location index and return chest if exists
         */		
	public TreasureChest dig(int i){
		if (i <= locations.length) {
			if (locations[i] != null){
				TreasureChest chest = locations[i];
				locations[i] =  null;
				return chest;		
			}else{
				return null;
			}
		}else{
			return null;			
		}
	}
}
