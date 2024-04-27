package br.unipe.boaspraticas.exercicios.solid.dip;

class Pedido {

    private final BancoDeDadosInterface bancoDeDadosInterface;

    public Pedido(BancoDeDadosInterface bancoDeDadosInterface) {
        this.bancoDeDadosInterface = bancoDeDadosInterface; // Violando o DIP - dependência direta de uma classe concreta
    }

    public void salvar() {
        bancoDeDadosInterface.salvarPedido(this);
    }
}
