package _06_duck;

public class Duck {
	Duck(String favoriteFood, int numberOfFriends){
		this.favoriteFood = "Worms";
		this.numberOfFriends = 8;
	}
	int numberOfFriends;
	String favoriteFood;
	void quack() {
		System.out.println("The duck is quacking.");
	}
	
	void waddle() {
		System.out.println("The duck is waddling.");
	}
}
