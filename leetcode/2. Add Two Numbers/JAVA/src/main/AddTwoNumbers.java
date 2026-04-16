package main;

import java.util.Arrays;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int[] arreglo1 = listNodeToArray(l1);
    	int[] arreglo2 = listNodeToArray(l2);
    	    	
    	System.out.println(Arrays.toString(arreglo1));
    	System.out.println(Arrays.toString(arreglo2));
    	
        return addArray(arreglo1,arreglo2);
    }
    
    public int[] listNodeToArray(ListNode lista){
    	int longitudArreglo = 0;
    	ListNode primeraPosicion = lista;
    	while(lista != null) {
    		longitudArreglo ++;
    		lista = lista.next;
    	}
    	lista = primeraPosicion;
    	int[] listArray = new int[longitudArreglo];
    	for(int i=0; i < longitudArreglo;i++) {
    		listArray[i] = lista.val;
    		lista = lista.next;
    	}
    	return listArray;
    }
    
    public ListNode addArray(int[] numero1, int[] numero2) {
    	
    	int longitudN1 = numero1.length;
    	int longitudN2 = numero2.length;
    	int menorLongitud;
    	int mayorLongitud;
    	boolean mayorLongitudN1;
    	if(longitudN1>longitudN2) {
    		menorLongitud = longitudN2;
    		mayorLongitud = longitudN1;
    		mayorLongitudN1 = true;
    	} else {
    		menorLongitud = longitudN1;
    		mayorLongitud = longitudN2;
    		mayorLongitudN1 = false;
    	}
    	
    	ListNode listaFinal = new ListNode();
    	ListNode primerNodo = new ListNode();
    	boolean bandera = false;
    	boolean primerNumero = true;
    	int numero = 0;
    	int i = 0;
    	for( ; i< menorLongitud ; i++) {
    		numero = numero1[i] + numero2[i];
    		if(bandera) {
    			numero++;
    			bandera = false;
    		}
    		if(numero > 9) {
    			listaFinal.val = numero-10;
    			bandera = true;
    		} else {
    			listaFinal.val = numero;
    		}
    		if(primerNumero) {
    			primerNodo = listaFinal;
    			primerNumero = false;
    		}
    		if(i+1<menorLongitud) {
        		listaFinal.next = new ListNode();
        		listaFinal = listaFinal.next;
    		}
    	}
    	
    	if(menorLongitud != mayorLongitud) {
    		listaFinal.next = new ListNode();
    		listaFinal = listaFinal.next;
    	}
    	
    	if(mayorLongitudN1) {
        	for(;i<mayorLongitud;i++) {
        		if(bandera) {
        			numero = numero1[i]+1;
        			bandera = false;
        			if(numero > 9) {
        				numero = numero-10;
        				bandera = true;
        			} 
        		}else {
        			numero = numero1[i];
        		}
        		listaFinal.val = numero;
        		
        		if(i+1<mayorLongitud) {
            		listaFinal.next = new ListNode();
        			listaFinal = listaFinal.next;
        		}
        	}
    	} else {
        	for(;i<mayorLongitud;i++) {
        		if(bandera) {
        			numero = numero2[i]+1;
        			bandera = false;
        			if(numero > 9) {
        				numero = numero-10;
        				bandera = true;
        			} 
        		}else {
        			numero = numero2[i];
        		}
        		listaFinal.val = numero;

        		if(i+1<mayorLongitud) {
            		listaFinal.next = new ListNode();
        			listaFinal = listaFinal.next;
        		}
        	}
    	}
    	if(bandera) {
    		listaFinal.next = new ListNode();
			listaFinal = listaFinal.next;
    		listaFinal.val = 1;
    		
    	}

    	return primerNodo;
    }
    
    public void imprimirNode(ListNode nodo) {
    	int contador = 0;
    	ListNode puntero = nodo;
    	while(puntero != null) {
    		contador++;
    		puntero = puntero.next;
    	}
    	puntero = nodo;
    	int[] arreglo = new int[contador]; 
    	contador = 0;
    	while(puntero != null) {
    		arreglo[contador] = puntero.val;
    		contador++;
    		puntero = puntero.next;
    	}
    	System.out.println(Arrays.toString(arreglo));
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}