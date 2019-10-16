package com.trilogyed.uspsshipmentservice.service;

import com.trilogyed.uspsshipmentservice.model.Shipment;
import com.trilogyed.uspsshipmentservice.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceLayer {

    ShipmentRepository shipRepo;

    @Autowired
    public ServiceLayer(ShipmentRepository shipRepo){
        this.shipRepo=shipRepo;
    }

    public Shipment findByTrackingNumber(String trackingNumber){

        Shipment shipment = shipRepo.findByTrackingNumber(trackingNumber);

        return shipment;
    }

    public Shipment addShipment(Shipment shipment){

        Shipment newShipment = shipRepo.save(shipment);

        return newShipment;

    }

}
