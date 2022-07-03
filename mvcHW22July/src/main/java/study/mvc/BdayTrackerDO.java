package study.mvc;

public class BdayTrackerDO {
	
	private int id;
	private String fname,lname,dob;
	
	public BdayTrackerDO()
	{
		
	}

	public BdayTrackerDO(int id) 
	{
		this.id = id;
	}
	
	public BdayTrackerDO(String fname, String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		
		String str = id+"\n";//fname+"  "+lname+"\n";
		return str;
	}
	

}
