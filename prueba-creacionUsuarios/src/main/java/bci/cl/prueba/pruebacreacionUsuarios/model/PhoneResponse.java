package bci.cl.prueba.pruebacreacionUsuarios.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneResponse {
    @JsonProperty(value = "number")
    private String number;
    @JsonProperty(value = "cityCode")
    private String cityCode;
    @JsonProperty(value = "contryCode")
    private String contryCode;

    public PhoneResponse(String number, String cityCode, String contryCode) {
        this.number = number;
        this.cityCode = cityCode;
        this.contryCode = contryCode;
    }

    public PhoneResponse() {
    }

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
}
