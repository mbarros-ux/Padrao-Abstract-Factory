package padroescriacao.abstractfactory;

public class SuiteSegurancaAvancada implements ISuiteSeguranca {
    @Override
    public IFirewall createFirewall() {
        return new FirewallAvancado();
    }

    @Override
    public IAntivirus createAntivirus() {
        return new AntivirusAvancado();
    }
}
