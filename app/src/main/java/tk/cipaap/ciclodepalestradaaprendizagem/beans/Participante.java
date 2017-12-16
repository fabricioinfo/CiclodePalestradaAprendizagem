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
    private String tel;
    private int palestra;
    private String data;

    public Participante(String nome, String mae, String cpf, String rg, String email, String tel, int palestra, String data) {

        this.nome = nome;
        this.mae = mae;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.tel = tel;
        this.palestra = palestra;
        this.data = data;
    }

    public Participante(){
        this.nome = "";
        this.mae = "";
        this.cpf = "";
        this.rg = "";
        this.email = "";
        this.tel = "";
        this.palestra = -1;
        this.data = "";
    }

    public boolean ehVazio() {
        return (nome.equalsIgnoreCase("")||mae.equalsIgnoreCase("")||cpf.equalsIgnoreCase("")
                || rg.equalsIgnoreCase("") || email.equalsIgnoreCase("") || tel.equalsIgnoreCase("") || palestra == -1);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPalestra() {
        return palestra;
    }

    public void setPalestra(int palestra) {
        this.palestra = palestra;
    }
}
