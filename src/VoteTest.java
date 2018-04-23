import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VoteTest {
	Candidate c1,c2;
	YourVote v1;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Candidate ("Yogeeta","Margao","60",0);
		c2 = new Candidate ("Vijeta","Margao","27",0);
		v1 = new YourVote("ME");
		v1.addVote(new VClass(c1));
		v1.addVote(new VClass(c2));
		System.out.println(v1.VotingResult());
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
