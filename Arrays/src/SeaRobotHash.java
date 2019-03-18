
public class SeaRobotHash {
	
	private String parkingLocation; 
	private Boolean deleted; 
	private Boolean upgrade;
	
	public SeaRobotHash(String parkingLocation, Boolean deleted, Boolean upgrade) {
		super();
		this.parkingLocation = parkingLocation;
		this.deleted = deleted;
		this.upgrade = upgrade;
	}

	public String getParkingLocation() {
		return parkingLocation;
	}

	public void setParkingLocation(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
	} 
		

}
