//Implementing the training class to 
abstract class Training {
	private String id;
	private String subject;
	private double fees;
	
	//parameterized constructor to initialize the instance members
	Training(double fees,String subject,String id)
	{
		this.fees=fees;
		this.subject=subject;
		this.id=id;
		
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	//abstract mthod implemented in the child classes for caculatibg the total cost
	public abstract double getOrderValue();


	//to display the inputed data
	@Override
	public String toString() {
		return "Training [id=" + id + ", subject=" + subject + ", fees=" + fees + "]";
	}

}

