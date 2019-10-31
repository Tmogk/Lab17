package co.grandcircus;

public class Country {

	private String countryName;
	private String countryPop;

	public Country() {
		super();
	}

	public Country(String countryName, String countryPop) {
		super();
		this.countryName = countryName;
		this.countryPop = countryPop;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryPop() {
		return countryPop;
	}

	public void setCountryPop(String countryPop) {
		this.countryPop = countryPop;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryPop=" + countryPop + "]";
	}

}
