package assignmen3.demo;

public class Addresses {
	
		private String sreet;
		private String city;
		private String state;
		private String zip;
		private String Country;
		
		public Addresses(String sreet, String city, String state, String zip, String country) {
			super();
			this.sreet = sreet;
			this.city = city;
			this.state = state;
			this.zip = zip;
			Country = country;
		}
		public String getSreet() {
			return sreet;
		}
		public void setSreet(String sreet) {
			this.sreet = sreet;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		@Override
		public String toString() {
			return " [sreet=" + sreet + ", city=" + city + ", state=" + state + ", zip=" + zip + ", Country="
					+ Country + "]";
		}
		
		
		
		
		

	

}
