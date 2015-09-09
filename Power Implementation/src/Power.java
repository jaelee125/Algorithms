public class Power {
	
	public double pow(double x, int n){
		if(n == 0)
			return 1.0;
		else if(n < 0)
			return 1/pow(x, -n);
		
		double result = pow(x, n/2);
		
		if (n%2 == 0)
			return result * result;
		else
			return result * result * x;
	}

}
