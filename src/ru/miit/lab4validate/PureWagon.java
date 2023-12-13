package ru.miit.lab4validate;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Андрей on 01.04.2017.
 */
public class PureWagon {
    private String nomVag = null;     // Номер вагона

    private String id;                // ID_VAG - системный идентификатор номера вагона
    private String idPoezd = null;    // Идентификатор поезда

    private String npf = null;        // код нпф

    private Integer npp;                  // Порядковый номер вагона в составе

    private String esrNazV = null;    // ЕСР станции назначения вагона

    private Integer vesGruz;          // Вес груза в килограммах

    private Double udl;         // Условная длина вагона

    public PureWagon() {
    }

    public String getNomVag() {
        return nomVag;
    }

    public void setNomVag(String nomVag) {
        this.nomVag = nomVag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPoezd() {
        return idPoezd;
    }

    public void setIdPoezd(String idPoezd) {
        this.idPoezd = idPoezd;
    }

    public String getNpf() {
        return npf;
    }

    public void setNpf(String npf) {
        this.npf = npf;
    }

    public int getNpp() {
        return npp;
    }

    public void setNpp(int npp) {
        this.npp = npp;
    }

    public String getEsrNazV() {
        return esrNazV;
    }

    public void setEsrNazV(String esrNazV) {
        this.esrNazV = esrNazV;
    }

    public int getVesGruz() {
        return vesGruz;
    }

    public void setVesGruz(int vesGruz) {
        this.vesGruz = vesGruz;
    }

    public double getUdl() {
        return udl;
    }

    public void setUdl(double udl) {
        this.udl = udl;
    }
}
