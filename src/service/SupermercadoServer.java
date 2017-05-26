package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import bean.Produto;

@WebService
// @SOAPBinding(style = Style.RPC)
public interface SupermercadoServer {

	@WebMethod
	public Produto findByFabricante(int id, int cod)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;

	@WebMethod
	public Produto findBySupermercado(int id, int cod)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;

	@WebMethod
	public List<Produto> allFabricante(int id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;

	@WebMethod
	public List<Produto> allSupermercado(int id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;

	@WebMethod
	public List<Produto> all()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
