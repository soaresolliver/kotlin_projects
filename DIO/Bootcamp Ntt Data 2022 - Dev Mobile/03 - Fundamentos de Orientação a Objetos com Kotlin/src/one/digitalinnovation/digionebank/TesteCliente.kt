package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.testes.TesteAutenticacao

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}