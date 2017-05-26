package service;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import bean.Produto;

public class SupermercadoClient {

	public static void main(String[] args) throws MalformedURLException, InstantiationException, IllegalAccessException,
			ClassNotFoundException, SQLException {

		URL url = new URL("http://127.0.0.1:9876/service?wsdl");
		QName qName = new QName("http://service/", "SupermercadoServerImplService");
		Service service = Service.create(url, qName);
		SupermercadoServer server = service.getPort(SupermercadoServer.class);
		server.all();

		List<Produto> list = server.all();
		List<Produto> list2 = server.allFabricante(2);
		List<Produto> list3 = server.allSupermercado(1);
		Produto produto2 = server.findByFabricante(1, 1);
		Produto produto3 = server.findBySupermercado(2, 2);

		System.out.println("all");
		for (Produto produto : list) {

			System.out.println(produto.getNomeProduto());
		}
		System.out.println("allFabricante");
		for (Produto produto : list2) {

			System.out.println(produto.getNomeProduto());
		}
		System.out.println("allSupermercado");
		for (Produto produto : list3) {

			System.out.println(produto.getNomeProduto());
		}
		System.out.println("findByFabricante");
		System.out.println(produto2.getNomeProduto());
		System.out.println("findBySupermercado");
		System.out.println(produto3.getNomeProduto());

	}

}
