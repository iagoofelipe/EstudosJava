/*

Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o
método converterDolarParaReal() para converter um valor em dólar para reais. A classe
deve receber o valor em dólar como parâmetro.

*/

public class ConversorMoeda implements IConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.22;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.printf("$%.2f dólares equivalem a R$%.2f reais\n", 105.0, conversor.converterDolarParaReal(105));
    }
}
