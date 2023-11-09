package br.com.polimorfismo.objetos;

public class Aluno {
    private String nome;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void imprimirDados(){
        System.out.println("Nome do aluno é: " + getNome());
        System.out.println("Número da matrícula: " + getMatricula());
    }
}
