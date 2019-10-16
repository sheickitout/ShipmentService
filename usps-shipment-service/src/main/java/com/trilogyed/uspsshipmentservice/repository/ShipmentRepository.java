package com.trilogyed.uspsshipmentservice.repository;

import com.trilogyed.uspsshipmentservice.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {


}
