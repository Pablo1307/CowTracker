package pl.springbootapp.CowTracker.Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Krowy implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numerKolczyka;
    private String nazwa;
    private String dataUrodzenia;
    private String dataZacielenia;
    private String dataSprzedazy;
    private String cowCode;

    public Krowy(){
    }

    public Krowy(Long id, String numerKolczyka, String nazwa, String dataUrodzenia, String dataZacielenia, String dataSprzedazy, String cowCode) {
        this.id = id;
        this.numerKolczyka = numerKolczyka;
        this.nazwa = nazwa;
        this.dataUrodzenia = dataUrodzenia;
        this.dataZacielenia = dataZacielenia;
        this.dataSprzedazy = dataSprzedazy;
        this.cowCode = cowCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumerKolczyka() {
        return numerKolczyka;
    }

    public void setNumerKolczyka(String numerKolczyka) {
        this.numerKolczyka = numerKolczyka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getDataZacielenia() {
        return dataZacielenia;
    }

    public void setDataZacielenia(String dataZacielenia) {
        this.dataZacielenia = dataZacielenia;
    }

    public String getDataSprzedazy() {
        return dataSprzedazy;
    }

    public void setDataSprzedazy(String dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
    }

    public String getCowCode() {
        return cowCode;
    }

    public void setCowCode(String cowCode) {
        this.cowCode = cowCode;
    }

    @Override
    public String toString() {
        return "Krowy{" +
                "id=" + id +
                ", numerKolczyka='" + numerKolczyka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", dataZacielenia='" + dataZacielenia + '\'' +
                ", dataSprzedazy='" + dataSprzedazy + '\'' +
                ", cowCode='" + cowCode + '\'' +
                '}';
    }
}
