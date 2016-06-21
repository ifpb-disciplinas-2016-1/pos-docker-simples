package pos.jsf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/06/2016, 15:30:52
 */
public class Banco {

    private Connection con;

    public Banco() {
        try {
            this.con = DriverManager
//                    .getConnection("jdbc:postgresql://192.168.99.100:5432/exemplo-docker"
                    .getConnection("jdbc:postgresql://192.168.99.100:5432/exemplo-docker"
                            ,"postgres","12345");
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public List<String> nomeDaMemoria() {
        List<String> list = new ArrayList<>();
        list.add("Kiko");
        list.add("Chaves");
        list.add("Madruga");
        return list;
    }

    public List<String> nomes() {
        List<String> list = new ArrayList<>();
        try {
            String consulta = "select * from pessoa";
            ResultSet result = con.createStatement().executeQuery(consulta);
            while (result.next()) {
                list.add(result.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
}
