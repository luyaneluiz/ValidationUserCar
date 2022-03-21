package enity;

public class Carros {
    private Integer id;
    private String placaCarro;
    private String nomeUsuario;    

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setPlacaCarro(String placaCarro){
        this.placaCarro = placaCarro;
    }

    public String getPlacaCarro(){
        return placaCarro;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }
}
