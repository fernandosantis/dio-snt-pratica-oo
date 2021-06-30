package conta

interface MovimentacaoFinanceira {
    fun sacar(valor: Double)

    fun depositar(valor: Double)

    fun transferir(contaDestino: Conta, valor: Double)

}