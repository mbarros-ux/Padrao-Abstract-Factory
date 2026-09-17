package padroescriacao.abstractfactory;

public class SuiteSegurancaBasica implements ISuiteSeguranca {
    @Override
    public IFirewall createFirewall() {
        return new FirewallBasico();
    }

    @Override
    public IAntivirus createAntivirus() {
        return new AntivirusBasico();
    }
}
