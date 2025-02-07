package it.epicode.gestione_prenotazioni_aziendali.repositories;

import it.epicode.gestione_prenotazioni_aziendali.entities.Postazione;
import it.epicode.gestione_prenotazioni_aziendali.entities.Prenotazione;
import it.epicode.gestione_prenotazioni_aziendali.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    List<Prenotazione> findByUtenteAndDataInizio(Utente utente, LocalDate dataInizio);

    List<Prenotazione> findByDataInizioAndPostazione(LocalDate dataInizio, Postazione postazione);
}
