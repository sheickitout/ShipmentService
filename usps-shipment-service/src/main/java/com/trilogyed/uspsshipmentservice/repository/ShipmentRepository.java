package com.trilogyed.uspsshipmentservice.repository;

import com.trilogyed.uspsshipmentservice.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {


}
