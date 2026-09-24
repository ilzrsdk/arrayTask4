fun main() {
    print("Введите размер первого массива: ")
    var num = readln()
    while (num.toIntOrNull() == null || num.toInt() <= 0) {
        println("Ошибка ввода!")
        print("Введите размер первого массива: ")
        num = readln()
    }
    val massive1 = IntArray(num.toInt())
    for (i in 0..massive1.size - 1) {
        print("Введите элемент массива: ")
        massive1[i] = readln().toInt()
    }
    print("Введите размер второго массива: ")
    num = readln()
    while (num.toIntOrNull() == null || num.toInt() <= 0) {
        println("Ошибка ввода!")
        print("Введите размер второго массива: ")
        num = readln()
    }
    val massive2 = IntArray(num.toInt())
    for (i in 0..massive2.size - 1) {
        print("Введите элемент массива: ")
        massive2[i] = readln().toInt()
    }
    val result = mutableListOf<Int>()
    val list = massive2.toMutableList()
    for (i in massive1) {
        if (i in list) {
            result.add(i)
            list.remove(i)
        }
    }
    result.sort()
    println("Пересечение массивов: $result")
}