
data class Produto(val name: String, val valor: Double)

class CarrinhoDeCompras() {

    private val _listaDeProdutos: MutableList<Produto> = mutableListOf()

    fun quantidadeDeProdutos() : Int {
        return _listaDeProdutos.size
    }

    fun listaProdutos(){
        println("Qtd: ${quantidadeDeProdutos()} - Lista de Produtos: $_listaDeProdutos")
    }

    fun listaProdutosOrdem() {

    }
    fun adicionarProduto(produto: Produto) {
        _listaDeProdutos.add(produto)
    }

    fun removerProduto(posicao: Int) {
        _listaDeProdutos.removeAt(posicao)
    }

    fun removerProduto(produto: Produto) {
        _listaDeProdutos.remove(produto)
    }

    fun buscarProdutoNome(nome: String) {
        val produtos = _listaDeProdutos.filter { produto ->
            produto.name.contains(nome)
        }
        println("Produtos Encontrados: $produtos" )
    }

    fun produtoMaisBarato() : Produto? {
        return _listaDeProdutos.minByOrNull { produto ->
            produto.valor
        }
    }

    fun produtoMaisCaro() : Produto? {
       return _listaDeProdutos.maxByOrNull { produto ->
           produto.valor
       }
    }

    fun esvasiar() {
        _listaDeProdutos.removeAll(_listaDeProdutos)
    }

    fun somaDosProdutos() : Double {
        return _listaDeProdutos.sumOf { it.valor }
    }


}


fun main() {

    val carrinhoDeCompras = CarrinhoDeCompras()
        carrinhoDeCompras.listaProdutos()
    val produto1 = Produto("Mouse", 15.55)
    val produto2 = Produto("Teclado", 20.14)
    carrinhoDeCompras.adicionarProduto(produto1)
    carrinhoDeCompras.adicionarProduto(produto2)
    carrinhoDeCompras.listaProdutos()
    carrinhoDeCompras.removerProduto(0)
    carrinhoDeCompras.removerProduto(produto2)
    carrinhoDeCompras.listaProdutos()
    carrinhoDeCompras.adicionarProduto(produto1)
    carrinhoDeCompras.adicionarProduto(produto2)
    carrinhoDeCompras.buscarProdutoNome("mo")
    println("Produto mais caro:  ${carrinhoDeCompras.produtoMaisCaro()}")
    println("Produto mais barato:  ${carrinhoDeCompras.produtoMaisBarato()}")

    println("Total: ${carrinhoDeCompras.somaDosProdutos()}")

    carrinhoDeCompras.esvasiar()
    carrinhoDeCompras.listaProdutos()


}