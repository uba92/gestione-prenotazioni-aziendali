package it.epicode.gestione_prenotazioni_aziendali.repositories;

import it.epicode.gestione_prenotazioni_aziendali.entities.Postazione;
import it.epicode.gestione_prenotazioni_aziendali.entities.Prenotazione;
import it.epicode.gestione_prenotazioni_aziendali.enums.StatoPostazione;
import it.epicode.gestione_prenotazioni_aziendali.enums.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

    List<Postazione> findByTipoPostazioneAndEdificio_Citta(TipoPostazione tipoPostazione, String citta);


}
