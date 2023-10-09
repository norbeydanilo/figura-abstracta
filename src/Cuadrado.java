public class Cuadrado extends Figura {
    private int lado;
    
    public Cuadrado(int lado, String tipo){
        super(tipo);
        this.lado = lado;
    }

    public int getLado(){
        return lado;
    }

    /*
     * Sobreescritura del metodo area()
     * Este fragmento de código anula el método area() de una superclase. 
     * Calcula el área de un cuadrado multiplicando el valor de lado 
     * (que representa la longitud de un lado del cuadrado) por sí mismo.
     */
    @Override
    public double area(){
        return this.lado * this.lado;
    }
}
