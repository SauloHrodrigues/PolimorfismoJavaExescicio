package DesafioPoliMorfismo;


public class ProdutoUsado extends Produto{
	private String dataFabricacao;
	
	public ProdutoUsado() {
		super();
		
	}

	public ProdutoUsado(String nomeProduto, Double precoProduto, String dataFabricacao) {
		super(nomeProduto, precoProduto);
		this.dataFabricacao = dataFabricacao;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String toString() {
		return getNomeProduto()+" (usado) R$ "+getPrecoProduto()+" (fabricado em: "
				+ getDataFabricacao()+" )";
	}
	
	
	

}
