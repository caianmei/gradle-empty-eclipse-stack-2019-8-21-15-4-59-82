
public class Truck extends Car {

	private String payload;
	/*�������һ������������Truck������Truck��������engine�ͳ���wheels֮�⻹�и��س���payload������������ʱ��
	���������"tips, {engine} is on and {wheels} are running!"

	�������˷���֮�⻹�����ػ�load���ػ�ʱ���������"{payload} is loading goods"*/
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
