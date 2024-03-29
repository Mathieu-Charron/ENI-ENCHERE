package bo;

public class Withdrawal {
    private String street;
    private String postalCode;
    private String city;
	public Withdrawal(String street, String postalCode, String city) {
		super();
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Withdrawal [street=" + street + ", postalCode=" + postalCode + ", city=" + city + "]";
	}
}