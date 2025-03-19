package service;

public class EmprestimoService {

    private static final double VALOR_MAXIMO = 50000;


    public boolean verificarAprovacao(double rendaAnual, double valorEmprestimo) {
        if (valorEmprestimo > VALOR_MAXIMO) {
            return false;
        }
        if (rendaAnual < 3 * valorEmprestimo) {
            return false;
        }
        return true;
    }
}
