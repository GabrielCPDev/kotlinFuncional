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
    val minhaFuncaoClasse = TesteClasse()
    println(minhaFuncaoClasse())
}
fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (a: Int, b: Int) -> Unit = ::teste
    println(minhaFuncao(2, 3))
}
fun teste(a:Int?= 0, b: Int? = 0){
    println("executa teste! ${a!! + b!!}")
}
class TesteClasse() : () -> Unit{
    override fun invoke() {
        println("executa invoke de classe")
    }
}
