package padroescriacao.abstractfactory;

public class SistemaSeguranca {

    private  IFirewall firewall;
    private  IAntivirus antivirus;

    public SistemaSeguranca(ISuiteSeguranca fabrica){
        this.firewall = fabrica.createFirewall();
        this.antivirus = fabrica.createAntivirus();
    }

    public String ativarFirewall(){
        return this.firewall.ativar();
    }

    public String ativarAntivirus(){
        return this.antivirus.ativar();
    }
}
