package pos.jsf;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/06/2016, 15:29:50
 */
@Named
@RequestScoped
public class Controlador {

    
    private Banco banco = new Banco();

    public List<String> getDados() {
        return banco.nomes();
    }
}
