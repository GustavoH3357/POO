package academia;
public class Treino {
    private int dias_por_semana;
    private String objetivo;
    private TreinoInferior treinoInferior;
    private TreinoSuperior treinoSuperior;

}
public Treino(int dias_por_semana, String objetivo, TreinoInferior treinoInferior, TreinoSuperior treinoSuperior) {
        this.dias_por_semana = dias_por_semana;
        this.objetivo = objetivo;
        this.treinoInferior = treinoInferior;
        this.treinoSuperior = treinoSuperior;
    }

    public int getDiasPorSemana() {
        return dias_por_semana;
    }

    public void setDiasPorSemana(int dias_por_semana) {
        this.dias_por_semana = dias_por_semana;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public TreinoInferior getTreinoInferior() {
        return treinoInferior;
    }

    public void setTreinoInferior(TreinoInferior treinoInferior) {
        this.treinoInferior = treinoInferior;
    }

    public TreinoSuperior getTreinoSuperior() {
        return treinoSuperior;
    }

    public void setTreinoSuperior(TreinoSuperior treinoSuperior) {
        this.treinoSuperior = treinoSuperior;
    }
}
