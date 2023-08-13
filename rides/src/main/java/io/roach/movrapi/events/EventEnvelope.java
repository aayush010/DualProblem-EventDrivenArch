package io.roach.movrapi.events;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "events")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class EventEnvelope {
    @Id
    @GeneratedValue
    private UUID id;
    private Timestamp ts;
    @Column(name = "event_type")
    private String event_type;
    @Column(name = "event_data")
    @Type(type = "jsonb")
    private Map<String,Object> event_data;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
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
