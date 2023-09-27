
public class Application {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Social_Media object1 = new Social_Media();
		Social_Media object2 = new Social_Media();
		
	//	object1.Name ="Jessica Jones" ;
	//	object1.Age = 28 ;
	//	object1.Location = 1234.5678 ;
		object1.printName();
		object1.printAge();
		object1.printNameLocation();
		object1.setName("Luca Fossen");
	
		boolean outcome = object1.isEuropean();
		System.out.println("Is European? =" + outcome);
		
	//	object2.Password = "********";
	//	object2.Online = true;
		object2.printPassword();
		object2.printOnline();
		
		Social_Media object3 = new Social_Media("Jan Pieter","welkom123",true, 45, 1234.5678);
		System.out.println(object3.getName());
	}

}
