package _06_duck;

public class DuckRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		daffy.waddle();
		Tiger taffy = new Tiger("deer",1);
		taffy.attack();
		taffy.roar();
	}
}
