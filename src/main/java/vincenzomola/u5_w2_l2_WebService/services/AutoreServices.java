package vincenzomola.u5_w2_l2_WebService.services;

import org.springframework.stereotype.Service;
import vincenzomola.u5_w2_l2_WebService.entities.Autore;
import vincenzomola.u5_w2_l2_WebService.payloads.AutoreRequestPayload;
import vincenzomola.u5_w2_l2_WebService.payloads.AutoreResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoreServices {

    private List<Autore> autoriFromDb = new ArrayList<>();

    public List<Autore> getAllAutori() {
        return autoriFromDb;
    }

    public AutoreResponsePayload createAutore(AutoreRequestPayload body) {
        Autore autoreFromDb = new Autore(body.getNome(), body.getCognome(), body.getEmail(), body.getDataDiNascita());
        autoriFromDb.add(autoreFromDb);
        return new AutoreResponsePayload(autoreFromDb.getId(), autoreFromDb.getNome(), autoreFromDb.getCognome(),
                autoreFromDb.getEmail(), autoreFromDb.getDataDiNascita(), autoreFromDb.getAvatar());
    }

    public Autore findById(long autoreId) {
        Autore found = null;

        for (Autore autore : autoriFromDb) {
            if (autore.getId() == autoreId) {
                found = autore;
            }
        }
        if (found == null) throw new RuntimeException("Non trovato nessun autore");

        return found;
    }

    public AutoreResponsePayload findAndUpdate(AutoreRequestPayload body, long autoreId) {
        Autore found = null;

        for (Autore autore : this.autoriFromDb) {
            if (autore.getId() == autoreId) {
                found = autore;
                found.setNome(body.getNome());
                found.setCognome(body.getCognome());
                found.setEmail(body.getEmail());
                found.setDataDiNascita(body.getDataDiNascita());

                break;
            }
        }
        if (found == null) throw new RuntimeException("Non trovato nessun autore");

        return new AutoreResponsePayload(found.getId(), found.getNome(), found.getCognome(), found.getEmail(),
                found.getDataDiNascita(), found.getAvatar());
    }

    public void delete(long autoreId) {
        Autore found = findById(autoreId);
        autoriFromDb.remove(found);
    }

}
