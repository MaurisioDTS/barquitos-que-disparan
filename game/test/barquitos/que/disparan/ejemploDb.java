package barquitos.que.disparan;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

public class ejemploDb {
    public static void main(String[] args) {
        // TODO code application logic here
            Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("mdddb", true);
            
            String consulta;
            consulta ="select * from Usuario";
            
            System.out.println(Bd.consultaModificacion(gestor,consulta));    
            gestor.cerrar_Conexion(true);

            //tonto el que escriba
            //mas tonto aun
            //R
            //Ruben gilipollas
    }
}