import java.util.Scanner;

public class barco {
    public String tamanho;
    public String cor;
    public String nome;
    public String composicao;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o tamanho do barco: ");
        String t = ler.nextLine();
        System.out.println("Informe a cor do barco: ");
        String c = ler.nextLine();
        System.out.println("Informe o nome do barco: ");
        String n = ler.nextLine();
        System.out.println("Informe a composição do barco: ");
        String comp = ler.nextLine();
    }

    public void flutuar() {
        System.out.println("Flutuando...");
    }
}
