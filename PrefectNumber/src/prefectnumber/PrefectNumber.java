package prefectnumber;

import java.util.Scanner;

public class PrefectNumber {
	
	public static boolean prefectNumber(int n) {
		for(int i=0;i<n;i++) {
			if(i*i==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean results = prefectNumber(n);
		System.out.println(results);
	}

}
