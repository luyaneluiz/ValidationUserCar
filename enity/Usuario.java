package enity;

public class Usuario {
    private Integer idUser;
    private String nomeCompleto;
    private String cpf;

    public void setIdUser(Integer idUser){
        this.idUser = idUser;
    }

    public Integer getIdUser(){
        return idUser;
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }
}
