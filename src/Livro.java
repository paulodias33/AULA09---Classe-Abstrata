
public class Livro extends Produto{
	
	private String autor;
	
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
//	sobrescrita do método toString (Produto)
	public String toString() {
		return super.toString() +
				" Autor: " + getAutor();
	}
	
//	implementação do método getCodigoBarras
	public String getCodigoBarras() {
		return getNome()+getAutor();
	}
	
	
}
