package academia;

public class aluno {
    private String nome;
     private double peso;
     private double altura;
     private String BioTipo;
     private Treino treino;
     private Personal personal;
}

public aluno(String nome, double peso, double altura, String BioTipo) {
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
    this.BioTipo = BioTipo;
}
public void setBioTipo(String BioTipo) {
    this.BioTipo = BioTipo;
}

public String getBioTipo() {
    return BioTipo;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getNome() {
    return nome;
}
public void setPeso(double peso) {
    this.peso = peso;
}
public double getPeso() {
    return peso;
}
public void setAltura(double altura) {
    this.altura = altura;
}    
public double getAltura() {
    return altura;
}
public void setTreino(Treino treino) {
    this.treino = treino;
}
public Treino getTreino() {
    return treino;
}
public void setPersonal(Personal personal) {
    this.personal = personal;
}
public Personal getPersonal() {
    return personal;
}
