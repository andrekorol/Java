public class Telefone { 
    private int numMinutos;
    private double preco;

    public Telefone (int a, double p) {
        numMinutos = a;
    	preco = p;
    }
    	public void setAlterarPreco(double p)
 		{preco=p;}
    	public double getAlterarPreco()
    	{return preco;    	}
    	public void setDuracaoLigacao(int a)
    	{numMinutos=a  ;  	}
    	public int getDuracaoLigacao()
    	{return numMinutos;    	}
    	public void mostrarConta()
    	{	double c;
    	c=numMinutos*preco;
    		System.out.printf("\n valor da conta: %f\n",c);
    	}	
}
