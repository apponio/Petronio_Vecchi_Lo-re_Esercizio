package corsa;

public class Gara {
    
    private String data;
    private String oraInizio;
    private Pista pisteDisponibili[] = new Pista[10];
    private Atleta atleti[] = new Atleta[6];

    
    public Gara() {
    }
    
    public Gara(String data, String oraInizio) {
        this.data = data;
        this.oraInizio = oraInizio;
    }

    public String getData() {
        return data;
    }

    public String getOraInizio() {
        return oraInizio;
    }

    public Pista[] getPisteDisponibili() {
        return pisteDisponibili;
    }

    public Atleta[] getAtleti() {
        return atleti;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOraInizio(String oraInizio) {
        this.oraInizio = oraInizio;
    }

    public void setPisteDisponibili(Pista[] pisteDisponibili) {
        this.pisteDisponibili = pisteDisponibili;
    }

    public void setAtleti(Atleta[] atleti) {
        this.atleti = atleti;
    }

    
    
}
