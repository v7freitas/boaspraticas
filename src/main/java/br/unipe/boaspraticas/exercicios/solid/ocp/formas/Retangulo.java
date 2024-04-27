package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

import br.unipe.boaspraticas.exercicios.solid.model.FormaGeometrica;

public class Retangulo implements CalculoFormasGeometricas {
    private double altura;
    private double largura;

    // Construtor, getters e setters omitidos
    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
