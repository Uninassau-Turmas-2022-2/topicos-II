data class Cachorro(
    var corPelo: String? = null
) : Animal() {

    override fun talk() {
        print("Au au!")
    }

    fun comer(){
        this.getName()
    }

}