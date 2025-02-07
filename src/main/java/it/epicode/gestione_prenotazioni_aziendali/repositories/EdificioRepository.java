package it.epicode.gestione_prenotazioni_aziendali.repositories;

import it.epicode.gestione_prenotazioni_aziendali.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
