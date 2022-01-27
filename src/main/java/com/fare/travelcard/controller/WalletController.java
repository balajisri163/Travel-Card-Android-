package com.fare.travelcard.controller;

import com.fare.travelcard.model.Wallet;
import com.fare.travelcard.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    @Autowired
    WalletRepository repository;

    @PostMapping("/create")
    public String create(@RequestParam String cardnumber,@RequestParam String amount){
        // save a single wallet
        repository.save(new Wallet(cardnumber,amount));
        return "Wallet is created";
    }


}
