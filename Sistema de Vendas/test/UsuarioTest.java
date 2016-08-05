/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.asc.security.CriptografiaMD5;
import static com.asc.security.CriptografiaMD5.getMD5;
import com.bsangola.entidades.Usuario;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adilson
 */
public class UsuarioTest {
    
    private Usuario usuario;
    private String senha;
    public UsuarioTest() {
        this.usuario = new Usuario("Adilson", "adilson");
        try {
            this.senha = getMD5("adilson");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test
    public void criptografiaDaSenha(){
        assertEquals(senha, usuario.getSenha());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
