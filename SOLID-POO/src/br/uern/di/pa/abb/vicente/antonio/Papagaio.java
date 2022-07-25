package br.uern.di.pa.abb.vicente.antonio;

public class Papagaio extends Passaro {
    public int distanciaMaximaDeVoo=120;
    
    public Papagaio(int distanciaMaximaDeVoo){
        this.distanciaMaximaDeVoo = distanciaMaximaDeVoo;
    }

    public int getDistanciaMaximaDeVoo(){
        return distanciaMaximaDeVoo;
    }
    
    public void setDistanciaMaximaDeVoo(int distanciaMaximaDeVoo){
        this.distanciaMaximaDeVoo = distanciaMaximaDeVoo;
    }
    
    @Override
    public void cantar(){
        System.out.println("Papagaio legal");
    }
    
    @Override
    public int voar(int valor){
        if(valor<distanciaMaximaDeVoo) return valor;
        return distanciaMaximaDeVoo;
    }
    
}
