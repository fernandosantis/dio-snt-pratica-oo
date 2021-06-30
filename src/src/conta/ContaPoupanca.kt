package conta

class ContaPoupanca(pNumero: Int, pAgencia: String) : Conta(pNumero,pAgencia) {
    override fun taxa(): Double {
        return 0.0
    }
}