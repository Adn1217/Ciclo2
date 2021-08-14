package utp.misiontic2022.u43;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inicio... " );
        
        /*
            Persona persona = new Persona("Israel Arbona",33);
            var emf = Persistence.createEntityManagerFactory("clase12-pu");
            var em = emf.createEntityManager();
            try{
                em.getTransaction().begin();
                em.persist(persona);
                em.getTransaction().commit();

            } catch (Exception e){
                e.printStackTrace();
            } finally {
                em.close();
            }
        */

        disableLogging();

        // mostrarFind();
        // removerPersona();

        consultaJPQL();
        consultaApi();

    }

    public static void disableLogging(){
        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger("");
        logger.setLevel(Level.SEVERE);
    }

    public static void mostrarFind(){
        System.out.println("Persona ...... ");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("clase12-pu");
        EntityManager em = emf.createEntityManager();

        try {  
            Persona persona = em.find(Persona.class, "Israel Arbona");
            System.out.println(persona.getNombre());
            System.out.println(persona.getEdad());
            System.out.println(persona.getNombre() + " " + persona.getEdad());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void removerPersona(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("clase12-pu");
        EntityManager em = emf.createEntityManager();
        try {
            Persona persona = em.find(Persona.class, "Jose");
            em.getTransaction().begin();
            em.remove(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void consultaJPQL() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("clase12-pu");
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createQuery("SELECT p.nombre FROM Persona p WHERE p.nombre LIKE 'M%' ");
            List personas = query.getResultList();
            personas.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    public static void consultaApi(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("clase12-pu");
        EntityManager em = emf.createEntityManager();
        
        try {
            CriteriaBuilder  cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(Persona.class);
            Root rootEntry = cq.from(Persona.class);
            CriteriaQuery<Persona> all = cq.select(rootEntry);
            
            Query query = em.createQuery(all);
            List personas = query.getResultList();
            personas.forEach(System.out::println);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            em.close();
        }
    }



}
