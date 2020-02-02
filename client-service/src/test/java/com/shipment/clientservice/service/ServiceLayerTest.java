package com.shipment.clientservice.service;

import com.shipment.clientservice.model.Shipment;
import com.shipment.clientservice.util.feign.USPSShipmentServiceClient;
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

    ServiceLayer sl;

//    @Before
//    public void setUp(){
//        sl.deleteAll();
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
        shipmentToAdd.setName("Example .");
        shipmentToAdd.setTrackingNumber("200101");

        //act
        shipmentToAdd = client.addShipment(shipmentToAdd);

        Shipment shipmentAdded = client.findShipmentByTrackingNumber((shipmentToAdd.getTrackingNumber()));
        //assert
        assertEquals(shipmentToAdd, shipmentAdded);

    }
}