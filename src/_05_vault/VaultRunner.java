package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	Spy spy = new Spy("James Bond");
	int code = spy.findCode(vault);
	if(code == -1) {
		System.out.println("Vault not opened");
	} else {
		System.out.println("Vault opened. The code was " + code);
	}
}
}
