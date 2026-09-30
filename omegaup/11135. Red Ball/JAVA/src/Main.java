import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroLineas = scan.nextInt();
		List<Integer> numerosEvaluar = new ArrayList();
		for(int i = 0; i<numeroLineas;i++) {
			numerosEvaluar.add(scan.nextInt());
		}
		
		for(int numeroEvaluado:numerosEvaluar) {
			List<Integer> elementos = descomponer(Integer.valueOf(numeroEvaluado));
			imprimir(elementos);
		}
	}
	
	public static void imprimir(List<Integer> elementos) {
		System.out.println(elementos.size());
		for(Integer entero:elementos) {
			System.out.print(entero);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static List<Integer> descomponer(Integer numeroI) {
		List<Integer> lista = new ArrayList();
		int aux = 0;
		for(;numeroI > 0;) {
			aux = sacarNumeroActual(numeroI);
			lista.add(aux);
			numeroI -= aux;
		}
		return lista;
	}
	
	public static int sacarNumeroActual(Integer entero) {
		StringBuilder sb = new StringBuilder();
		int longitud = entero.toString().length();
		sb.append(entero.toString().charAt(0));
		for(int i=0;i<longitud-1;i++) {
			sb.append("0");
		}
		return Integer.valueOf(sb.toString());
	};

}
