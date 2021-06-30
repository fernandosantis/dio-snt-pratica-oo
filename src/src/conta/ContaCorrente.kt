package conta

class ContaCorrente(pNumero: Int, pAgencia: String) : Conta(pNumero,pAgencia) {
    override fun taxa(): Double {
            return 0.50
    }


}