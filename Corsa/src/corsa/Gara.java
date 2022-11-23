package corsa;

public class Gara {
    
    private String data;
    private String oraInizio;
    private Pista pisteDisponibili[];
    private Atleta atleti[];

    public Gara() {
    }

    public Gara(String data, String oraInizio, Pista[] pisteDisponibili, Atleta[] atleti) {
        this.data = data;
        this.oraInizio = oraInizio;
        this.pisteDisponibili = pisteDisponibili;
        this.atleti = atleti;
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

    @Override
    public String toString() {
        return "Gara{" + "data=" + data + ", oraInizio=" + oraInizio + ", pisteDisponibili=" + pisteDisponibili + ", atleti=" + atleti + '}';
    }
    
}
