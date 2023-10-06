package computerstore;


public class Computer {

    private String brand;
    private String model;
    private long SN;
    private double price;
    private static int numberOfCreatedComputers = 0;
    
    //getters and setters
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public long getSN() {
		return SN;
	}
	
	public void setSN(long sN) {//serial number
		this.SN = sN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static int getNumberOfCreatedComputers() {
		return numberOfCreatedComputers;
	}
	
	public static void setNumberOfCreatedComputers(int numberOfCreatedComputers) {
		Computer.numberOfCreatedComputers = numberOfCreatedComputers;
	}
//constructors
	public Computer(String brand, String model, long sN, double price) {
		
		this.brand = brand;
		this.model = model;
		this.SN = sN;
		this.price = price;
		numberOfCreatedComputers++;//incrementing the noofcreatedcomputers
	}
// to display all information at once
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", SN=" + SN + ", price=" + price + "]";
	}
	
    // Method to find the number of created Computer objects
    public static int findNumberOfCreatedComputers() {
        return numberOfCreatedComputers;
    }
//computer constructor used in different class
	public Computer() {
		
	}
	 // Method to compare two Computer objects for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same object reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different classes or null
        }
        Computer otherComputer = (Computer) obj;
        return brand.equals(otherComputer.brand) &&
               model.equals(otherComputer.model) &&
               Double.compare(otherComputer.price, price) == 0;
    }
}
