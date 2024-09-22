fun main() {
    print("Введите длину первой стороны: ")
    val storona1 = readLine()!!.toInt()

    print("Введите длину второй стороны: ")
    val storona2 = readLine()!!.toInt()

    print("Введите длину третьей стороны: ")
    val storona3 = readLine()!!.toInt()

    // проверка условия сущ треугольника
    if (storona1 + storona2 > storona3 && storona1 + storona3 > storona2 && storona2 + storona3 > storona1) {
        println("треугольник может существовать") // вывод если может
    } else {
        println("треугольник не может существовать") // вывод если не может
    }
}
