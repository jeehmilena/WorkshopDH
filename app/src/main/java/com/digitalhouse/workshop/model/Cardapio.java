package com.digitalhouse.workshop.model;

public class Cardapio {

    private String nomeItem;
    private double precoItem;
    private boolean status;

    public Cardapio(String nomeItem, double precoItem, boolean status) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        this.status = status;
    }

    public Cardapio() {
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "nomeItem='" + nomeItem + '\'' +
                ", precoItem=" + precoItem +
                ", status=" + status +
                '}';
    }
}