package com.fare.travelcard.controller;


import com.fare.travelcard.model.Station;
import com.fare.travelcard.model.StationUI;
import com.fare.travelcard.model.Wallet;
import com.fare.travelcard.repository.StationRepository;
import com.fare.travelcard.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StationController {

    @Autowired
    StationRepository repository;


    @GetMapping("/bulkcreate")
    public String bulkcreate(){
        repository.save(new Station("Hamilton", "1"));
        repository.saveAll(Arrays.asList(new Station("Thunder Bay", "1,2")
                , new Station("Dryden", "3")
                , new Station("Slate Falls", "2")));

        return "Stations are created";
    }

    @PostMapping("/createstation")
    public String create(@RequestParam String stationname, @RequestParam String zone){
        repository.save(new Station(stationname,zone));
        return "Zone is created";
    }

    @GetMapping("/getstation")
    public List<StationUI> stationList(){
        List<Station> stations = repository.findAll();
        List<StationUI> stationUI = new ArrayList<>();

        for (Station station : stations) {
            stationUI.add(new StationUI(station.getStationName(),station.getZone()));
        }

        return stationUI;
    }

}
