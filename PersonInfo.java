package test;

public class PersonInfo {
	private String infoid;
	private String address;
	private String job;
	private Integer income;
	public PersonInfo()
	{
		
	}
	public PersonInfo(String infoid, String address,String job,Integer income)
	{
		this.infoid=infoid;
		this.address=address;
		this.job=job;
		this.income=income;
	}
	public String getinfoid() {
		return infoid;
	}
	public void setinfoid(String infoid) {
		this.infoid= infoid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	
}


