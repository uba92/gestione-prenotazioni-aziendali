package it.epicode.gestione_prenotazioni_aziendali.services;

import it.epicode.gestione_prenotazioni_aziendali.entities.Postazione;
import it.epicode.gestione_prenotazioni_aziendali.entities.Prenotazione;
import it.epicode.gestione_prenotazioni_aziendali.entities.Utente;
import it.epicode.gestione_prenotazioni_aziendali.enums.StatoPostazione;
import it.epicode.gestione_prenotazioni_aziendali.enums.TipoPostazione;
import it.epicode.gestione_prenotazioni_aziendali.repositories.PostazioneRepository;
import it.epicode.gestione_prenotazioni_aziendali.repositories.PrenotazioneRepository;
import it.epicode.gestione_prenotazioni_aziendali.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private PostazioneRepository postazioneRepository;


    public List<Postazione> cercaPostazioni(TipoPostazione tipoPostazione, String citta) {
        return postazioneRepository.findByTipoPostazioneAndEdificio_Citta(tipoPostazione, citta);
    }

    public boolean isPostazioneLibera(Long postazione_id, LocalDate dataInizio) {
        Postazione postazione = postazioneRepository.findById(postazione_id).get();
        List<Prenotazione> prenotazioni = prenotazioneRepository.findByDataInizioAndPostazione(dataInizio, postazione);
        return prenotazioni.isEmpty();
    }

    public boolean utenteGiaConPrenotazione(Utente utente, LocalDate dataInizio) {
        List<Prenotazione> prenotazioni = prenotazioneRepository.findByUtenteAndDataInizio(utente, dataInizio);
        return !prenotazioni.isEmpty();
    }

    //creo una prenotazione
    public Prenotazione creaPrenotazione(Long postazione_id, Utente utente, LocalDate dataInizio) {

        if (utenteGiaConPrenotazione(utente, dataInizio) && !isPostazioneLibera(postazione_id, dataInizio)) {
            throw new RuntimeException("Utente già con prenotazione o postazione non libera");

        } else {
            Prenotazione prenotazione1 = new Prenotazione();
            prenotazione1.setPostazione(postazioneRepository.findById(postazione_id).get());
            prenotazione1.setUtente(utente);
            prenotazione1.setDataInizio(dataInizio);
            return prenotazioneRepository.save(prenotazione1);
        }
    }

}
