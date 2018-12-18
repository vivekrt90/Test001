package Package1;

//make this class final, no one can extend this class
public final class Mutable {

	private String name;

	Mutable (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {

		Mutable obj = new Mutable("Vivek");
		System.out.println(obj.getName());
		
		obj.setName("Vivek Trivedi");
		System.out.println(obj.getName());

	}
}