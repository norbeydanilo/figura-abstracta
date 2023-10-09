public class Ovalo extends Figura {
    private int r1, r2;

    public Ovalo(int r1, int r2, String tipo){
        super(tipo);
        this.r1 = r1;
        this.r2 = r2;
    }
    
    public int getR1(){
        return r1;
    }

    public int getR2(){
        return r2;
    }

    /*
     * Sobreescritura del metodo area()
     * Este fragmento de código anula el método area() de una superclase. 
     * Calcula el área de una elipse multiplicando los valores 
     * de r1 y r2 (los radios de la elipse) por Math.PI.
     */
    @Override
    public double area(){
        return this.r1 * this.r2 * Math.PI;
    }
}
