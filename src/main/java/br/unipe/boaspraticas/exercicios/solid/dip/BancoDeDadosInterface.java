package br.unipe.boaspraticas.exercicios.solid.dip;

public interface BancoDeDadosInterface {
    // Lógica para salvar o pedido no banco de dados
    void salvarPedido(Pedido pedido);
}
