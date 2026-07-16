package longestCommonPrefix;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		
		int cantidadPalabras = strs.length;
		int menorCantidadCaracteres = longitudMenorPalabra(strs);
		char[] arregloCaracteres = new char[cantidadPalabras];
		StringBuilder palabraFin = new StringBuilder();
		
		for(int posicionLetra = 0; posicionLetra<menorCantidadCaracteres;posicionLetra++) {
			for(int numPalabra = 0;numPalabra<cantidadPalabras;numPalabra++) {
				arregloCaracteres[numPalabra] = strs[numPalabra].charAt(posicionLetra);
			}
			if(evaluarIgualdad(arregloCaracteres)) {
				palabraFin.append(arregloCaracteres[0]);
			} else {
				break;
			}
		}
		System.out.println(palabraFin.toString());
		return palabraFin.toString();
    }
	
	public boolean evaluarIgualdad(char[] letras) {
		boolean evaluacion = true;
		for(int pos = 0;pos<letras.length-1;pos++) {
			if(letras[pos] != letras[pos+1]) {
				evaluacion = false;			
			}
		}
		return evaluacion;
	}
	
	public int longitudMenorPalabra(String[] strs) {
		int menorCantidadLetras = strs[0].length();
		for(String palabra:strs) {
			if(menorCantidadLetras>palabra.length()) {
				menorCantidadLetras = palabra.length();
			}
		}
		return menorCantidadLetras;
	}
}
	

