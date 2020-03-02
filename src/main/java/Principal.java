public class Principal {

    public static void main(String[] args) {

        ProcessarBoletos processador = new ProcessarBoletos(LeituraRetorno::lerArquivoBB);

        processador.processar("batata");


        processador.setLerArquivo(LeituraRetorno::lerArquivoBradesco);
        processador.processar("Batata.csv");
    }

}
