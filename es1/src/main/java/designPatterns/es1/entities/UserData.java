package designPatterns.es1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData implements DataSource{

    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomeCompleto = ds. getNomeCompleto ();
        eta = ds.getEta();
    }
}
