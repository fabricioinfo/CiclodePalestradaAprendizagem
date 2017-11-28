package tk.cipaap.ciclodepalestradaaprendizagem.beans;

/**
 * Created by Fabricio on 27/11/2017.
 */

public class Participante {
    private String nome;
    private String mae;
    private String cpf;
    private String rg;
    private String email;
    private  String telefone;
    private int palestra;
    private String data_nasc;

    public Participante(String nome, String mae, String cpf, String rg, String email, String telefone, int palestra,String data_nasc) {

        this.nome = nome;
        this.mae = mae;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
        this.palestra = palestra;
        this.data_nasc=data_nasc;
    }

    public Participante(){
        this.nome = "";
        this.mae = "";
        this.cpf = "";
        this.rg = "";
        this.email = "";
        this.telefone = "";
        this.palestra = -1;
        this.data_nasc="";
    }

    public boolean ehVazio() {
        return (nome.equalsIgnoreCase("")||mae.equalsIgnoreCase("")||cpf.equalsIgnoreCase("")
        || rg.equalsIgnoreCase("")||email.equalsIgnoreCase("")||telefone.equalsIgnoreCase("")||palestra==-1);
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPalestra() {
        return palestra;
    }

    public void setPalestra(int palestra) {
        this.palestra = palestra;
    }
}
