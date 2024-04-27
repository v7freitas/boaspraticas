package br.unipe.boaspraticas.exercicios.solid.sip.animais;

class Peixe implements Animal, AnimalNadador {
    @Override
    public void comer() {
        System.out.println("O peixe está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O peixe está dormindo.");
    }


    @Override
    public void nadar() {
        System.out.println("O peixe está nadando.");
    }
}
