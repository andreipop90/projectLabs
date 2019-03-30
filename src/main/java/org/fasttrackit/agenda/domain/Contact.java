package org.fasttrackit.agenda.domain;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Contact(){
        super();
        phoneNumber = "";
    }

    public Contact(String firstNameParam, String lastNameParam){
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
    }

    public Contact(String firstName, String lastName, String ad){
        this(firstName, lastName);
        this.address = ad;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        if (firstName.equals("")){
            throw new IllegalArgumentException("First name cannto be null");
        }
        else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "First name is: " + firstName +
                " and la name is: " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        Contact second = (Contact) o;
        if (second.getFirstName().equals(this.firstName) &&
                second.getLastName().equals(this.getLastName())) {
            return true;
        }
        return false;
        }
    }

