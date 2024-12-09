package Day_32;

public class Address {
	private String cityName;
	private String districtName;
    private String stateName;
    
	public Address(String cityName, String districtName, String stateName) {
		super();
		this.cityName = cityName;
		this.districtName = districtName;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", districtName=" + districtName + ", stateName=" + stateName + "]";
	}
    
    
}

/*
Program: 1
-----------
Create a class Address (Business Logic Class)
Instance Variables: 
   private String cityName;
   private String districtName;
   private String stateName;
Create a parameterized constructor initialize the instance variable of the class.

Override toString() from Object class to print Address class properties.

*/