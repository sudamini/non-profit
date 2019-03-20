package com.sportscontender.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="customer")
public class Customer implements Serializable {
    //TODO you can have a class called Name and store firstName, lastName in it.
    @Id
    private String loginId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="address1")
    private String address1;
    @Column(name="state")
    private String state;
    @Column(name="email_address")
    private String emailId;
    @Column(name="password")
    private String password;

    public String getAddress1() {
        return address1;
    }

    public String getState() {
        return state;
    }

    public String getPassword() {
        return password;
    }

    public Customer(String loginId, String firstName, String lastName, String address1, String state, String emailId, String password) {
        this.loginId = loginId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.state = state;
        this.emailId = emailId;
        this.password = password;
    }

    protected Customer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getEmailId() {
        return emailId;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "loginId='" + loginId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address1='" + address1 + '\'' +
                ", state='" + state + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
