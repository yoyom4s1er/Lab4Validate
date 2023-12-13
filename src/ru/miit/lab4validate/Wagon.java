package ru.miit.lab4validate;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Андрей on 19.03.2017.
 */
public class Wagon {
    @NotNull (message="Номер для вагона должен быть задан")
    @Size(min = 10, message="Номер для вагона должен быть минимум 10 символов")
    private String nomVag = null;     // Номер вагона
    @NotNull (message="Идентификатор для вагона должен быть задан")
    private String id;                // ID_VAG - системный идентификатор номера вагона
    private String idPoezd = null;    // Идентификатор поезда
    @NotNull (message="Назначение плана формирования для вагона должно быть задано")
    @Size(min = 4, message="Назначение плана формирования для вагона должно быть минимум 4 символа")
    private String npf = null;        // код нпф
    @Range(min = 1, max = 170, message="Порядковый номер вагона в составе для вагона должен быть не меньше 1 и не больше 160")
    private Integer npp;                  // Порядковый номер вагона в составе
    @Size(min = 6, message="Станция назначения для вагона должна быть минимум 6 символов")
    private String esrNazV = null;    // ЕСР станции назначения вагона

    private Integer vesGruz;          // Вес груза в килограммах
    @NotNull (message="Условная длина для вагона должна быть задана")
    @Min(value = 1, message = "Условная длина для вагона должна быть больше 1 условнго вагона")
    private Double udl;         // Условная длина вагона

    public Wagon() {
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
