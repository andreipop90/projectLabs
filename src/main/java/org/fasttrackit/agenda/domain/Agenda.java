package org.fasttrackit.agenda.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String nameAgenda;
    private String owner;
    private List<Contact> contactList;

    public String getNameAgenda() {
        return nameAgenda;
    }

    public void setNameAgenda(String nameAgenda) {
        this.nameAgenda = nameAgenda;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public static void main(String[] args) {
        Contact firstContact = new Contact();
        Contact contact2 = new Contact();

        firstContact.setFirstName("Costel");
        firstContact.setLastName("Marin");

        Contact secondContact = new Contact();

        secondContact.setFirstName("Ana");
        secondContact.setLastName("Pop");
        System.out.println(firstContact.toString());

        Agenda agenda = new Agenda();

        agenda.getContactList().add(firstContact);
        agenda.getContactList().add(secondContact);

        Contact contact0 = new Contact("Vasile", "Muresan");
        Contact contactX = new Contact("Ion", "Maria", "Strada strazii");
        agenda.getContactList().add(contact0);
    }
}
