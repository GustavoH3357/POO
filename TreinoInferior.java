package academia;

import java.util.List;

public class TreinoInferior {
    List<String> exerciciosInferiores;
    private String nomeTreinoInferior;
    private int seriesInferiores;
    private int repeticoesInferiores;
    private int cargaInferiores;


public TreinoInferior(String nomeTreinoInferior, int seriesInferiores, int repeticoesInferiores, int cargaInferiores) {
        this.nomeTreinoInferior = nomeTreinoInferior;
        this.seriesInferiores = seriesInferiores;
        this.repeticoesInferiores = repeticoesInferiores;
        this.cargaInferiores = cargaInferiores;
    }

    public String getNomeTreinoInferior() {
        return nomeTreinoInferior;
    }

    public void setNomeTreinoInferior(String nomeTreinoInferior) {
        this.nomeTreinoInferior = nomeTreinoInferior;
    }

    public int getSeriesInferiores() {
        return seriesInferiores;
    }

    public void setSeriesInferiores(int seriesInferiores) {
        this.seriesInferiores = seriesInferiores;
    }

    public int getRepeticoesInferiores() {
        return repeticoesInferiores;
    }

    public void setRepeticoesInferiores(int repeticoesInferiores) {
        this.repeticoesInferiores = repeticoesInferiores;
    }

    public int getCargaInferiores() {
        return cargaInferiores;
    }

    public void setCargaInferiores(int cargaInferiores) {
        this.cargaInferiores = cargaInferiores;
    }
}
