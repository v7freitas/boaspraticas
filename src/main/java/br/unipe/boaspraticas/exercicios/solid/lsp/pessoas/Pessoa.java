package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

import lombok.Getter;

@Getter
class Pessoa implements FazerSom{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void fazerSom() {
        System.out.println("Oi!");
    }
}
