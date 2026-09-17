package padroescriacao.abstractfactory;

public class FirewallBasico implements IFirewall{
    @Override
    public String ativar() {
        return "Firewall Básico Ativado";
    }
}
