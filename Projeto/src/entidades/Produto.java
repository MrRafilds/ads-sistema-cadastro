package entidades;

public class Produto {
    private String descricao;
    private Double preco;
    private Integer quantidade;
    private Fornecedor fornecedor;
      
    
    public Produto(){}
    
    public Produto(String descricao, Double preco, Integer quantidade, Fornecedor fornecedor){
        
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        
    }
    
    // get e set String descricao
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    
    // get e set Double preco
    public Double getPreco(){
        return preco;
    }
    
    public void setPreco(Double preco){
        this.preco = preco;
    }
    
    
    // get e set Integer quantiadade
    public Integer getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }
    
    
    // get e set Fornecedor forecedor
    public Fornecedor getFornecedor(){
        return fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }
}
