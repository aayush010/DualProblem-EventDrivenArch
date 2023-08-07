package io.roach.movrapi.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface  EventRepository extends JpaRepository<EventEnvelope, UUID> {

}
