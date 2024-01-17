package com.air.mongoFlights.flights;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "flight", path = "flight")
public interface FlightRepository extends MongoRepository<Flight, String> {
    List<Flight> findAllById(@Param(("id"))String id);
}
