package br.uern.di.pa.abb.vicente.antonio;

public class Main{
    public static void main(String[] args){
        Papagaio p = new Papagaio(20);
        Currupio c = new Currupio(15);
        p.cantar();
        c.cantar();
        
        System.out.println("Papagaio voa: " + p.getDistanciaMaximaDeVoo());
        System.out.println("Currupio voa: " + c.getDistanciaMaximaDeVoo());
    }
}