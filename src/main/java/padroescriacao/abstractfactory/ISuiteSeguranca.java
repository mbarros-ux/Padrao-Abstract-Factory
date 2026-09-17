package padroescriacao.abstractfactory;

public interface ISuiteSeguranca {
    IFirewall createFirewall();
    IAntivirus createAntivirus();
}
