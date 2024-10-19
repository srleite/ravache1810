public class Gerente extends Funcionario{
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 93;
    }

    @Override
    public String descreverResponsabilidades() {
        return "gerenciar";
    }
}
