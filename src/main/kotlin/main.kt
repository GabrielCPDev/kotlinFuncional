fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()
//
    expressaoLambda()
    funcaoAnonima()

    funcaoLambdaComMultiploRetorno()

    funcaoAnonimaComMultiploRetorno()
}

fun funcaoLambdaComMultiploRetorno() {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{
        return@lambda if (it < 1000) it + 100.0 else it + 50
    }
    println(calculaBonificacao(1900.0))
}

fun funcaoAnonimaComMultiploRetorno() {
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario: Double): Double {
        return if (salario < 1000) salario + 100.0 else salario + 50
    }
    println(calculaBonificacaoAnonima(900.0))
}

fun expressaoLambda() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a , b ->
        println("minha funcao lambda")
        a + b
    }
    println(minhaFuncaoLambda(50,50))
}
fun funcaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("minha funcao anonima")
        return a + b }
    println(minhaFuncaoAnonima(15,15))
}
fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse:(Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(9,10))
}
fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (a: Int, b: Int) -> Int = ::soma
    println(minhaFuncao(2, 3))
}
fun soma(a:Int, b: Int): Int{
    return a + b
}
class Soma() : (Int, Int) -> Int{
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}
