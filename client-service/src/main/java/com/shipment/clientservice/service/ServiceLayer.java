package com.shipment.clientservice.service;

import com.shipment.clientservice.model.Shipment;
import com.shipment.clientservice.util.feign.USPSShipmentServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ServiceLayer {


    USPSShipmentServiceClient client;


    @Autowired
    public ServiceLayer( USPSShipmentServiceClient client){
        this.client= client;
    }

    public Shipment addShipment(Shipment shipment){
        Shipment ship = client.addShipment(shipment);
        return ship;
    }

    public Shipment findShipment(String tn){
        Shipment ship = client.findShipmentByTrackingNumber(tn);
        return ship;
    }
}
