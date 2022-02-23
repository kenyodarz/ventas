package com.bykenyodarz.ventas.utils;

public class GenerarSerie {

    private Integer dato;
    private String numero;

    public void numeroSerie(int dato) {
        this.dato = dato + 1;
        this.numero = "";
        if ((this.dato >= 1000000) && (this.dato <= 100000000)) {
            numero = String.format("{%s}", this.dato);
        }
        if ((this.dato >= 100000) && (this.dato <= 100000000)) {
            numero = String.format("0{%s}", this.dato);
        }
        if ((this.dato >= 10000) && (this.dato <= 100000000)) {
            numero = String.format("00{%s}", this.dato);
        }
        if ((this.dato >= 1000) && (this.dato <= 100000000)) {
            numero = String.format("000{%s}", this.dato);
        }
        if ((this.dato >= 100) && (this.dato <= 100000000)) {
            numero = String.format("0000{%s}", this.dato);
        }
        if ((this.dato >= 10) && (this.dato <= 100000000)) {
            numero = String.format("00000{%s}", this.dato);
        }
        if ((this.dato >= 9) && (this.dato <= 100000000)) {
            numero = String.format("000000{%s}", this.dato);
        }

    }

}
