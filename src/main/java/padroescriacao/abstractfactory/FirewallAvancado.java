package padroescriacao.abstractfactory;

public class FirewallAvancado implements IFirewall{
    @Override
    public String ativar() {
        return "Firewall Avançado Ativado";
    }
}
