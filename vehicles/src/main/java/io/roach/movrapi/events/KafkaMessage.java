package io.roach.movrapi.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KafkaMessage {
    @JsonProperty
    private EventEnvelope eventEnvelope;
}
