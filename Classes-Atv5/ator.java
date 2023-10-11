import java.util.Scanner;

public class ator {
    public String nome;
    public String sexo;
    public String especialidade;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o nome do ator: ");
        String n = ler.nextLine();
        System.out.println("Informe o sexo do ator: ");
        String s = ler.nextLine();
        System.out.println("Informe a especialidade do ator: ");
        String esp = ler.nextLine();
    }

    public void atuar() {
        System.out.println("Atuando...");
    }
}
