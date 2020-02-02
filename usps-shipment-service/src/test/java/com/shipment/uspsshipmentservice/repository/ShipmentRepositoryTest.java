package com.shipment.uspsshipmentservice.repository;

import com.shipment.uspsshipmentservice.model.Shipment;
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
public class ShipmentRepositoryTest {

    @Autowired
    ShipmentRepository shipRepo;

    @Before
    public void setUp(){
        shipRepo.deleteAll();
    }

    @After
    public void tearDown(){
        shipRepo.deleteAll();
    }

    @Test
    public void addGetShipment(){

        //assemble
        Shipment shipmentToAdd = new Shipment();
        shipmentToAdd.setName("Peter F.");
        shipmentToAdd.setTrackingNumber("200100");

        //act
        shipmentToAdd = shipRepo.save(shipmentToAdd);

        Shipment shipmentAdded = shipRepo.findByTrackingNumber((shipmentToAdd.getTrackingNumber()));
        //assert
        assertEquals(shipmentToAdd, shipmentAdded);

    }

}
