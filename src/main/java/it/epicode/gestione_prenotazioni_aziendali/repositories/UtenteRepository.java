package it.epicode.gestione_prenotazioni_aziendali.repositories;

import it.epicode.gestione_prenotazioni_aziendali.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
