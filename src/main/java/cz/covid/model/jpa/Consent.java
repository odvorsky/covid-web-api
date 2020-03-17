package cz.covid.model.jpa;


import cz.covid.model.jpa.cb.ConsentType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Consent")
public class Consent extends Meta {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "CONSENT_TYPE_ID")
    private ConsentType consentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ConsentType getConsentType() {
        return consentType;
    }

    public void setConsentType(ConsentType consentType) {
        this.consentType = consentType;
    }
}
