package conta.cliente

data class Endereco(
    val logradouro: String,
    val numero: Int,
    val bairro: String,
    val complemento: String? = null


)
