import java.util.Scanner;

/**
 *
 * @author Ana Mel
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Defincição da variável ponteiro
        //Retangulo objRet; //não é estritamente necessário nessa situação
        //Instanciação(alocação) do objeto da classe Retangulo
        
        System.out.println("Digite a unidade de medida: ");
        String unidade = entrada.next();
        
        Retangulo objRet = new Retangulo(unidade);

        
        //Passagem de mensagens
        objRet.setAltura(5.0); 
        
        objRet.setBase(8.0);
                
        System.out.println("Medida da altura: " + objRet.getAltura());
        
        System.out.println("Medida da base: " + objRet.getBase());
        
        System.out.println("Medida da Área: " + objRet.calcArea());
        
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
        
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
        
        //novo objeto abaixo

        Retangulo objRet1 = new Retangulo(unidade);
        
        objRet1.setAltura(4.0);
        objRet1.setBase(3.0);
        
        System.out.println("Medida da altura: " + objRet1.getAltura() + " " +
                objRet1.getUnidadeMedida());
        
        System.out.println("Medida da base: " + objRet1.getBase() + " " +
                objRet1.getUnidadeMedida());
        
        System.out.println("Medida da Área: " + objRet1.calcArea() + " " +
                objRet1.getUnidadeMedida());
        
        System.out.println("Medida do perímetro: " + objRet1.calcPerimetro() + " " +
                objRet1.getUnidadeMedida());
        
        System.out.println("Medida da diagonal: " + objRet1.calcDiagonal() + " " +
                objRet1.getUnidadeMedida());
    }
    
}
