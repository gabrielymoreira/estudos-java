void main() {
    var moedas = new
            EnumMap<TipoMoeda, Moeda>(TipoMoeda.class);

    moedas.put(TipoMoeda.BRL, new Moeda("Real Brasileiro",1));
    moedas.put(TipoMoeda.USD, new Moeda("Dólar Americano",5.16));
    moedas.put(TipoMoeda.EUR, new Moeda("Euro",5.94));
    moedas.put(TipoMoeda.AUD, new Moeda("Dólar Australiano",3.67));
    moedas.put(TipoMoeda.CAD, new Moeda("Dólar Canandense", 3.7));

    while (true) {
        IO.println("Aperte enter para continuar ou 0 para sair");
        var commando = IO.readln();
        if(commando.equals("0"))
            break;

        IO.print("Digite a moeda de origem:");
        var moedaDeOrigem = moedas.get(TipoMoeda.valueOf(IO.readln()));
        IO.print("Digite a sigla de destino:");
        var moedaDeDestino = moedas.get(TipoMoeda.valueOf(IO.readln()));

        IO.print("Digite o valor a ser convertido");
        var valor = Double.parseDouble(IO.readln());

        IO.println((valor * moedaDeOrigem.cotacao) / moedaDeDestino.cotacao);
    }
}
