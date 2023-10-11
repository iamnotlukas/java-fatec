import java.util.Scanner;

public class engenheiro {
    public String nome;
    public String especialidade;
    public int anosDeExperiencia;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o nome do engenheiro: ");
        String n = ler.nextLine();
        System.out.println("Informe a especialidade do engenheiro: ");
        String esp = ler.nextLine();
        System.out.println("Informe os anos de experiência do engenheiro: ");
        int anos = ler.nextInt();
    }

    public void projetar() {
        System.out.println("Projetando...");
    }

    public void construir() {
        System.out.println("Construindo...");
    }
}
