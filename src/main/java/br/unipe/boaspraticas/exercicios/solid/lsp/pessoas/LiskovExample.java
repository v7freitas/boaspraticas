package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {
        // Usando polimorfismo com a referência da classe base (Pessoa)
        Pessoa pessoa = new Pessoa("João");
        pessoa.fazerSom(); // Oi!

        // Usando a referência da classe derivada (Funcionario)
        Funcionario funcionario = new Funcionario("Maria", 4000);
        funcionario.fazerSom(); // Bom dia!

    }
}
