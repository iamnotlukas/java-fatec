package br.com.polimorfismo.objetos;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void imprimirDados(){
        System.out.println("Disciplina: " + getNome());
        System.out.println("Carga Horária da disciplina: " + getCargaHoraria());
    }
}
