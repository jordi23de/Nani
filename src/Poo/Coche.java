package Poo;

/**
 *
 * @author jordi
 */
public class Coche {
    String Color;
    String Marca;
    int km;
    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.Color = "Blanco";
        coche1.Marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche1 es: "+coche1.Color);
        System.out.println("La marca del cohe1 es: "+coche1.Marca);
        System.out.println("El kilometraje del coche1 es: "+coche1.km);
        
        Coche coche2 = new Coche();
        coche2.Color = "Rojo";
        coche2.Marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("El color del coche1 es: "+coche2.Color);
        System.out.println("La marca del cohe1 es: "+coche2.Marca);
        System.out.println("El kilometraje del coche1 es: "+coche2.km);
    }
}
