package Crds;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
		      "10", "Jack", "Queen", "King"};
		    
		    int cards[][] = new int[4][13];
		    
            String index[] = new String[53];
		    int k = 0;
		    for(int i=0;i<4;i++) 
		    {
		    	for(int j=0;j<13;j++) 
		    	{
		    		index[k] = suits[i]+" of "+ranks[j];
		    		System.out.println(index[k]);
		    	}
		    }
		   
		    
		    	for(int j=0;j<52;j++) 
		    	{
		    		String temp = index[j];
		    		System.out.println(index[j]);
		    		index[j] = index[((int)Math.random()*52)];
		    		System.out.println(index[((int)Math.random()*52)]);
		    		index[(int)(Math.random()*52)]=temp; 
		    	}
		    	
		    	for(int i=0;i<4;i++) 
			    {
			    	for(int j=0;j<13;j++) 
			    	{
			    		
			    		System.out.println(index[k]);
			    	}
			    }
		    
		    
	}

}
