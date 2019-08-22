
public class Car {
	public  String engine;
	public String wheels;
	
	private String musicPlayer;
	
	public  Car(String engine,String wheels) {
		this.engine = engine;
		this.wheels = wheels;
	}
	
	public  Car(String engine,String wheels,String musicPlayer) {
		this.engine = engine;
		this.wheels = wheels;
		this.musicPlayer = musicPlayer;
	}
	public String start() {
		return engine + " is on and " + wheels + " are running!";
	}
	
	public String start(String musicPlayer) {
		return musicPlayer + " is play," + engine + " is on and " + wheels + " are running!";
	}
}