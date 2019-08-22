import org.omg.CORBA.PUBLIC_MEMBER;

public class SportsCar extends Car{

	private String lights;
	public SportsCar(String engine, String wheels,String lights) {
		super(engine, wheels);
		this.lights = lights;
	}

	public String start() {
		String result = super.start();;
		return this.lights + "are shining, " + result;
	}
	
	public String speedOn() {
		return super.engine + " is overload and "+ super.wheels + " are super running!";
		
	}
}
