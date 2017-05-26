package bean;

public class Produto {

	private Integer idProduto;
	private String nomeProduto;
	private int quantidadeProduto;
	private Float valorProduto;
	private Integer supermercado;
	private Integer fabricante;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public Float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Integer getSupermercado() {
		return supermercado;
	}

	public void setSupermercado(Integer supermercado) {
		this.supermercado = supermercado;
	}

	public Integer getFabricante() {
		return fabricante;
	}

	public void setFabricante(Integer fabricante) {
		this.fabricante = fabricante;
	}

}
