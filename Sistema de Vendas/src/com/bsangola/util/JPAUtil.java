/**
 * Licença Privada. Todos os direito reservados a BIG SOFT ANGOLA, SA
 * Qualquer copia, venda e o uso sem a respectiva autorização deste produto
 * estarão sujeito a sanções penais. 
 */

package com.bsangola.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Data de Criação: 05/08/2016
 * Hora: 02:17:32
 * Empresa BIG SOFT ANGOLA, SA 
 * @author Adilson Cardoso
 */
public class JPAUtil {
    
    private static final EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory("VendaPU");
    private static final EntityManager manager =sessionFactory.createEntityManager();

    
    public static EntityManagerFactory getSessionFactory() {
        return sessionFactory;
    }

    public static EntityManager getManager() {
        return manager;
    }
}
