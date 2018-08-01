//Class to implement the car owner details
public class Parked_CarOwner {

	//instance members
	private String ownerName;
	private String carModel;
	private String carNO;
	private String ownerMobileNo;
	private String ownerAddress;
	
	//parameterized constructor
	public Parked_CarOwner(String ownerName, String carModel, String carNO, String ownerMobileNo,
			String ownerAddress) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

	//getter and setter methods for the instance members
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public String getCarNO() {
		return carNO;
	}
	
	public void setCarNO(String carNO) {
		this.carNO = carNO;
	}
	
	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}
	
	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	
	public String getOwnerAddress() {
		return ownerAddress;
	}
	
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

}