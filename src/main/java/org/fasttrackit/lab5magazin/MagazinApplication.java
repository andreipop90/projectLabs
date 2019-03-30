package org.fasttrackit.lab5magazin;

public class MagazinApplication {
    public static void main(String[] args) {
        CatalogDeProduse catalog = new CatalogDeProduse();

        Produs lapte = new Produs();
        lapte.setName("lapte");

        Produs lapte2 = new Produs();
        lapte2.setName("lapte");

        Produs productTwo = new Produs();
        productTwo.setName("paine");

        catalog.addProduct(lapte);
        catalog.addProduct(lapte2);
        catalog.addProduct(productTwo);

        System.out.println("Magazinul are acest numar de produse: " + catalog.getNumberOfProducts());
    }
}
