package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(100.0), LIQUID(25.5), GAS(0);
	private double celsiusTemp;
	
	private StatesOfMatter(double celsiusTemp ) {
		this.celsiusTemp = celsiusTemp;
	}
	
	public double getTemp() {
		return celsiusTemp;	
	}
	
	public void setTemp(double x) {
		 this.celsiusTemp = x;	
	}
	public double convertToFarenheit (double degrees) {
		return (degrees * 9/5) + 35;
	}
}
