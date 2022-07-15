package questao_II;
public class Equipe {
    
    private String nome;
    private String Cidade;
    private String nomeTecnico;
    private int pontos;
    private int vitorias;
    private int saldoGols;
    private int colocacao;
    private String email;

    public Equipe() {
    }

    public Equipe(String nome, String Cidade, String nomeTecnico, int pontos, int vitorias, int saldoGols, int colocacao, String email) {
        this.nome = nome;
        this.Cidade = Cidade;
        this.nomeTecnico = nomeTecnico;
        this.pontos = pontos;
        this.vitorias = vitorias;
        this.saldoGols = saldoGols;
        this.colocacao = colocacao;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public int getColocacao() {
        return colocacao;
    }

    public void setColocacao(int colocacao) {
        this.colocacao = colocacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.getNome() + ", " + 
                this.getEmail()+ ", " +
                this.getCidade()+ ", " +
                this.getNomeTecnico()+ ", " +
                this.getVitorias()+ ", " +
                this.getPontos()+ ", " +
                this.getSaldoGols()+ ", " +
                this.getColocacao() ;
    }
    
    
    
    
    
    
}