package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal


fun main() {
    val jether = Pessoa(nome = "Jether Rodrigues", cpf = "1234567809")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario("Jether Rodrigues", "1234567809", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}