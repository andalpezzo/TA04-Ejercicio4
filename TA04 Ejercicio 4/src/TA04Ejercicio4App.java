
public class TA04Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		int N = 1;
		int valorIncrementar = 77;
		int valorDecrementar = 3;
		
		for(int i=0 ; i < valorIncrementar; i++) {
			N++; 
		}
	
		System.out.println(N);
		
		for(int i=0 ; i < valorDecrementar; i++) {
			N--; 
		}
		
		System.out.println(N);
		System.out.println("N * 2 = " + N*2);
		
		System.out.println();
	}

}
