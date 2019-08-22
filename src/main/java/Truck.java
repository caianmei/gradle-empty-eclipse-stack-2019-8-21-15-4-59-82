
public class Truck extends Car {

	private String payload;
	/*我想添加一条卡车生产线Truck，卡车Truck除了引擎engine和车轮wheels之外还有负载车厢payload，当发动卡车时，
	命令行输出"tips, {engine} is on and {wheels} are running!"

	卡车除了发动之外还可以载货load，载货时命令行输出"{payload} is loading goods"*/
	public Truck(String engine, String wheels,String payload) {
		super(engine, wheels);
		this.payload = payload;
	}

	public String start() {
		String result = super.start();;
		return "tips," + result;
	}
	
	public String load() {
		return this.payload + " is loading goods ";
		
	}
}
