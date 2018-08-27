package model;

public class Cardapio {

    private String nomeItem;
    private double precoItem;

    public Cardapio(String nomeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
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

    @Override
    public String toString() {
        return "Cardapio{" +
                "nomeItem='" + nomeItem + '\'' +
                ", precoItem=" + precoItem +
                '}';
    }
}