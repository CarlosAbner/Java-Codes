public class Aula07EstruturasDeRepeticao04_02 {
    public static void main(String[] args) {

        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição é que o valor da parcela tem que ser maior ou igual a 1000 reais

        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + String.format("%.2f", valorParcela));
        }
        }
}
