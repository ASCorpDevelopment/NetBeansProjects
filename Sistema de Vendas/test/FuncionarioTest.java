/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bsangola.entidades.Funcionario;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adilson
 */
public class FuncionarioTest {
    
    private Funcionario funcionario;
    public FuncionarioTest() {
        this.funcionario = new Funcionario();
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void autoInsert(){
        //funcionario.autoInsert(); For this method work we have to set the method autoInsert in class Funcionario to public acess.
        assertEquals(new Date(), funcionario.getDataCadastro());
        assertEquals(null, funcionario.getDataAlteracao());
    
    }
}
