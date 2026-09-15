void main() {
    var dolarAm = new Moeda();
    dolarAm.nome = "Dolar americano";
    dolarAm.cifra = "$";
    dolarAm.valor = 1;

    var realBr= new Moeda();
    realBr.nome = "Real Brasileiro";
    realBr.cifra = "R$";
    realBr.valor = 5.15;

    IO.println("""
            Bem vindo ao sistema de convensor de moedas.
            Digite a opção de moeda a ser convertida:
            1- Dólar
            2- Real
            """);

    var moeda1 = IO.readln();

    IO.println("""
            Digite a opção de moeda para converter:
            1- Dólar
            2- Real
            """);

    var moeda2 = IO.readln();

    if (moeda1.equals("1") && moeda2.equals("2")){
        IO.println("Digite o valor da moeda");
        var valor = Float.parseFloat(IO.readln());
        IO.print(dolarAm.cifra);
        IO.print(valor + "=" );
        IO.print(realBr.cifra);
        IO.println(String.format("%.2f"(valor * dolarAm.valor) * realBr.valor));
    }
    if (moeda1.equals("2") && moeda2.equals("1")){
        IO.println("Digite o valor da moeda");
        var valor = Float.parseFloat(IO.readln());
        IO.print(realBr.cifra);
        IO.print(valor + "=" );
        
        IO.print(dolarAm.cifra);
        IO.println(String.format("%.2f",(valor / realBr.valor) * dolarAm.valor));
        
    }

}
