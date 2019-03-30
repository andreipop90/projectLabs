package org.fasttrackit.lab5magazin;

import java.util.ArrayList;
import java.util.List;

public class CatalogDeProduse {
    private List<Produs> produse = new ArrayList<>();

    public void addProduct(Produs produsToAdd){
//        for(Produs p: produse){
//            if(p.getNume().equals(produsToAdd.getNume())){
//                p.setStock(p.getStock()+1);
//                break;
//            }
//            else {
//
//            }
//        }
//        produse.add(produsToAdd);
        if(produse.contains(produsToAdd)){
            int index = produse.indexOf(produsToAdd);
            Produs alreadyExistingProduct = produse.get(index);
            alreadyExistingProduct.setStock(alreadyExistingProduct.getStock()+1);
        }
        else {
            produse.add(produsToAdd);
        }
    }

    public int getNumberOfProducts(){
        return produse.size();
    }


}
