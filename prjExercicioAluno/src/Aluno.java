
/**
 *
 * @author Ana Mel
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    private double MediaProv;
    private double MediaTrab;
    
    public void setRA(int r){
        RA = r;
    }
    
    public void setNtPrv1(int p1){
        NtPrv1 = p1;
    }
    
    public void setNtPrv2(int c){
        NtPrv2 = c;
    }
    
    public void setNtTrab1(int d){
        NtTrab1 = d;
    }
    
    public void setNtTrab2(int e){
        NtTrab2 = e;
    }
    
    public int getRA() {
        return(RA);
    }
    
    public double getNtPrv1() {
        return(NtPrv1);
    }
    
    public double getNtPrv2() {
        return(NtPrv2);
    }
    
    public double getNtTrab1() {
        return(NtTrab1);
    }
    
    public double getNtTrab2() {
        return(NtTrab2);
    }
    
    public double calcMediaProva() {
        MediaProv = (0.75 * (NtPrv1 + (2 * NtPrv2)))/3;
        return(MediaProv);
    }
    
    public double calcMediaTrab() {
        MediaTrab = (0.25 * (NtTrab1 + NtTrab2))/2;
        return(MediaTrab);
    }
    
    public double calcMediaFInal() {
        return(calcMediaProva() + calcMediaTrab()); //copiar os codigos OU chamar ambos métodos
    }
}
