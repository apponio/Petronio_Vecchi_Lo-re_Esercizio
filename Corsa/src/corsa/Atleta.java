
package corsa;

public class Atleta {
    
    private String nome;
    private String cognome;
    private String dataDiNascita;
    private String [] specialità;

    public Atleta(String nome, String cognome, String dataDiNascita, String[] specialità) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.specialità = specialità;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String[] getSpecialità() {
        return specialità;
    }

    public void setSpecialità(String[] specialità) {
        this.specialità = specialità;
    }
    
    
    
    
}
