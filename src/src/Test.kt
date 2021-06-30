package conta

fun main () {
    val conta1 = ContaPoupanca(2,"123")
    val conta2 = ContaCorrente(4,"321")
    println("Conta: " + conta1.numero + " - Agencia: " + conta1.agencia + "\n")
    conta1.depositar(15.0)
    conta2.depositar(200.0)
    conta1.sacar(5.0)
    conta2.transferir(conta1, 50.0)
    println( "\nSaldo Atual: " + conta1.getSaldo())
}

