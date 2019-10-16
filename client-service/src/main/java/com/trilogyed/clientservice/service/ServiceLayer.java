package com.trilogyed.clientservice.service;

import com.trilogyed.clientservice.model.Shipment;
import com.trilogyed.clientservice.util.feign.USPSShipmentServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


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
