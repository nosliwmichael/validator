public class Example {
	
	public static void main(String[] args) {

		person validTest = new person("John", 21, "john@email.com", "123-456-7890");
		
		boolean valid = 
			new Validator()
			.isStringLongerThan(validTest.name, 3)
			.isGreaterThan(validTest.age, 17)
			.isEmail(validTest.email)
			.isPhoneNumber(validTest.phone)
			.isValid();
		System.out.println(valid); // Returns true
		
		person invalidTest = new person("Jane", 21, "jane@.com", "098-765-4321");
		
		boolean invalid = 
			new Validator()
			.isStringLongerThan(invalidTest.name, 3)
			.isGreaterThan(invalidTest.age, 17)
			.isEmail(invalidTest.email)
			.isPhoneNumber(invalidTest.phone)
			.isValid();
		System.out.println(invalid); // Returns false
		
	}

	static class person {
		
		public String name;
		public Integer age;
		public String email;
		public String phone;
		
		public person(String name, Integer age, String email, String phone) {
			this.name = name;
			this.age = age;
			this.email = email;
			this.phone = phone;
		}
		
	}
	
}
