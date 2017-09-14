package de.bund.bva.isyfact.datetime.persistence.jpa.test;

import java.time.Duration;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestDurationEntity extends AbstractTestEntity {

    private Duration duration;

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
