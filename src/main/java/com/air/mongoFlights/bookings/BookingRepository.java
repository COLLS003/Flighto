package com.air.mongoFlights.bookings;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "bookings", path = "bookings")
public interface BookingRepository extends MongoRepository<Booking, String> {
    List<Booking> findAllById(@Param(("id"))String id);
    List<Booking> findAllByUserID(@Param(("destination"))String userID);
}
