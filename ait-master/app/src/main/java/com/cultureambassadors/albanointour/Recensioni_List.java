package com.cultureambassadors.albanointour;

import java.util.ArrayList;

public class Recensioni_List
{
    private static final ArrayList<Recensione> Recensioni = new ArrayList<>();
    private static Recensioni_List Recens_list;
    
    private Recensioni_List()
    {
        Recensioni.add(new Recensione("Duomo di Albano", "Marco", "L’interno in stile neoclassico con cappelle laterali decorate con dipinti del XVIII secolo, dipinti che si trovano anche nell’abside. Fantastico.", 4));
        Recensioni.add(new Recensione("Duomo di Albano", "Edoardo", "Testimonianza storica e notevole luogo di culto. Situata in pieno centro si raggiunge facilmente. Merita una visita. Non molto appariscente come facciata in quanto compressa da costruzioni circostanzi, ma notevole nel suo interno.", 5));
        Recensioni.add(new Recensione("Duomo di Albano", "Riccardo", "La cattedrale di Albano Laziale, da poco ristrutturata, offre una bellissima visione d'insieme. E' costituita da tre navate molto importanti e dà il senso della solennità e dell'importanza del luogo di culto. Se si passa per albano Laziale vale la pena visitarla.", 4));
        Recensioni.add(new Recensione("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Roberto", "Luogo di notevole importanza storica di Albano, bel parco, antistante parcheggio per chi si incammina a piedi sulla Francigena o sul bel sentiero che porta a Nemi.", 3));
        Recensioni.add(new Recensione("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Filippo", "Bellissima posizione a atmosfera sublime. Purtroppo chiuso", 5));
        Recensioni.add(new Recensione("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Stefano", "Un luogo meraviglioso. Dove poter stare raccolti in preghiera o semplicemente in contemplazione del panorama, versante mare e versante lago. La calma la serenità la pace.", 4));
        Recensioni.add(new Recensione("Convento e Chiesa di S. Paolo", "Ludovica", "Luogo semplice e di preghiera", 4));
        Recensioni.add(new Recensione("Convento e Chiesa di S. Paolo", "Francesca", "Facciate molto ben fatte e colori molto vivaci, bellissima chiesa", 5));
        Recensioni.add(new Recensione("Convento e Chiesa di S. Paolo", "Giuseppe", "Molto bello!!!", 4));
        Recensioni.add(new Recensione("Chiesa della Stella e Cimitero del Colera", "Antonio", "Piccola e preziosa. Leggermente decentrata, accogliente e raccolta. Si possono vedere alcune opere pittoriche di rilievo", 2));
        Recensioni.add(new Recensione("Chiesa della Stella e Cimitero del Colera", "Egidio", "Altissimi livelli, padre Teodoro poi...Top. Sacerdote sempre disponibile e coinvolgente.", 5));
        Recensioni.add(new Recensione("Chiesa della Stella e Cimitero del Colera", "Egidio", "Chiesa legata alla mia infanzia e chiesa legata alle nostre cerimonie.", 5));
        Recensioni.add(new Recensione("Chiesa di S. Maria della Rotonda", "Emanuele", "Luogo da visitare per la storia di cui è parte. La chiesa è stata costruita su vasche termali romane ed è emozionante scoprire queste origini così antiche di una cittadina così vicina a Roma e carica di reperti e siti archeologici di immenso valore.", 4));
        Recensioni.add(new Recensione("Chiesa di S. Pietro", "Simona", "Chiesa parrocchiale molto attiva. La chiesa fu edificata nel 514-532 d. C. sulle rovine delle terme di Caracalla, ancora visibili", 3));
        Recensioni.add(new Recensione("Chiesa di S. Pietro", "Pietro", "Mi piace molto questa chiesa...Perché ti offre la possibilità di poter fare l'adorazione in qualsiasi ora del giorno...e questo direi sia molto importante  per un fedele.", 4));
        Recensioni.add(new Recensione("Chiesa di S. Pietro", "Prova", "Antica chiesa costruita sul luogo delle terme romane...pittoresca", 4));
        Recensioni.add(new Recensione("Tomba degli Orazi e Curiazi", "Chiara", "Difficile visitarlo. Tenuto svogliatamente, nascosto dalla troppa vegetazione non ci si accorge di averlo alle spalle. Tristezza.", 2));
        Recensioni.add(new Recensione("Tomba degli Orazi e Curiazi", "Francesco", "È triste arrivare lì e trovare il sito praticamente abbandonato.  Abbiamo gioielli che in altri paesi sarebbero valorizzati e qui giaciono dimenticati. Peccato...", 1));
        Recensioni.add(new Recensione("Tomba degli Orazi e Curiazi", "Paolo", "In assoluto il monumento più sorprendente sul percorso dell' appia antica dopo la tomba di Cecilia metella. Un gioiello dimenticato!", 4));
        Recensioni.add(new Recensione("Tomba degli Orazi e Curiazi", "Gianluca", "Monumento di origine romana. Sicuramente non tomba dei sei famosi combattenti. Dovrebbe essere tenuto in migliore stato dal comune di Albano Laziale.", 5));
        Recensioni.add(new Recensione("Catacombe di S. Senatore", "Elena", "Uno spettacolo sotterraneo meraviglioso.da visitare se passi ad albano laziale.non perdetevi questo sito misto tra architettura e natura.", 3));
        Recensioni.add(new Recensione("Catacombe di S. Senatore", "Sofia", "Le catacombe di san Senatore meritano di essere viste. Se andate ai Castelli Romani fate in modo di organizzare una visita", 4));
        Recensioni.add(new Recensione("I Cisternoni", "Rachele", "Sito storico e archeologico che potrebbe essere valorizzato di più,interessante la struttura e la sua storia per la capacità dei nostri antichi costruttori romani.", 4));
        Recensioni.add(new Recensione("I Cisternoni", "Daniele", "Posto emozionante da morire. Vengo da Roma e dovrei esserci abituata ma questo luogo è da visitare.", 5));
        Recensioni.add(new Recensione("Accampamento della Seconda Legione Partica (Castra Albana)", "Pierfrancesco", "Museo molto piccolo ma ben curato. Personale gentile e disponibile a spiegare anche gli altri siti archeologici della città.", 3));
        Recensioni.add(new Recensione("Anfiteatro Severiano", "Silvio", "Luogo molto interessante per la sua funzione in epoca romana. Sarebbe auspicabile il Comune intervenisse sulla vegetazione che regna selvaggia sugli 'spalti' ma il luogo vale comunque la visita.", 4));
        Recensioni.add(new Recensione("Anfiteatro Severiano", "Alice", "Suggestivi i resti di quest'anfiteatro, capace di contenere oltre 15.000 spettatori, costruito nel III secolo in funzione delle vicine caserme, i Castra Albana, della Legione II Parthica, costituita prevalentemente per le interminabili guerre d'oriente.", 4));
        Recensioni.add(new Recensione("Anfiteatro Severiano", "Leonardo", "Luogo bellissimo ed adatto per eventi all'aperto. Un po' laborioso trovare parcheggio ma merita.", 4));
        Recensioni.add(new Recensione("Terme di Cellomaio", "Silvia", "Molto belle e luogo molto silenzioso, Top!", 5));
        Recensioni.add(new Recensione("Terme di Cellomaio", "Daniela", "Luogo di calma e tranquilltà, ideale per le famiglie.", 4));
        Recensioni.add(new Recensione("Villa di Pompeo Magno", "Luna", "Molto degrado, gente ha lasciato bottiglie e sporcizia. Non c'è controllo da parte dei Beni Culturali. Peccato.", 3));
        Recensioni.add(new Recensione("Villa di Pompeo Magno", "Riccardo", "un bel posto con tanto verde e tanti alberi pini abeti e quercie secolari, un posto da vedere!", 4));
        Recensioni.add(new Recensione("Villa romana ai Cavallacci", "Vincenzo", "Potrebbe essere un patrimonio bellissimo ma è tendenzialmente lasciato all'incuria tra le erbe alte. È possibile \"visitarla\" solo da dietro un'inferriata.", 3));
        Recensioni.add(new Recensione("Villa romana ai Cavallacci", "Vittorio", "Ormai lasciato lì senza che nessuno si occupi. Però bel posto!", 3));
        Recensioni.add(new Recensione("Porta Pretoria e Porta Principalis Sinistra", "Roberto", "Molto bello", 4));
        Recensioni.add(new Recensione("Porta Pretoria e Porta Principalis Sinistra", "Alessandro", "Fantastico", 5));
        Recensioni.add(new Recensione("Porta Pretoria e Porta Principalis Sinistra", "Nicola", "Carino", 3));
        Recensioni.add(new Recensione("Museo archeologico di Albano", "Lorenzo", "Meravigliosa location in centro ad Albano. Esaustiva spiegazione dell'origine geologica dei castelli romani.", 5));
        Recensioni.add(new Recensione("Museo archeologico di Albano", "Teresa", "Il museo civico di Albano Laziale è un patrimoni da non sottovalutare per la formazione culturale degli adulti e luogo di studio per gli studenti di ogni ordine e grado!", 5));
        Recensioni.add(new Recensione("Museo della Seconda Legione Partica", "Vanessa", "Museo molto piccolo ma ben curato. Personale gentile e disponibile a spiegare anche gli altri siti archeologici della città.", 3));
        Recensioni.add(new Recensione("Museo della Seconda Legione Partica", "Maria", "Un museo chiuso in orario di apertura senza nessun avviso è impossibile da recensire! Meriterebbe zero!", 1));
        Recensioni.add(new Recensione("Palazzo Savelli", "Giorgia", "Bellissimo posto immerso nel verde...Buonissimo e bellissimo il ristorante al suo interno \"al castello\". ", 5));
        Recensioni.add(new Recensione("Palazzo Savelli", "Matteo", "Bel posto da visitare, dall'alto si vede scorrere il Tevere. Da vedere sicuramente.", 5));
        Recensioni.add(new Recensione("Villa Doria - Pamphili", "Elena", "Sapete quando dovete liberare corpo e mente da tutto e tutti? Ecco, concedetevi una pausa dallo stress quotidiano, fatevi una corsa, una passeggiata nel verde...Sublime", 5));
        Recensioni.add(new Recensione("Villa Doria - Pamphili", "Daniele", "Il giardino pubblico di Albano Laziale sempre e comunque carico di fascino e di storia per questa bella città dei Castelli romani.", 5));
        Recensioni.add(new Recensione("Villa Doria - Pamphili", "Asia", "Parco grande ma non molto curato, con oscure presenze specialmente durante la notte in inverno, per essere il parco di una città come Albano non è un granché", 3));
        Recensioni.add(new Recensione("Villa Doria - Pamphili", "Samuele", "Villa comunale situata nel centro del comune di albano Laziale. In passato era tenuta meglio...", 2));
        Recensioni.add(new Recensione("Bajocco Festival", "Christian", "Festival carino e ben organizzato. Consigliato a famiglie!", 4));
        Recensioni.add(new Recensione("Bajocco Festival", "Annalisa", "Molto carino e piacevole, ritorneremo sicuramente!", 4));
        Recensioni.add(new Recensione("Bajocco Festival", "Demetrio", "Per un evento che viene una volta l'anno mi aspettavo qualcosa in più, ma per il resto non è affatto male.", 3));
        Recensioni.add(new Recensione("Albano Musica Festival", "Clarissa", "Per una città come Albano, pensavo non fosse possibile organizzare un evento del genere, invece molto bello!", 4));
        Recensioni.add(new Recensione("Albano Musica Festival", "Natalia", "Evento molto particolare, sicuramento apprezzato!", 4));
        Recensioni.add(new Recensione("Albano Musica Festival", "Flavia", "Carino e molto interessante, consigliato", 5));
    }
    
    public static ArrayList<Recensioni_List.Recensione> getList()
    {
        if (Recens_list == null)
            Recens_list = new Recensioni_List();
        return Recensioni;
    }
    
    public class Recensione
    {
        public final String nome, recensione, bc; //TODO rimetterli private
        public final float voto;
        
        public Recensione(String bc, String nome, String recensione, float voto)
        {
            this.bc = bc;
            this.nome = nome;
            this.recensione = recensione;
            this.voto = voto;
        }
        
        
        public String getLuogo()
        {
            return bc;
        }
        
        public String getRecensione()
        {
            return recensione;
        }
        
        
        public float get_voto()
        {
            return voto;
        }
        
        public String getNome()
        {
            return nome;
        }
    }
}