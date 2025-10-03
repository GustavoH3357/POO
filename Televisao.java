
import java.util.List;

public class Televisao {
private int numeroTv;
private int volume;
private boolean ligada;
private List canais;
private int canalAtualIndice;

public Televisao(int numeroTv, List canais) {
this.numeroTv = numeroTv;
this.canais = canais;
this.volume = 10;
this.ligada = false;
this.canalAtualIndice = 0;
}

public void ligar() {
ligada = true;
System.out.println("Televisão ligada!");
}

public void desligar() {
ligada = false;
System.out.println("Televisão desligada!");
}

public void aumentarVolume() {
if (ligada && volume < 100) {
volume++;
}
}

public void diminuirVolume() {
if (ligada && volume > 0) {
volume--;
}
}

public void trocarCanal() {
if (ligada) {
canalAtualIndice = (canalAtualIndice + 1) % canais.size();
}
}

public void escolherCanalPorNumero(int numero) {
if (ligada) {
for (int i = 0; i < canais.size(); i++) {
if (((Canal) canais.get(i)).getNumero() == numero) {
canalAtualIndice = i;
return;
}
}
System.out.println("Canal não encontrado!");
}
}

public Canal getCanalAtual() {
return (Canal) canais.get(canalAtualIndice);
}

public int getVolume() {
return volume;
}

public int getNumeroTv() {
return numeroTv;
}

public boolean isLigada() {
return ligada;
}

/**
 * 
 */
public void listarCanais() {
System.out.println("Lista de canais:");
for (Canal canal : canais) {
System.out.println(canal);
}
}

public void mostrarInformacoes() {
System.out.println("TV Número: " + numeroTv);
System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
System.out.println("Volume: " + volume);
System.out.println("Canal Atual: " + getCanalAtual());
}
}