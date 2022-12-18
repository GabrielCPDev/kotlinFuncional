fun main() {
    val minhaFuncao: (a: Int, b: Int) -> Unit = ::teste

    println(minhaFuncao(2, 3))

    val minhaFuncaoClasse = TesteClasse()
    println(minhaFuncaoClasse())
}
fun teste(a:Int?= 0, b: Int? = 0){
    println("executa teste! ${a!! + b!!}")
}

class TesteClasse() : () -> Unit{
    override fun invoke() {
        println("executa invoke de classe")
    }


}
