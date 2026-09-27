package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrString1 = scanner.nextLine();
        String arrString2 = scanner.nextLine();
        String[] str1 = arrString1.split(",");
        String[] str2 = arrString2.split(",");
        // Write your code below
        System.out.print(buscarPatron(str1,str2));

	}
	
	public static boolean buscarPatron(String[] str1,String[] str2) {
		boolean bandera = false;
		if(str1.length<str2.length) return bandera;
		for(int i = 0; i<str1.length; i++){
			if(str1[i].equals(str2[0])) {
				for(int j = 1; j<str2.length; j++){
					if(str2[j].equals(str1[i+j])) {
						bandera = true;
					} else {
						bandera = false;
						break;
					}
				}
			}
		}
		return bandera;
	}

}
