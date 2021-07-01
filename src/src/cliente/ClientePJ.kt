package conta.cliente

import conta.Conta

class ClientePJ(
    endereco: Endereco,
    conta: Conta,
    val cnpj: String,
    val razaoSocial: String
) : Cliente(endereco, conta) {
    override fun imprimirDados() {
        println("""
            Razão Social: $razaoSocial
            Conta: ${conta.numero}
            Endereço:
            ${endereco.logradouro}, ${endereco.numero}
            ${endereco.complemento} - ${endereco.bairro}
        """.trimIndent())
    }
}