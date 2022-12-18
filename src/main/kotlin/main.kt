fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()

    expressaoLambda()
    funcaoAnonima()
}
fun expressaoLambda() {
    val minhaFuncaoLambda: () -> Unit = { println("minha funcao lambda") }
    println(minhaFuncaoLambda())
}
fun funcaoAnonima() {
    val minhaFuncaoAnonima: () -> Unit = fun() { println("minha funcao anonima") }
    println(minhaFuncaoAnonima())
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
