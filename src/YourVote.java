import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class YourVote {
	
	ArrayList<VClass>candidate1 = new ArrayList<VClass>();
	String vote_id;

  	public YourVote (String id)
	{
		 vote_id = id;
	};

	 public void addVote(VClass arg) {
	     candidate1.add(arg);
	   }
	
	 public String getVoteID ()
	 {
		 return vote_id;
	 };
	 
	 
	 
	 public String VotingResult()
	 {
		 int vote1=0;
		 int vote2=0;
		 
		 Enumeration<VClass> candidates = Collections.enumeration(candidate1);
		 String result = "VOTING RESULTS \n" ;
		
		 while(candidates.hasMoreElements())
		 {
			 VClass each = (VClass) candidates.nextElement();
		
			 
			 if(each.getCandidate().getCand_id() == "100")
			 {
			
				 vote1=vote1+each.getCandidate().votes;

			 }
			 else if(each.getCandidate().getCand_id() == "101")
			 {
				
				 vote2=vote2+each.getCandidate().votes;	
			 }
			 result += "\t" + each.getCandidate().getCand_name() + "\t" + each.getCandidate().getCand_constituency() + "\t" + each.getCandidate().getCand_id()+"\n";	 
			
		 }
		 return result; 
	 }
	  
}



