package org.fasttrackit.lab5magazin;

import java.util.List;

public class Produs {
    private int stock, pret;
    private String name;
    private int gramaj;
    private String descriere;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public List<CategorieProdus> getCategorii() {
        return categorii;
    }

    public void setCategorii(List<CategorieProdus> categorii) {
        this.categorii = categorii;
    }

    private List <CategorieProdus> categorii;

    @Override
    public boolean equals(Object obj){
        if (obj instanceof  Produs) {
            if(this.getName()==null){
                return false;
            }
            else{
           return this.getName().equals(((Produs) obj).getName());
        }}
        else {
            return false;
        }
    }
}
