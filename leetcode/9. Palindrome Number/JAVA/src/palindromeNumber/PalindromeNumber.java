package palindromeNumber;

public class PalindromeNumber {
	public static void main(String[] args) {
		Solution solucion = new Solution();
		System.out.println(solucion.isPalindrome(121));
	}
}

class Solution {
    public boolean isPalindrome(int x) {
    	String entero = String.valueOf(x);
    	StringBuilder compuesto = new StringBuilder();
    	for(int i = entero.length()-1;i>=0;i--) {
    		compuesto.append(entero.charAt(i));
    	}
    	return compuesto.toString().equals(entero) ? true :  false;
    }
}