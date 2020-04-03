data class Recipe(var name: String)

fun main(args: Array<String>){
    var mShoppingList = mutableListOf("Tea","Eggs","Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies","Sugar","Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items add: $mShoppingList")
    if (mShoppingList.contains("Tea")){
        mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffe")
    }
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chivash","Spinach","Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items add: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe1" to r1,"Recipe2" to r2,"Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")
    val recipesToAdd = mapOf("Recipe4" to r4,"Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe1")){
        println("Recipe1 is ${mRecipeMap.getValue("Recipe1")}")
    }


}