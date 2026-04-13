package entidades;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private String telefone;
    
    
    // get e set String nome
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    
    // get e set String cnpj
        public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj (String cnpj){
        this.cnpj = cnpj;
    }
    
    
    // get e set String Telefone
        public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone (String telefone){
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return nome + "-" + cnpj;
    }
    
}
