package cs.ucsb.edu.amousavi.partymap;

import java.util.ArrayList;

public class GetParties {
	
	ArrayList<Party> parties;
	
	public GetParties(){
parties = new ArrayList<Party>();
		
		//int newRating, ArrayList<String> newComments, int [] newCoords, String newTitle
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("I wish t-swift were here");
		c1.add("there's coke everywhere, I just want a pepsi");
		c1.add("theres a dead stripper in the closet!");
		int[] cd1 = new int[2];
		cd1[0] = 34409587;
		cd1[1] = -119860279;
		Party n1 = new Party(2, c1, cd1, "6643 DP");
		parties.add(n1);
		
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("people dancing on the rooftops!");
		c2.add("want beer? they have plenty");
		c2.add("2 keeeeeeegggggsss!!!!");
		int[] cd2 = new int[2];
		cd2[0] = 34409118;
		cd2[1] = -119856076;
		Party n2 = new Party(4, c2, cd2, "6549 DP");
		parties.add(n2);
		
		ArrayList<String> c3 = new ArrayList<String>();
		c3.add("I can't believe Nick the whole grapefruit");
		c3.add("if pigs could fly and rats could swim then this would be an awesome party");
		c3.add("u donntn nkow hiw mch fuin itr isssss ;)  <3");
		int[] cd3 = new int[2];
		cd3[0] = 34411351;
		cd3[1] = -119861175;
		Party n3 = new Party(3, c3, cd3, "6666 Trigo");
		parties.add(n3);
		
		

		ArrayList<String> c4 = new ArrayList<String>();
		c4.add("crackkkin");
		c4.add("sketchy dude standing around");
		c4.add("Some ass*^$# stole my wallet");
		int[] cd4 = new int[2];
		cd4[0] = 34411703;
		cd4[1] = -119861672;
		Party n4 = new Party(5, c4, cd4, "6672 Pasado");
		parties.add(n4);
		
		ArrayList<String> c5 = new ArrayList<String>();
		c5.add("AUTOBOTz-ROLL OUT");
		c5.add("kegstands upon entry. A MUST!!");
		c5.add("get your GauchoBall game face :)");
		int[] cd5 = new int[2];
		cd5[0] = 34414216;
		cd5[1] = -119859414;
		Party n5 = new Party(5, c5, cd5, "6616 Abrego");
		parties.add(n5);
		

		ArrayList<String> c6 = new ArrayList<String>();
		
		c6.add("I think that guy was mauled be a raccoon");
		c6.add("there's just 6 dudes sittin around programming in fortran");
		c6.add("i am a raccoon.");
		int[] cd6 = new int[2];
		cd6[0] = 34412513;
		cd6[1] = -119869456;
		Party n6 = new Party(0, c6, cd6, "6891 Fortuna Rd.");
		parties.add(n6);



	
		ArrayList<String> c7 = new ArrayList<String>();
		c7.add("party in front of IVFP : /");
		c7.add("take soime shptso");
		c7.add("Looking for dimes, all I got were pennies");
		int[] cd7 = new int[2];
		cd7[0] = 34411021;
		cd7[1] = -119854269;
		Party n7 = new Party(1, c7, cd7, "6511 Trigo");
		parties.add(n7);
		


	
		ArrayList<String> c8 = new ArrayList<String>();
		c8.add("No one goes Harder than Harder stadium");
		c8.add("OLE OLE OLE GAUCHOS GAUCHOS");
		c8.add("tortilla projectiles!!!");
		int[] cd8 = new int[2];
		cd8[0] = 34419708;
		cd8[1] = -119854041;
		Party n8 = new Party(5, c8, cd8, "Stadium Road");
		parties.add(n8);
		

		ArrayList<String> c9 = new ArrayList<String>();
		c9.add("This presentation is great. 2 thumbs up!!");
		c9.add("A+++++ WOULD WATCH AGAIN");
		c9.add("hands down the greatest presentation A+");
		int[] cd9 = new int[2];
		cd9[0] = 34415711;
		cd9[1] = -119844097;
		Party n9 = new Party(5, c9, cd9, "Phelps 1413");
		parties.add(n9);

		ArrayList<String> c10 = new ArrayList<String>();
		c10.add("Its too quiet");
		c10.add("I LOVE FEDORA!!");
		c10.add("why is the ac on ITS FREEZING");
		int[] cd10 = new int[2];
		cd10[0] = 34413605;
		cd10[1] = -119841287;
		Party n10 = new Party(1, c10, cd10, "CSIL");
		parties.add(n10);

		ArrayList<String> c11 = new ArrayList<String>();
		c11.add("Party was raided");
		c11.add("Skunk sprayed a girls dress");
		c11.add("was that kim jong il?");
		int[] cd11 = new int[2];
		cd11[0] = 34411362;
		cd11[1] = -119861441;
		Party n11 = new Party(4, c11, cd11, "6670 TRIGO");
		parties.add(n11);


		ArrayList<String> c12 = new ArrayList<String>();
		c12.add("Where is the music?>");
		c12.add("TROLLLLLL");
		c12.add("no one is here!!");
		int[] cd12 = new int[2];
		cd12[0] = 34410441;
		cd12[1] = -119858367;
		Party n12 = new Party(0, c12, cd12, "6597 STD");
		parties.add(n12);





		ArrayList<String> c13 = new ArrayList<String>();
		c13.add("SO MANYYYYY Females");
		c13.add("Its poppin");
		c13.add("Must come!");
		int[] cd13 = new int[2];
		cd13[0] = 34409455;
		cd13[1] = -119856473;
		Party n13 = new Party(5, c13, cd13, "6555 DP");
		parties.add(n13);
		
	}
	
	public ArrayList<Party> getParties(){
		return parties;
	}
	
}
