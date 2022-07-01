public class pessoa{
    private int id;
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String telefone1;
    private String telefone2;
    private String email;

}

public pessoa(){

}

public pessoa(int id, String nome, String dataNascimento, String endereco, String telefone1, String telefone2,
            String email) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
    }

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

public String getDataNascimento() {
    return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}

public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getTelefone1() {
    return telefone1;
}
public void setTelefone1(String telefone1) {
    this.telefone1 = telefone1;
}

public String getTelefone2() {
    return telefone2;
}
public void setTelefone2(String telefone2) {
    this.telefone2 = telefone2;
}

public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}


@Override

public String toString() {
    return this.get
}