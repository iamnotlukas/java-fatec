import java.util.Scanner;

public class biologo {
    public String nome;
    public String especialidade;
    public int anosDeExperiencia;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o nome do biólogo: ");
        String n = ler.nextLine();
        System.out.println("Informe a especialidade do biólogo: ");
        String esp = ler.nextLine();
        System.out.println("Informe os anos de experiência do biólogo: ");
        int anos = ler.nextInt();
    }

    public void pesquisar() {
        System.out.println("Pesquisando...");
    }
}
