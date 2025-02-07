package it.epicode.gestione_prenotazioni_aziendali.runners;

import it.epicode.gestione_prenotazioni_aziendali.entities.Postazione;
import it.epicode.gestione_prenotazioni_aziendali.entities.Prenotazione;
import it.epicode.gestione_prenotazioni_aziendali.entities.Utente;
import it.epicode.gestione_prenotazioni_aziendali.repositories.PostazioneRepository;
import it.epicode.gestione_prenotazioni_aziendali.repositories.UtenteRepository;
import it.epicode.gestione_prenotazioni_aziendali.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class FindDBRunner implements CommandLineRunner {

    @Autowired
    private PostazioneRepository postazioneRepository;
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Override
    public void run(String... args) throws Exception {

        Utente utente = utenteRepository.findById(2L).get();
//        Postazione postazione = postazioneRepository.findById(1L).get();
        LocalDate dataInizio = LocalDate.of(2025, 5, 1);



        try {
            Prenotazione prenotazione = prenotazioneService.creaPrenotazione(1L, utente,  dataInizio);
            System.out.println("Prenotazione effettuata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
