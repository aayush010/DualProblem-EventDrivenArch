package io.roach.movrapi.events;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "events")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class EventEnvelope {
    private UUID uuid;
    private Timestamp timestamp;
    private String event_type;
    @Column(name = "event_data")
    @Type(type = "jsonb")
    private Map<String,Object> event_data;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public Map<String, Object> getEvent_data() {
        return event_data;
    }

    public void setEvent_data(Map<String, Object> event_data) {
        this.event_data = event_data;
    }
}
