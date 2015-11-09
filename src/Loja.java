import java.util.ArrayList;


public class Loja {

	public static void main(String[] args) {
		
//		Criação de instâncias de Produtos. Cd, DVD e livro herdam de Produto. 
//		Então são considerados produtos
		Cd cd = new Cd();
		Dvd dvd = new Dvd();
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		dvd.setNome("As aventuras de PI");
		dvd.setPreco(20);
		dvd.setTempoDuracao(120L);
		
		cd.setNome("Raul Seixas");
		cd.setPreco(50L);
		cd.setNumeroFaixas(7);
		
		livro1.setAutor("Augusto");
		livro1.setPreco(70);
		livro1.setNome("Colecionador de Lágrimas");
		
		livro2.setAutor("Augusto");
		livro2.setPreco(70);
		livro2.setNome("Colecionador de Lágrimas 2");
		
		//Instanciando um ArrayList de produtos
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		//Adicionando Produtos ao ArrayList
		lista.add(cd);
		lista.add(dvd);
		lista.add(livro1);
		lista.add(livro2);
		
		for (Produto produto : lista) {
			//chamada ao toString sobrescrito de cada classe de produto
			System.out.println(produto.toString());
		}	
	}
	
	
}
