package com.shipment.uspsshipmentservice.repository;

import com.shipment.uspsshipmentservice.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud rests implemented in jpa
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {


    Shipment findByTrackingNumber(String tn);

}
