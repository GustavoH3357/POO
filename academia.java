package academia;
import java.util.Scanner;
public class academia {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema de Academia!");
        System.out.println("Prazer meu nome é CARLÃO, sou seu Personal Trainer.");
        System.out.println("Para começarmos na academia, preciso saber qual seu BioTipo.");
        System.out.println("Você é ectomorfo, mesomorfo ou endomorfo?");
        String biotipo = Scanner.nextLine();
        System.out.println("Ótimo! Agora me diga o que voçêpa deseja treinar hoje?");
        System.out.println("Você deseja treinar a parte superior ou inferior do corpo?");
        String TipoDeTreino = Scanner.nextLine();
        System.out.println("Perfeito! Vamos começar o treino de " + TipoDeTreino + " para o biotipo " + biotipo + ".");
        System.out.println("Lembre-se de se hidratar e manter uma alimentação equilibrada.");
        aluno aluno = new aluno("Gustavo", 70.0, 1.75, biotipo);
        Personal personal = new Personal("Carlão", "Treinamento Funcional", 123);
        aluno.setPersonal(personal);
        
    }
}
