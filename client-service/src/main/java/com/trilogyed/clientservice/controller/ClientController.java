package com.trilogyed.clientservice.controller;


import com.trilogyed.clientservice.model.Shipment;
import com.trilogyed.clientservice.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    ServiceLayer service;

    @RequestMapping(value = "/clienfe/shipment/{trackingnumber}", method = RequestMethod.GET)
    public Shipment findShipment(@PathVariable int tn){
        return service.findShipment(tn);
    }

    //adding shipment
    @RequestMapping(value = "clientfe/shipment/addshipment", method = RequestMethod.POST)
    public Shipment addShipment(@RequestBody Shipment shipment){
        return service.addShipment(shipment);
    }
}
