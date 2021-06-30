package conta

abstract class Conta  (
    val numero: Int,
    val agencia: String) : MovimentacaoFinanceira {

    private var _saldo: Double = 0.0

    abstract fun taxa() : Double

    private fun temSaldo(valor: Double) : Boolean {
        return (_saldo >= valor)
    }

    fun getSaldo() : Double {
        return _saldo
    }

    override fun sacar(valor: Double) {
        if (temSaldo(valor))  {
            _saldo -= valor
            println("Saque -> Valor: $valor")

        } else {
            println("Saque -> Não há saldo suficiente!")
        }
    }

    override fun depositar(valor: Double) {
        if (valor > 0) {
            _saldo += valor
            println("Deposito -> Valor: $valor")
        } else {
            println("deposito -> Informe um valor valido para deposito")
        }
    }

    override fun transferir(contaDestino: Conta, valor: Double) {
        if(temSaldo(valor)) {
            this.sacar(valor+taxa())
            contaDestino.depositar(valor)
            println("""
                Transferência -> Valor: $valor
                Conta origem: ${this.numero} Saldo atual: ${this.getSaldo()}}
                Conta destino: ${contaDestino.numero} Saldo atual: ${contaDestino.getSaldo()}
                """.trimIndent())
        } else {
            print("Tranferência -> Não foi possível realizar a transferência!")
        }
    }

}
