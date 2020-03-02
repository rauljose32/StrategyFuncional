import java.util.List;
import java.util.function.Function;

public class ProcessarBoletos {

    /*
     * Function
     * Consumer
     * Suply
     * */
    private Function<String, List<Boleto>> lerArquivo;

    public void processar(String nomeArquivo) {
        System.out.println("Iniciando processanmento de arquivo");
        List<Boleto> boletos = lerArquivo.apply(nomeArquivo);
        for (Boleto boleto : boletos) {
            System.out.println(boleto);
        }

    }//method

    public ProcessarBoletos(Function<String, List<Boleto>> lerArquivo) {
        this.lerArquivo = lerArquivo;
    }//method

    public void setLerArquivo(Function<String, List<Boleto>> lerArquivo) {
        this.lerArquivo = lerArquivo;
    }//method

}//class
