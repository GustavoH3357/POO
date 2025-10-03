import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tvprincipal{
public static void main(String[] args) {
List canais = new ArrayList<>();
canais.add(new Canal(1, "Globo"));
canais.add(new Canal(2, "SBT"));
canais.add(new Canal(3, "Record"));
canais.add(new Canal(4, "Band"));

Televisao tv = new Televisao(101, canais);

Scanner scanner = new Scanner(System.in);
int opcao;
do {
System.out.println("\nMenu:");
System.out.println("1. Ligar TV");
System.out.println("2. Desligar TV");
System.out.println("3. Aumentar Volume");
System.out.println("4. Diminuir Volume");
System.out.println("5. Escolher Canal pelo número");
System.out.println("6. Listar Canais");
System.out.println("7. Ver Informações da TV");
System.out.println("0. Sair");
System.out.print("Escolha uma opção: ");
opcao = scanner.nextInt();

switch (opcao) {
case 1:
tv.ligar();
break;
case 2:
tv.desligar();
break;
case 3:
tv.aumentarVolume();
break;
case 4:
tv.diminuirVolume();
break;
case 5:
System.out.print("Digite o número do canal: ");
int numCanal = scanner.nextInt();
tv.escolherCanalPorNumero(numCanal);
break;
case 6:
tv.listarCanais();
break;
case 7:
tv.mostrarInformacoes();
break;
case 0:
System.out.println("Saindo");
break;
default:
System.out.println("Opção inválida!");
}
} while (opcao != 0);

scanner.close();
}
}