package br.unipe.boaspraticas.exercicios.solid.ocp;

import br.unipe.boaspraticas.exercicios.solid.model.Compra;
import br.unipe.boaspraticas.exercicios.solid.model.Desconto;
import br.unipe.boaspraticas.exercicios.solid.model.ItemCompra;

// Classe responsável por calcular o valor total de uma compra
public class CalculadoraDeCompra {

    public double calcularTotal(Compra compra) {
        return compra.calcularTotal();
    }
}


