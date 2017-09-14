package de.bund.bva.isyfact.datetime.persistence.jpa.test;

import java.time.ZonedDateTime;
import javax.persistence.Entity;

@Entity
public class TestZonedDateTimeEntity extends AbstractTestEntity {

    private ZonedDateTime zonedDateTime;

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }
}
