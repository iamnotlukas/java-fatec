import java.util.Scanner;

public class cao {
    public String raca;
    public String tamanho;
    public String nome;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe a raça do cão: ");
        String r = ler.nextLine();
        System.out.println("Informe o tamanho do cão: ");
        String t = ler.nextLine();
        System.out.println("Informe o nome do cão: ");
        String n = ler.nextLine();
    }

    public void latir() {
        System.out.println("Latindo...");
    }

    public void beberAgua() {
        System.out.println("Bebendo água...");
    }
}
