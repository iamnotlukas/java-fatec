import java.util.Scanner;

public class navegador {
    public String nome;
    public String versao;
    public String plataforma;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o nome do navegador: ");
        String n = ler.nextLine();
        System.out.println("Informe a versão do navegador: ");
        String v = ler.nextLine();
        System.out.println("Informe a plataforma do navegador: ");
        String p = ler.nextLine();
    }

    public void abrirURL() {
        System.out.println("Abrindo URL...");
    }
}
