
/**
 *
 * @author Ana Mel
 */
public class Aplic {
    public static void main(String[] args) {
        Circulo objCirc; //define o objeto
        
        objCirc = new Circulo(); //conecta
        
        objCirc.setRaio(1.0);
        
        System.out.println("Medida do raio: " + objCirc.getRaio());
        
        System.out.println("Medida da área: " + objCirc.calcArea());
        
        System.out.println("Medida do perímetro: " + objCirc.calcPerimetro());
        
        System.out.println("Medida do diâmetro: " + objCirc.calcDiametro());
        
        //novo objeto abaixo
        
        Circulo objCirc2;
        
        objCirc2 = new Circulo();

        objCirc2.setRaio(2.5);
        
        System.out.println("Medida do raio: " + objCirc2.getRaio());
        
        System.out.println("Medida da área: " + objCirc2.calcArea());
        
        System.out.println("Medida do perímetro: " + objCirc2.calcPerimetro());
        
        System.out.println("Medida do diâmetro: " + objCirc2.calcDiametro());

    }
    
    
}
