package roshni;

	class Customer {
		public String customerId;
		public String customerName;
		public long contactNumber;
		public String address;
		public Customer() {
			System.out.println("Parameterless constructor called");
		}
		public Customer(String cId, String cName, long contact, String add) {
			System.out.println("Parameterized constructor called");
			customerId = cId;
			customerName = cName;
			contactNumber = contact;
			address = add;
		}
	}
	public class Coustomer {
		public static void main(String args[]) {
			Customer customer1 = new Customer("C103", "Jacob", 5648394590L,
					"13th Street, New York");
			Customer customer2 = new Customer();
		}
	}



