
public class Social_Media {

	private String Name;
	
	private Boolean Online;
	
	private  int Age;
	
	private  String Password;
	
	private  double Location;
	
	public Social_Media() {
		System.out.println("In constructor Social_Media");
	}
	
	public Social_Media(String Name,String Password, Boolean Online, int Age, double Location) {
		System.out.println("In constructor Social_Media");
		this.Name = Name;
		this.Password = Password;
		this.Location = Location;
		this.Online = Online;
		this.Age = Age;
	}
		
	public void printName() {
	System.out.println("Name =" + Name);
	}
	public void printLocation() {
		System.out.println("Location =" + Location);
		}
	
	public void printAge() {
	System.out.println("Age =" + Age);
	}
	
	public void printPassword(){
	System.out.println("Password =" + Password);
	}
	
	public void printOnline() {
	System.out.println("Is Online =" + Online) ;
	}
	
	public void printNameLocation() {
		System.out.println(Name + Location);
	}
	public void setName(String newName) {
		Name = newName ;
	}
	
	public boolean isEuropean() {
		return Location == 1234.5678 ; 
	}
	public String getName( ) {
		return Name;
	}
	
}
