//package it.epicode.gestione_prenotazioni_aziendali.runners;
//
//import it.epicode.gestione_prenotazioni_aziendali.entities.Edificio;
//import it.epicode.gestione_prenotazioni_aziendali.entities.Postazione;
//import it.epicode.gestione_prenotazioni_aziendali.entities.Utente;
//import it.epicode.gestione_prenotazioni_aziendali.enums.StatoPostazione;
//import it.epicode.gestione_prenotazioni_aziendali.repositories.EdificioRepository;
//import it.epicode.gestione_prenotazioni_aziendali.repositories.PostazioneRepository;
//import it.epicode.gestione_prenotazioni_aziendali.repositories.UtenteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class createDBRunner implements CommandLineRunner {
//
//    @Autowired
//    private EdificioRepository edificioRepository;
//    @Autowired
//    private UtenteRepository utentiRepository;
//    @Autowired
//    private PostazioneRepository postazioneRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        //creazione edifici
//        Edificio edificio1 = new Edificio();
//        edificio1.setNome("Edificio 1");
//        edificio1.setIndirizzo("Via Roma");
//        edificio1.setCitta("Roma");
//
//        Edificio edificio2 = new Edificio();
//        edificio2.setNome("Edificio 2");
//        edificio2.setIndirizzo("Via Milano, 2");
//        edificio2.setCitta("Milano");
//
//        Edificio edificio3 = new Edificio();
//        edificio3.setNome("Edificio 3");
//        edificio3.setIndirizzo("Via Napoli, 3");
//        edificio3.setCitta("Napoli");
//
//        //salvataggio degli edifici
//        edificioRepository.save(edificio1);
//        edificioRepository.save(edificio2);
//        edificioRepository.save(edificio3);
//
//        System.out.println("---EDIFICI SALVATI---");
//
//        //crezione utenti
//
//        Utente utente1 = new Utente();
//        utente1.setUsername("utente1");
//        utente1.setNomeCompleto("Utente 1");
//        utente1.setEmail("utente1@utente1.it");
//
//        Utente utente2 = new Utente();
//        utente2.setUsername("utente2");
//        utente2.setNomeCompleto("Utente 2");
//        utente2.setEmail("utente2@utente2.it");
//
//        Utente utente3 = new Utente();
//        utente3.setUsername("utente3");
//        utente3.setNomeCompleto("Utente 3");
//        utente3.setEmail("utente3@utente3.it");
//
//        //salvataggio degli utenti
//        utentiRepository.save(utente1);
//        utentiRepository.save(utente2);
//        utentiRepository.save(utente3);
//        System.out.println("---UTENTI SALVATI---");
//
//        //creazione postazioni
//
//        Postazione postazione1 = new Postazione();
//        postazione1.setDescrizione("Postazione 1");
//        postazione1.setStatoPostazione(StatoPostazione.LIBERA);
//        postazione1.setMaxNumPosti(10);
//
//        Postazione postazione2 = new Postazione();
//        postazione2.setDescrizione("Postazione 2");
//        postazione2.setStatoPostazione(StatoPostazione.LIBERA);
//        postazione2.setMaxNumPosti(10);
//
//        Postazione postazione3 = new Postazione();
//        postazione3.setDescrizione("Postazione 3");
//        postazione3.setStatoPostazione(StatoPostazione.LIBERA);
//        postazione3.setMaxNumPosti(10);
//
//        //salvataggio delle postazioni
//        postazioneRepository.save(postazione1);
//        postazioneRepository.save(postazione2);
//        postazioneRepository.save(postazione3);
//
//        System.out.println("---POSTAZIONI SALVATE---");
//
//
//
//    }
//}
