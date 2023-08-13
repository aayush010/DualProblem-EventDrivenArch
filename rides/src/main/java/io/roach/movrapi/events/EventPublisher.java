package io.roach.movrapi.events;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EventPublisher {
    EventRepository eventRepository;
    ObjectMapper objectMapper;
    @Autowired
    EventPublisher(EventRepository eventRepository, ObjectMapper objectMapper){
        this.eventRepository = eventRepository;
        this.objectMapper = objectMapper;
    }

    public void publish(String event_type, Event event){
        Map<String, Object> data = objectMapper.convertValue(event, Map.class);
        EventEnvelope eventEnvelope = new EventEnvelope();
        eventEnvelope.setEvent_type(event_type);
        eventEnvelope.setEvent_data(data);

        eventRepository.save(eventEnvelope);
    }

}
