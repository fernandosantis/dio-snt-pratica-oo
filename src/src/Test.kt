package conta

import conta.cliente.ClientePF
import conta.cliente.ClientePJ
import conta.cliente.Endereco
import conta.cliente.Segmento

fun main () {
    val conta1 = ContaPoupanca(2,"123")
    val conta2 = ContaCorrente(4,"321")
    val endereco = Endereco ("Rua Dona Balbina", 40, "Centro")
    val endereco2 = endereco.copy(complemento = "casa")
    println("Conta: " + conta1.numero + " - Agencia: " + conta1.agencia + "\n")
    conta1.depositar(15.0)
    conta2.depositar(200.0)
    conta1.sacar(5.0)
    conta2.transferir(conta1, 60.0)
    println( "\nSaldo Atual: " + conta1.getSaldo())

    val clienteFernando = ClientePF(endereco, conta1, "Fernando", 46)
    clienteFernando.imprimirDados()

    val clienteFirma = ClientePJ(endereco2, conta2, "111.111.111/0001-00","Empresa do Fernando")
    clienteFirma.imprimirDados()
}

