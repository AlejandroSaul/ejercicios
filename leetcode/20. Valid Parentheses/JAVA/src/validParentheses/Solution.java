package validParentheses;

import java.util.List;
import java.util.ArrayList;

public class Solution extends Main {
	public Solution() {

	}

	public boolean isValid(String s) {
		char[] parenheses = {'(',')','{','}','[',']'};
		int longitud =	s.length();
		int parentesis = 0;
		int llave = 0;
		int corchete = 0;
		List<String> listas = new ArrayList<String>();
		for(int i =0;i<longitud;i++) {
			char caracterActual = s.charAt(i); 
			if(caracterActual == '(') {
				listas.add("(");
				parentesis += 1;
			} else if (caracterActual == '{') {
				listas.add("{");
				llave += 1;
			} else if (caracterActual == '[') {
				listas.add("[");
				corchete += 1;
			} else if (caracterActual == ')') {
				parentesis -= 1;
				if(listas.size()>0) {
					if(listas.get(listas.size()-1) != "(") {
						return false;
					} else {
						listas.remove(listas.size()-1);
					}
				}
			} else if (caracterActual == '}'  ) {
				llave -= 1;
				if(listas.size()>0) {
					if(listas.get(listas.size()-1) != "{") {
						return false;
					} else {
						listas.remove(listas.size()-1);
					}
				}
			} else if (caracterActual == ']') {
				corchete -= 1;
				if(listas.size()>0) {
					if(listas.get(listas.size()-1) != "[") {
						return false;
					} else {
						listas.remove(listas.size()-1);
					}
				}
			}
			
			if(parentesis==-1 || llave == -1 || corchete == -1) {
				return false;
			}
		}
		if(parentesis!=0 || llave != 0 || corchete != 0) {
			return false;
		}
		return true;
	}
}
