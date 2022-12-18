fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()
//
    expressaoLambda()
    funcaoAnonima()
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
