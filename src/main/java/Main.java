
public class Main {

	public static void main(String[] args) {
		Car car = new Car("����", "��̥");
		System.out.println(car.start());
		SportsCar sportsCar = new SportsCar("����", "��̥", "β��");
		System.out.println(sportsCar.start());
		System.out.println(sportsCar.speedOn());
		Truck truck = new Truck("����", "��̥", "װ��");
		System.out.println(truck.start());
		System.out.println(truck.load());
		Car newCar = new Car("����", "��̥", "��������");
		System.out.println(newCar.start("��������"));
	}

}
