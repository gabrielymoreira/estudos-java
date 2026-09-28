// Calculadora de Entrega
void main() {
    var caminhao = new Transporte(
            "Caminhão Volvo Modelo X",
            "GFZ6D90",
            600,
            600);

    caminhao.setCapacidadeEmKg(700); //alterar valor
    IO.println(caminhao.getCapacidadeEmKg());
}
