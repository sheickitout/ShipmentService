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

    public Shipment findShipment(int trackingNumber){

        Optional<Shipment> shipment = shipRepo.findById(trackingNumber);

        Shipment shipment1 = shipment.get();

        return shipment1;
    }

    public Shipment addShipment(Shipment shipment){

        Shipment newShipment = shipRepo.save(shipment);

        return newShipment;

    }

}
