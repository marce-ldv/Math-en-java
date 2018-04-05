package binarios;

public class Main {
	
	static int toInt(String bin) {
		int total = 0;
		char[] binario = bin.toCharArray();
		
		for (int i = 0; i < binario.length; i++) {
			total <<= 1; //rotacion
			total |= (binario[i] == '0')?0:1;
		}
		
		
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println(toInt("111"));
		
	}

}
