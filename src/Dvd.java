
public class Dvd extends Produto{
	
	private long tempoDuracao;
	private long precoNovo;
	
	
	public long getTempoDuracao() {
		return tempoDuracao;
	}
	
	public void setTempoDuracao(long tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	
//	sobrescrita do método toString (Produto)
	public String toString() {
		return super.toString() +
				" Tempo Duração : " + getTempoDuracao();
	}
//	implementação do método getCodigoBarras
	public String getCodigoBarras() {
		return getNome()+getTempoDuracao();

	}
}
