package io.roach.movrapi.events;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class EventEnvelope {
    @JsonProperty
    private String event_type;
    @JsonProperty
    private Map<String, Object> event_data;

}
