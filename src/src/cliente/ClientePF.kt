package conta.cliente

import conta.Conta

class ClientePF(
    endereco: Endereco,
    conta: Conta,
    val nome: String,
    val idade: Int


    ) : Cliente(endereco, conta){

    val segmento: Segmento
    get() = if (conta.getSaldo() >= 50){
        Segmento.VAN_GOGH
    } else {
        Segmento.CLASSICO
    }

    override fun imprimirDados() {
        println("""
            Nome: $nome, Conta: ${conta.numero}
            ${segmento.valor}
            Endereço:
            ${endereco.logradouro}, ${endereco.numero}
            ${endereco.complemento} - ${endereco.bairro}
        """.trimIndent())
    }
}