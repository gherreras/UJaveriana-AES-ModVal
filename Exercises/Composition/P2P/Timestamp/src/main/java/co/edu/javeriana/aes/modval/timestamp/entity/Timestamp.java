package co.edu.javeriana.aes.modval.timestamp.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Auto-generated class based on the canonical representation for Timestamp
 * xjc -d Timestamp/src/main/java/co/edu/javeriana/aes/modval/timestamp/entity
 * -p co.edu.javeriana.aes.modval.timestamp.entity Timestamp.xsd
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timestamp", propOrder = {
        "currentTS"
})
public class Timestamp {

    protected long currentTS;

    public Timestamp() {
    }

    public Timestamp(long currentTS) {
        this.currentTS = currentTS;
    }

    /**
     * Gets the value of the currentTS property.
     */
    public long getCurrentTS() {
        return currentTS;
    }

    @Override
    public String toString() {
        return "Timestamp{" +
                "currentTS=" + currentTS +
                '}';
    }
}
