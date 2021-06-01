package _05_vault;

import java.util.Random;

public class Vault {
	Random rand = new Random();
	int code;
	Vault(){
		code = rand.nextInt(1000001);
		//code = 1000001;
	}
 boolean tryCode(int guess) {
	return guess == code;	
	}
}
