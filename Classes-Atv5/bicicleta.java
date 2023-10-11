import java.util.Scanner;

public class bicicleta {
    public String peso;
    public String cor;
    public String modelo;
    
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o peso da bicicleta: ");
        String p = ler.nextLine();
        System.out.println("Informe a cor da bicicleta: ");
        String c = ler.nextLine();
        System.out.println("Informe o modelo da bicicleta: ");
        String m = ler.nextLine();
    }
}
