package DesafioPoliMorfismo;

public class ProdutoImportado extends Produto {
	private Double taxaImportacao;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nomeProduto, Double precoProduto, Double taxaImportacao) {
		super(nomeProduto, precoProduto);
		this.taxaImportacao = taxaImportacao;
	}
	
	@Override
	public String toString() {
		return getNomeProduto()+" R$ "+" (taxa de importação: R$ "+getTaxaImportacao()+" )";
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	
}
