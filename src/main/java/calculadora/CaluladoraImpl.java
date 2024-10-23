package calculadora;

public class CaluladoraImpl implements Calculadora {
	
	@Override
	public int calcular(int i1, char op, int i2) {
		int res = 0;
		switch(op){
			case '+':
				res= i1+i2;
				break;
			case '-':
				res= i1-i2;
				break;
			case 'x':
				res= i1*i2;
				break;
			case '*':
				res= i1*i2;
				break;
			case '/':
				res= i1/i2;
				break;
			case '%':
				res= i1%i2;
				break;
		}
		return res;
	}

}
