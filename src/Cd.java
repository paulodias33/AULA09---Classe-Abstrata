
public class Cd extends Produto{
	
	private long numeroFaixas;
	
	
	public long getNumeroFaixas() {
		return numeroFaixas;
	}
	
	public void setNumeroFaixas(long numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
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
