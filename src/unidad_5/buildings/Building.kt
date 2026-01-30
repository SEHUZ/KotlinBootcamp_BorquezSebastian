package unidad_5.buildings

//Agregar OUT en el valor generico de T porque la clase solamente arroja valores de tipo T, ahora
//la clase ahora solopuede devolver T y no recibirla
class Building<out T : BaseBuildingMaterial>(private val material: T) {
    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded: Int get() = material.numberNeeded * baseMaterialsNeeded

    fun build() {
        val materialName = material::class.simpleName
        println("$actualMaterialsNeeded $materialName required")
    }
}

//edificio de madera
fun main() {
    val woodBuilding = Building(Wood())
    val brickBuilding = Building(Brick())

    woodBuilding.build()
    isSmallBuilding(woodBuilding)

    brickBuilding.build()
    isSmallBuilding(brickBuilding)

}

//isSmallBuilding?
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}