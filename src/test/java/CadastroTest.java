import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CadastroTest {
    ChromeDriver driver = new ChromeDriver();

    @Before
    public void abreONavegador(){
        System.setProperty("webdriver.chrome.driver","COLOCAR O CAMINHO DO DRIVER");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().window().maximize();
    }


    @After
    public void fechaONavegador(){
        driver.quit();
    }



    @Test
    public void cadastrarComSucesso() {

    }


    @Test
        public void cadastryyarComSucesso(){


    }

    //este meteodo testa os campos obrigatorios
    public void verificarCamposObrgatorios(){

    }

    //este meteodo valida o numero de caracteres na senha
    public void validarNumeroDeCaracteresNaSenha(){

    }

    //Este metedo valida que o cadastro não aconteca com os campos em branco
    public void naoCadastrarComCamposEmBranco(){

    }

    //Este metedo testa o cadas de conta com saldo
    public void cadastrarContaComSaldo(){

    }

}
