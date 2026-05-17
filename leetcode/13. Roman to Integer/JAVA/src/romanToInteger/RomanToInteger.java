package romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		Solution solucion = new Solution();
		System.out.println(solucion.romanToInt("XLIX"));
	}

}

class Solution {
	public static Map<String, Integer> valores = new HashMap<>();

	public Solution() {
		asignaDiccionario();
	}
	
	public void asignaDiccionario() {
		valores.put("I",1);
		valores.put("V",5);
		valores.put("X",10);
		valores.put("L",50);
		valores.put("C",100);
		valores.put("D",500);
		valores.put("M",1000);
	}
	
	public int romanToInt(String s) {
    	
    	int entero = 0;
    	int longitudString = s.length();
    	int posicionActual = 0;
    	
    	if(longitudString == 1) {
    		return valores.get(s);
    	}
    	
    	for(;posicionActual<= longitudString-2;){
    		char letraPosicion = s.charAt(posicionActual);
    		char letraPosicionSig = s.charAt(posicionActual+1);
    		
    		if(esResta(letraPosicion, letraPosicionSig)) {
    			entero -= charToEntero(letraPosicion);
    		} else {
    			entero += charToEntero(letraPosicion);
    		}
    		posicionActual+=1;
    	}
    	
    	entero += charToEntero(s.charAt(posicionActual));
    	
    	return entero;
    	
    }
	
	public int charToEntero(char a) {
		return valores.get(String.valueOf(a));
	}

	public boolean esResta(char a, char b) {
		if(charToEntero(a)<charToEntero(b)) {
			return true;
		}
		return false;
	}
}
