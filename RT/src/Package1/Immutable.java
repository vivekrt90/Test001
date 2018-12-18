package Package1;

public final class Immutable {
		private String name;
	 
		Immutable(String name) {
			this.name = name;
		}
	 
		public String getName() {
			return name;
		}
		
		// No setter
	 
		public static void main(String[] args) {
	 
			Immutable obj = new Immutable("Vivek");
			System.out.println(obj.getName());
	  
		}
	}
