
fun main() {
    val salario1 = 1000.0
    val salario2 = 2000.0
    val salario3 = 500.0

    val maiorsalario1 = if (salario1 > salario2 && salario1 > salario3) {
        salario1
    } else if (salario2 > salario1 && salario2 > salario1) {
        salario2
    } else {
        salario3
    }

    println(maiorsalario1)

    val arrayDeSalarios = DoubleArray(3)

    arrayDeSalarios[0] = salario1
    arrayDeSalarios[1] = salario2
    arrayDeSalarios[2] = salario3

    var maiorSalario2 = 0.0
    for ( salario in arrayDeSalarios.indices) {
        if (salario > maiorSalario2) {
            maiorSalario2 = arrayDeSalarios[salario]
        }
        println("Salario: ($salario) ${arrayDeSalarios[salario]}")
    }

    println("Maior Salario: $maiorSalario2")

    val somaToSalarios = arrayDeSalarios.sum()
    println("Soma dos Salarios: $somaToSalarios")

    val salariosOrdem = arrayDeSalarios.sorted().reversed()
    println("Salarios ordenados: $salariosOrdem")

    for ( salario in arrayDeSalarios.indices) {
        println("Salario: ($salario) ${salariosOrdem[salario]}")
    }
}