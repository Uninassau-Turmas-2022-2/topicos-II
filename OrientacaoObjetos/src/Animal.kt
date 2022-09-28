open class Animal {

    private var name: String? = null
    private var scientificName: String? = null

    fun setScientificName(scientificName: String){
        this.scientificName = scientificName
    }

    fun getScientificName() = this.scientificName

    fun setName(name: String){
        this.name = name
    }

    fun getName() = this.name

    open fun talk() {
        print("Olá!")
    }

    fun walk() {

    }
}