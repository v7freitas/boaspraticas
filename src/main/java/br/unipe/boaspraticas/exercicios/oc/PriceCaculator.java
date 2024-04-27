package br.unipe.boaspraticas.exercicios.oc;

import br.unipe.boaspraticas.exercicios.solid.model.Item;

import java.util.List;

public class PriceCaculator {

    public double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPreco();
        }
        System.out.println("Total Price: " + totalPrice);
        return totalPrice;
    }

}

