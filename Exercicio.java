package academia;

public class Exercicio {
 private String nome;
    private int series;
    private int repeticoes;
    private int carga;
}
Exercicio(String nome, int series, int repeticoes, int carga) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
    }

 public String getNome() {
     return nome;
 }
 public void setNome(String nome) {
     this.nome = nome;
 }
 public int getSeries() {
     return series;
 }
 public void setSeries(int series) {
     this.series = series;
 }
 public int getRepeticoes() {
     return repeticoes;
 }
public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
public int getCarga() {
        return carga;
    }
public void setCarga(int carga) {
        this.carga = carga;
    }
