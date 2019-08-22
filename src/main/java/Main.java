
public class Main {

	public static void main(String[] args) {
		Car car = new Car("ÒıÇæ", "ÂÖÌ¥");
		System.out.println(car.start());
		SportsCar sportsCar = new SportsCar("ÒıÇæ", "ÂÖÌ¥", "Î²µÆ");
		System.out.println(sportsCar.start());
		System.out.println(sportsCar.speedOn());
		Truck truck = new Truck("ÒıÇæ", "ÂÖÌ¥", "×°ÔØ");
		System.out.println(truck.start());
		System.out.println(truck.load());
		Car newCar = new Car("ÒıÇæ", "ÂÖÌ¥", "³µÔØÒôÀÖ");
		System.out.println(newCar.start("³µÔØÒôÀÖ"));
	}

}
