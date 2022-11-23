package corsa;

public class Pista {

    private int pista;
    String condizioni;
    private double lunghezza;
    private int nCorsie;
    
    public Pista (){}
    
    public Pista (int pista, String condizioni, double lunghezza, int Corsie){
        this.pista = pista;
        this.condizioni = condizioni;
        this.lunghezza = lunghezza;
        this.nCorsie = nCorsie;
    }
    
    public int getPista (){
        return pista;
    }
    
    public String getCondizioni (){
        return condizioni;
    }
    
    public double getLunghezza (){
        return lunghezza;
    }

    public int getNCorsie (){
        return nCorsie;
    }

    public void setPista(int pista) {
        this.pista = pista;
    }

    public void setCondizioni(String condizioni) {
        this.condizioni = condizioni;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void setnCorsie(int nCorsie) {
        this.nCorsie = nCorsie;
    }

    @Override
    public String toString() {
        return "Pista: " + "condizioni:" + condizioni + ", lunghezza: " + lunghezza + ", numero delle corsie: " + nCorsie + '}';
    }
}