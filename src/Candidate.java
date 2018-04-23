
public class Candidate {
	
	String cand_name;
	String cand_constituency;
	String cand_id;
	int votes;
	
	public Candidate(String cand_name, String cand_constituency, String cand_id,int votes) {
		super();
		this.cand_name = cand_name;
		this.cand_constituency = cand_constituency;
		this.cand_id = cand_id;
		this.votes = votes;
	}
	
	public String getCand_name() {
		return cand_name;
	}
	public void setCand_name(String cand_name) {
		this.cand_name = cand_name;
	}
	public String getCand_constituency() {
		return cand_constituency;
	}
	public void setCand_constituency(String cand_constituency) {
		this.cand_constituency = cand_constituency;
	}
	public String getCand_id() {
		return cand_id;
	}
	public void setCand_id(String cand_id) {
		this.cand_id = cand_id;
	}
}
