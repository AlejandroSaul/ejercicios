package islas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int ancho = 5;
		int alto  = 4;
		int[][] matriz = new int[ancho][alto];

		matriz[0][0] = 1; matriz[1][0] = 1; matriz[2][0] = 0; matriz[3][0] = 0; matriz[4][0] = 0;
		matriz[0][1] = 1; matriz[1][1] = 1; matriz[2][1] = 0; matriz[3][1] = 0; matriz[4][1] = 0;
		matriz[0][2] = 0; matriz[1][2] = 0; matriz[2][2] = 1; matriz[3][2] = 0; matriz[4][2] = 0;
		matriz[0][3] = 0; matriz[1][3] = 0; matriz[2][3] = 0; matriz[3][3] = 1; matriz[4][3] = 1;
		
		imprimirMatriz(matriz, ancho, alto);
		
		List<int[]> listaTierra = detectarTierra(matriz, ancho, alto);
		
		int contadorIslas = 0;
		
		for(int[] tierra : listaTierra) {
			if(matriz[tierra[0]][tierra[1]] == 1) {
				contadorIslas++;
				List<int[]> nuevaIsla = new ArrayList<>();
				
				crearIsla(tierra, nuevaIsla, matriz, ancho, alto);
			}
		}
		
		System.out.println("Número total de islas: " + contadorIslas);
	}
	
	public static void imprimirMatriz(int[][] matriz, int ancho, int alto) {
		System.out.println("La matriz a analizar es: ");
		for(int i = 0; i < alto; i++) {
			for(int j = 0; j < ancho; j++) {
				System.out.print(matriz[j][i]);
			}
			System.out.println();
		}
	}

	public static List<int[]> detectarTierra(int[][] matriz, int ancho, int alto) {
		List<int[]> tierra = new ArrayList<>();
		for(int i = 0; i < alto; i++) {
			for(int j = 0; j < ancho; j++) {
				if(matriz[j][i] == 1) {
					int[] seccionTierra = new int[2];
					seccionTierra[0] = j;
					seccionTierra[1] = i;
					tierra.add(seccionTierra);
				}
			}
		}
		return tierra;
	}

	public static boolean analizarArriba(int[][] matriz, int[] arreglo) {
		int[] arregloArriba = {arreglo[0], arreglo[1] - 1};
		if(arregloArriba[1] >= 0 && matriz[arregloArriba[0]][arregloArriba[1]] == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean analizarAbajo(int[][] matriz, int[] arreglo, int alto) {
		int[] arregloAbajo = {arreglo[0], arreglo[1] + 1};
		if(arregloAbajo[1] < alto && matriz[arregloAbajo[0]][arregloAbajo[1]] == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean analizarIzquierda(int[][] matriz, int[] arreglo) {
		int[] arregloIzquierda = {arreglo[0] - 1, arreglo[1]};
		if(arregloIzquierda[0] >= 0 && matriz[arregloIzquierda[0]][arregloIzquierda[1]] == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean analizarDerecha(int[][] matriz, int[] arreglo, int ancho) {
		int[] arregloDerecha = {arreglo[0] + 1, arreglo[1]};
		if(arregloDerecha[0] < ancho && matriz[arregloDerecha[0]][arregloDerecha[1]] == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean existeEnArreglo(List<int[]> lista, int[] arreglo) {
		for(int[] arregloAnalisis : lista) {
			if(arregloAnalisis[0] == arreglo[0] && arregloAnalisis[1] == arreglo[1]) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean aniadirLista(List<int[]> grupo, int[] arreglo) {
		if(!existeEnArreglo(grupo, arreglo)) {
			grupo.add(arreglo);	
			return true;
		}
		return false;
	}
	
	public static List<int[]> crearIsla(int[] actual, List<int[]> isla, int[][] matriz, int ancho, int alto) {
		aniadirLista(isla, actual);
		
		matriz[actual[0]][actual[1]] = 0; 
		
		if(analizarArriba(matriz, actual)) {
			crearIsla(new int[]{actual[0], actual[1] - 1}, isla, matriz, ancho, alto);
		}
		if(analizarAbajo(matriz, actual, alto)) {
			crearIsla(new int[]{actual[0], actual[1] + 1}, isla, matriz, ancho, alto);
		}
		if(analizarIzquierda(matriz, actual)) {
			crearIsla(new int[]{actual[0] - 1, actual[1]}, isla, matriz, ancho, alto);
		}
		if(analizarDerecha(matriz, actual, ancho)) {
			crearIsla(new int[]{actual[0] + 1, actual[1]}, isla, matriz, ancho, alto);
		}
		return isla;
	}
}