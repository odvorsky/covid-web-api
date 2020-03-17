package cz.covid.repository;

import cz.covid.model.jpa.Consent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsentRepository extends JpaRepository<Consent, Long> {
}
