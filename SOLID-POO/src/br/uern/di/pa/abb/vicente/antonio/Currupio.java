package br.uern.di.pa.abb.vicente.antonio;

public class Currupio extends Passaro {
    public int distanciaMaximaDeVoo=100;
    
    public Currupio (int distanciaMaximaDeVoo){
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
        System.out.println("Pio friu fru  fri Pió");
    }
    
    @Override
    public int voar(int valor){
        if(valor<distanciaMaximaDeVoo) return valor;
        return distanciaMaximaDeVoo;
    }
}
