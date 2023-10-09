public class Triangulo extends Figura {
    private int base, altura;

    public Triangulo(int base, int altura, String tipo){
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    public int getBase(){
        return base;
    }

    public int getAltura(){
        return altura;
    }

    /*
     * Sobreescritura del metodo area()
     * Este fragmento de código anula el método area() de una superclase. 
     * Calcula el área de un triángulo multiplicando su base y altura, y luego divide 
     * el resultado por 2. Las variables base y altura son propiedades del objeto actual.
     */
    @Override
    public double area(){
        return (double) this.base * this.altura / 2;
    }
}
