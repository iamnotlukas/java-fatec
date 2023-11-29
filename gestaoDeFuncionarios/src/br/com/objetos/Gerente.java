package br.com.objetos;

public class Gerente extends Funcionarios{
    public void SolicitarMaterial(){
        System.out.println("""
                Qual material você deseja pedir? 
                1 - Computadores novos
                2 - Recursos para escritório""");
    }

    public void VerificarFuncionarios(){
        System.out.println("""
                Verificando se todos funcionários vieram....
                Nenhum funcionário faltou""");
    }

    public void Permitir(){
        System.out.println("Foi liberado! Siga em Frente.");
    }

    public void EscolhaGerente(){
        System.out.println("Você é um Gerente!");
    }

    public void trabalhar(){
        System.out.println("Subir para produção");
    }
}
