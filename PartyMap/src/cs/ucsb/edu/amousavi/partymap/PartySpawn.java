package cs.ucsb.edu.amousavi.partymap;
public class PartySpawn {

	int xcoords;
	int ycoords;
	int[] getCoords(){
		int[] coords = new int[2];
		coords[0]=xcoords;
		coords[1]=ycoords;
		return coords;
	}
	
}
