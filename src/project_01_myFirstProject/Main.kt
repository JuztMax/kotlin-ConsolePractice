package project_01_myFirstProject

fun main() {
    var staffExpenses: Int = 0
    var otherExpenses: Int = 0
    val bubblegum = 202
    val toffee = 118
    val iceCream = 2250
    val milkChocolate = 1680
    val doughnut = 1075
    val pancake = 80
    val amountEarned = bubblegum + toffee + doughnut + iceCream + milkChocolate + pancake

    println("Earned amount:")
    println("bubblegum: $$bubblegum")
    println("toffee: $toffee")
    println("Ice cream: $iceCream")
    println("Milk chocolate: $milkChocolate")
    println("doughnut: $doughnut")
    println("pancake: $pancake")
    println()
    println("Income: $amountEarned")

    println("Staff expenses:")
    staffExpenses = readln().toInt()
    println("Other expenses:")
    otherExpenses = readln().toInt()

    val netIncome = amountEarned - staffExpenses - otherExpenses
    println("Net income: $netIncome")
}