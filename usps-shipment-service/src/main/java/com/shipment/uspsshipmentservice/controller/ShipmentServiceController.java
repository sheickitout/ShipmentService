package com.shipment.uspsshipmentservice.controller;

import com.shipment.uspsshipmentservice.model.Shipment;
import com.shipment.uspsshipmentservice.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shipment")
public class ShipmentServiceController {

    @Autowired
    ServiceLayer sl;

    //retrieving shipment by number
    @RequestMapping(value = "/{trackingnumber}", method = RequestMethod.GET)
    public Shipment findShipment(@PathVariable (name = "trackingnumber") String tn){
        return sl.findByTrackingNumber(tn);
    }

    //adding shipment
    @RequestMapping(value = "/addshipment", method = RequestMethod.POST)
    public Shipment addShipment(@RequestBody Shipment shipment){
        return sl.addShipment(shipment);
    }
}
