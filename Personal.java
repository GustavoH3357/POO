package academia;

public class Personal{
     private String nome;
     private String especialidade;
     private int Cref;
    
}
    public Personal(String nome, String especialidade, int Cref) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.Cref = Cref;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCref() {
        return Cref;
    }

    public void setCref(int Cref) {
        this.Cref = Cref;
    }
