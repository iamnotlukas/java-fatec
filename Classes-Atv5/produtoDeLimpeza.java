import java.util.Scanner;

public class produtoDeLimpeza {
    public String nome;
    public String marca;
    public int quantidade;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o nome do produto de limpeza: ");
        String n = ler.nextLine();
        System.out.println("Informe a marca do produto de limpeza: ");
        String m = ler.nextLine();
        System.out.println("Informe a quantidade do produto de limpeza: ");
        int q = ler.nextInt();
    }
}
