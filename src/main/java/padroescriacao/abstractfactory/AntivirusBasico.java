package padroescriacao.abstractfactory;

public class AntivirusBasico implements IAntivirus{
    @Override
    public String ativar() {
        return "Antivírus Básico Ativado";
    }
}
