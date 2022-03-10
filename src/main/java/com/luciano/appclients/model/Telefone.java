package com.luciano.appclients.model;

public class Telefone {

    private Integer id;
    private String ddd;
    private String telefone;

    public Telefone() {
    }

    public Telefone(Integer id, String ddd, String telefone) {
        this.id = id;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
