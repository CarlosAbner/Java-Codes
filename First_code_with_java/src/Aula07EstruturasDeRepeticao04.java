public class Aula07EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição é que o valor da parcela tem que ser maior ou igual a 1000 reais

        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + String.format("%.2f", valorParcela));
            }else break; // quando finalizar as 30 parcelas finalizar o for
        }
    }
}
