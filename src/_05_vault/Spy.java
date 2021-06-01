package _05_vault;

public class Spy {
	String name;
	Spy(String name) {
		this.name = name;
	}
	int findCode(Vault vault) {
		for(int estimate = 0; estimate < 1000001; estimate++) {
			if(vault.tryCode(estimate)) {
				return estimate;
			} 
		} 
		return -1;
	}
}
