package permutacion;
import javax.swing.JOptionPane;

public class Main {
	
	static double getFactorial(double x) {
		if(x==0)
			return 1;
		else
			return x*getFactorial(x-1);
	}
	
	public static void main(String[] args) {
		
		String[] elementos = {"tomate","lechuga","cebolla","ajo",
				"moztaza"};
		//cuantas combinaciones puedo hacer? en permutacion importa el orden
		//5 P 3 , 5 elementos tomados de a 3 grupos (M / N)
		//M: Elementos , N: Grupos
		//5 P 3 -- (m! / (m-n)!)
		//double total = getFactorial(5);
		//System.out.println(total);
		
		double m,n;
		m = elementos.length;
		n = 3; //agrupo de a 3 elementos
		double mFact = getFactorial(m);
		double mnFact = getFactorial(m-n);
		double resuTotal = mFact / mnFact;
		JOptionPane.showMessageDialog(null,"La permutacion da: "+resuTotal);
		
		
		
	}

}
