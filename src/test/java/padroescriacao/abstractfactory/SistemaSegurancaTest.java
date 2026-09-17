package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaSegurancaTest {

    @Test
    void deveAtivarAntivirusBasico(){
        ISuiteSeguranca fabrica = new SuiteSegurancaBasica();
        SistemaSeguranca sistema = new SistemaSeguranca(fabrica);
        assertEquals("Antivírus Básico Ativado", sistema.ativarAntivirus());
    }

    @Test
    void deveAtivarAntivirusAvancado(){
        ISuiteSeguranca fabrica = new SuiteSegurancaAvancada();
        SistemaSeguranca sistema = new SistemaSeguranca(fabrica);
        assertEquals("Antivírius Avançado Ativado", sistema.ativarAntivirus());
    }

    @Test
    void deveAtivarFirewallBasico(){
        ISuiteSeguranca fabrica = new SuiteSegurancaBasica();
        SistemaSeguranca sistema = new SistemaSeguranca(fabrica);
        assertEquals("Firewall Básico Ativado", sistema.ativarFirewall());
    }

    @Test
    void deveAtivarFirewallAvancado(){
        ISuiteSeguranca fabrica = new SuiteSegurancaAvancada();
        SistemaSeguranca sistema = new SistemaSeguranca(fabrica);
        assertEquals("Firewall Avançado Ativado", sistema.ativarFirewall());
    }
}
