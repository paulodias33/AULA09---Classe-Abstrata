
public class Cd extends Produto{
	
	private long numeroFaixas;
	
	
	public long getNumeroFaixas(long x, long y) {
		long numero Faixa =x+y;
		return numeroFaixas;
	}
	
	public void setNumeroFaixas(long numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
	public final void setCalculoFinal(){
		string a = "contranct";
	}
	
//	sobrescrita do método toString (Produto)
	public String toString() {
		return super.toString() +
				" Numero de faixas: " + getNumeroFaixas();
	}

//	implementação do método getCodigoBarras
	@Override
	public String getCodigoBarras() {
		return getNome()+getNumeroFaixas();
	}
	
}
