package cs.ucsb.edu.amousavi.partymap;

import java.util.ArrayList;


public class Party {

	
	ArrayList<String> comments;
	
	int rating;
	
	int numRating;
	
	int [] coords;
	
	//perhaps this will be used for matching info 
	int partyId;
	
	Party(){
		//to be added
	}
	
	Party(int newRating, ArrayList<String> newComments, int [] newCoords){
		rating = newRating;
		comments = newComments;
		coords = newCoords;
	}
	
	void addMod(PartyModifier mod){
		
		int newRating;
		newRating = mod.getRating();
		rating = (rating*numRating + newRating)/(numRating+1);
		
		comments.add(mod.getComment());
		
	}
	
	void spawn(PartySpawn spawn){
		coords = spawn.getCoords();
	
	}
	
	void setId(int newId){
		partyId = newId;
		
	}
	
	int getId(){
		return partyId;
	}
	
	
}
