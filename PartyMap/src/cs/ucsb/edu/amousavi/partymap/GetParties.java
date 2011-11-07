package cs.ucsb.edu.amousavi.partymap;

import java.util.ArrayList;

public class GetParties {
	
	ArrayList<Party> parties;
	
	public GetParties(){
		//int newRating, ArrayList<String> newComments, int [] newCoords, String newTitle
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("this party sucks massive $!@&");
		c1.add("people doing coke everywhere");
		c1.add("theres a dead stripper in the closet!");
		int[] cd1 = new int[2];
		cd1[0] = 34409587;
		cd1[1] = -119860279;
		Party n1 = new Party(3, c1, cd1, "6643 DP");
		parties.add(n1);
		
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("f&*k b!tc#es, get money!");
		c2.add("want beer? they have plenty");
		c2.add("2 keeeeeeegggggsss!!!!");
		int[] cd2 = new int[2];
		cd2[0] = 34409118;
		cd2[1] = -119856076;
		Party n2 = new Party(8, c2, cd2, "6549 DP");
		parties.add(n2);
		
		ArrayList<String> c3 = new ArrayList<String>();
		c3.add("pu$$y everywhere");
		c3.add("if pigs could fly and rats could swim then this would be an awesome party");
		c3.add("u donntn nkow hiw mch fuin itr isssss ;)  <3");
		int[] cd3 = new int[2];
		cd3[0] = 34411351;
		cd3[1] = -119861175;
		Party n3 = new Party(6, c3, cd3, "6666 Trigo");
		parties.add(n3);
		
		ArrayList<String> c4 = new ArrayList<String>();
		c4.add("Party was raided");
		c4.add("Skunk sprayed a girls dress");
		c4.add("Overcrowded!");
		int[] cd4 = new int[2];
		cd4[0] = 34411362;
		cd4[1] = -119861441;
		Party n4 = new Party(4, c4, cd4, "6670 TRIGO");
		parties.add(n4);

		ArrayList<String> c5 = new ArrayList<String>();
		c5.add("Where is the music?>");
		c5.add("TROLLLLLL");
		c5.add("no one is here!!");
		int[] cd5 = new int[2];
		cd5[0] = 34410441;
		cd5[1] = -119858367;
		Party n5 = new Party(0, c5, cd5, "6597 STD");
		parties.add(n5);

		ArrayList<String> c6 = new ArrayList<String>();
		c6.add("SO MANYYYYY Females");
		c6.add("Its poppin");
		c6.add("Must come!");
		int[] cd6 = new int[2];
		cd6[0] = 34409455;
		cd6[1] = -119856473;
		Party n6 = new Party(5, c6, cd6, "6555 DP");
		parties.add(n6);
		
		
	}
	
	public ArrayList<Party> getParties(){
		return parties;
	}
	
}
