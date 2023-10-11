import java.util.Scanner;

public class tablet {

    public String tamanho;
    public String armazenamento;
    public String processador;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o tamanho do tablet: ");
        int t = ler.nextInt();
        System.out.println("Informe o processador: " );
        int p = ler.nextInt();
        System.out.println("Informe o tamanho do armazenamento: ");
        int a = ler.nextInt();
    }

    
    public void processar() {
        // Implemente a lógica do processamento aqui
        System.out.println("Processando...");
    }

    public void armazenarDados() {
        // Implemente a lógica do armazenamento de dados aqui
        System.out.println("Armazenando dados...");
    }
}