package com.bykenyodarz.ventas.utils;

public class GenerarSerie {

    private Integer dato;
    private String numero;

    public Integer getDato() {
        return dato;
    }

    public String getNumero() {
        return numero;
    }

    public void numeroSerie(int dato) {
        this.dato = dato + 1;
        numero = "";
        if ((this.dato >= 1000000) && (this.dato <= 100000000)) {
            numero = String.format("%s", this.dato);
        }
        if ((this.dato >= 100000) && (this.dato <= 999999)) {
            numero = String.format("0%s", this.dato);
        }
        if ((this.dato >= 10000) && (this.dato <= 99999)) {
            numero = String.format("00%s", this.dato);
        }
        if ((this.dato >= 1000) && (this.dato <= 9999)) {
            numero = String.format("000%s", this.dato);
        }
        if ((this.dato >= 100) && (this.dato <= 999)) {
            numero = String.format("0000%s", this.dato);
        }
        if ((this.dato >= 10) && (this.dato <= 99)) {
            numero = String.format("00000%s", this.dato);
        }
        if ((this.dato <= 9)) {
            numero = String.format("000000%s", this.dato);
        }

    }

}
