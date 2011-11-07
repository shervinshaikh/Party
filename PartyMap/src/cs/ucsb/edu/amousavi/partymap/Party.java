package cs.ucsb.edu.amousavi.partymap;

import java.util.ArrayList;


public class Party {

	
	String title;
	
	ArrayList<String> comments;
	
	int rating;
	
	int numRating;
	
	int [] coords;
	
	//perhaps this will be used for matching info 
	int partyId;
	
	Party(){
		//to be added
	}
	
	Party(int newRating, ArrayList<String> newComments, int [] newCoords, String newTitle){
		rating = newRating;
		comments = newComments;
		coords = newCoords;
		title = newTitle;
	}
	
	public String getTitle(){
		return title;
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
	
	public String returnInfo(){
		String info = "Rating: "+rating+"\n";
		for(String comment : comments){
			info += comment + "\n\n";
		}
		
		return info;
	}
	
	public int [] getCoords(){
		return coords;
	}
	
}