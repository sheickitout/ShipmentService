package com.shipment.clientservice.util.feign;


import com.shipment.clientservice.model.Shipment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "shipment-service")
public interface USPSShipmentServiceClient {

    // getting shipment
    @RequestMapping(value = "/shipment/{trackingnumber}", method = RequestMethod.GET)
    public Shipment findShipmentByTrackingNumber(@PathVariable (name ="trackingnumber" ) String tn);

    //adding shipment
    @RequestMapping(value = "/shipment/addshipment", method = RequestMethod.POST)
    public Shipment addShipment(@RequestBody Shipment shipment);
}
