package designPatterns.es1.entities;

import java.time.Instant;
import java.util.Date;

public class Adapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        String nome = info.getNome();
        String cognome = info.getCognome();
        return nome + " " + cognome;
    }

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita();
        Date currentDate = Date.from(Instant.now());
        return currentDate.getYear() - dataDiNascita.getYear();
    }
}
