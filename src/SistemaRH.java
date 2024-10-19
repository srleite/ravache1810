public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Guliver");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Perineo");
        System.out.println("o salário do gerente é: ");
        System.out.println(gerente.calcularSalario());
        System.out.println("O gerente é responsavel por: ");
        System.out.println(gerente.descreverResponsabilidades());
        System.out.println("-----------------------------------------------");
        System.out.println("o salário do desenvolvedor é: ");
        System.out.println(desenvolvedor.calcularSalario());
        System.out.println("o desenvolvedor é responsável por: ");
        System.out.println(desenvolvedor.descreverResponsabilidades());
    }
}
