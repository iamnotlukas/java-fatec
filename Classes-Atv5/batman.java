import java.util.Scanner;

public class batman {
    public String nome;
    public String superPoder;
    public String cidade;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o nome do Batman: ");
        String n = ler.nextLine();
        System.out.println("Informe o super poder do Batman: ");
        String sp = ler.nextLine();
        System.out.println("Informe a cidade do Batman: ");
        String c = ler.nextLine();
    }

    public void lutar() {
        System.out.println("Lutando contra o crime...");
    }

    public void patrulhar() {
        System.out.println("Patrulhando a cidade...");
    }
}
