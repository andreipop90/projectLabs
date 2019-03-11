package org.fasttrackit.catel;

public class Catel {

    private String name;
    private int greutate;
    private int varsta;

    public Catel(String name, int greutate, int varsta) {
        this.name=name;
        this.greutate=greutate;
        this.varsta=varsta;
    }

    public Catel() {
    }

    public void latra(){
        System.out.println("ham");
    }

    public void mananca(){
        greutate++;
        if(greutate>=10){
            varsta++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGreutate() {
        return greutate;
    }

    public int getVarsta() {
        return varsta;
    }
}
