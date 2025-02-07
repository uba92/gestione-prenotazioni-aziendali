package it.epicode.gestione_prenotazioni_aziendali.entities;

import it.epicode.gestione_prenotazioni_aziendali.enums.StatoPostazione;
import it.epicode.gestione_prenotazioni_aziendali.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "postazioni")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private StatoPostazione statoPostazione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private int maxNumPosti;

    @ManyToOne
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> listaPrenotazioni;

}
