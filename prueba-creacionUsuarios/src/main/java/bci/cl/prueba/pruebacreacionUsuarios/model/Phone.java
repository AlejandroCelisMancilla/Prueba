package bci.cl.prueba.pruebacreacionUsuarios.model;

import jakarta.persistence.Column;

public class Phone {

    private String number;
    private String cityCode;
    private String contryCode;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getContryCode() {
        return contryCode;
    }

    public void setContryCode(String contryCode) {
        this.contryCode = contryCode;
    }

    public Phone(String number, String cityCode, String contryCode) {
        this.number = number;
        this.cityCode = cityCode;
        this.contryCode = contryCode;
    }

    public Phone() {
    }
}
