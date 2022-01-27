package com.fare.travelcard.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "wallet")
public class Wallet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cardnumber",unique = true)
    private String cardNumber;

    @Column(name = "amount")
    private String amount;

    protected Wallet() {
    }

    public Wallet(String cardNumber, String amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }


}
