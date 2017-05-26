package Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Fabricante;
import bean.Produto;
import bean.Supermercado;
import dao.FabricanteDAO;
import dao.ProdutoDAO;
import dao.SupermercadoDAO;

public class Main {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Fabricante fabricante = new Fabricante();
		// fabricante.setNomeFabricante("Avell");
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		// fabricanteDAO.insert(fabricante);
		//
		Supermercado supermercado = new Supermercado();
		// supermercado.setNomeSupermercado("Bretas");
		SupermercadoDAO supermercadoDAO = new SupermercadoDAO();
		// supermercadoDAO.insert(supermercado);

//		Produto produto = new Produto();
//		produto.setNomeProduto("Teclado");
//		produto.setQuantidadeProduto(2);
//		produto.setValorProduto(55F);
//		produto.setSupermercado(1);
//		produto.setFabricante(1);
		ProdutoDAO produtoDAO = new ProdutoDAO();
//		// produtoDAO.insert(produto);
//		produto = produtoDAO.findBySupermercado(2, 4);
//		System.out.println(produto.getNomeProduto());

		List<Produto> list = new ArrayList<Produto>();
		
		list = produtoDAO.all();
		
		for (Produto produto2 : list) {
			System.out.println(produto2.getNomeProduto());
		}
		

//		produto = produtoDAO.findBySupermercado(1);
//		System.out.println(produto.getNomeProduto());

	}

}
