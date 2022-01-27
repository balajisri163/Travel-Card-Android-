package com.fare.travelcard.repository;

import com.fare.travelcard.model.Station;
import com.fare.travelcard.model.Wallet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WalletRepository extends CrudRepository<Wallet, String> {

}

