package questao_I;

public class Visitante {

    private String nome;
    private String fone;
    private String cidade;
    private String bairro;
    private char sexo;
    private String profisao;
    private int anoNascimento;

    public Visitante() {
    }

    public Visitante(String nome, String fone, String cidade, String bairro, char sexo, String profisao, int anoNascimento) {
        this.nome = nome;
        this.fone = fone;
        this.cidade = cidade;
        this.bairro = bairro;
        this.sexo = sexo;
        this.profisao = profisao;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProfisao() {
        return profisao;
    }

    public void setProfisao(String profisao) {
        this.profisao = profisao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return this.getNome() + ", " + this.getSexo();
    }
   
}