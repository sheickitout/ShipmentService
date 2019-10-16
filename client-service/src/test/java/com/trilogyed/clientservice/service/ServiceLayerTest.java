package com.trilogyed.clientservice.service;

import com.trilogyed.clientservice.model.Shipment;
import com.trilogyed.clientservice.util.feign.USPSShipmentServiceClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceLayerTest {

    @Autowired
    USPSShipmentServiceClient client;

//    @Before
//    public void setUp(){
//        client.deleteAll();
//    }
//
//    @After
//    public void tearDown(){
//        client.deleteAll();
//    }

    @Test
    public void addGetShipment(){

        //assemble
        Shipment shipmentToAdd = new Shipment();
        shipmentToAdd.setName("Peter F.");
        shipmentToAdd.setTrackingNumber("200101");

        //act
        shipmentToAdd = client.addShipment(shipmentToAdd);

        Shipment shipmentAdded = client.findShipmentByTrackingNumber((shipmentToAdd.getTrackingNumber()));
        //assert
        assertEquals(shipmentToAdd, shipmentAdded);

    }
}