package Singelton;

public class Singelton {
	
	private static Singelton instance;
	
	private Singelton() {
		this.instance =this;
		
		
	}
	
	public static Singelton create() {
		if(instance!=null) {
			return instance;
			
			
		}else {
			instance = new Singelton();
			return instance;
		}
		
	}

}
