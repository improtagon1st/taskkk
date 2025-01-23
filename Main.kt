import java.util.Scanner
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите номер задания (1-20):")
    val taskNumber = scanner.nextInt()
    when (taskNumber) {
        1 -> task1()
        2 -> task2()
        3 -> task3()
        4 -> task4()
        5 -> task5()
        6 -> task6()
        7 -> task7()
        8 -> task8()
        9 -> task9()
        10 -> task10()
        11 -> task11()
        12 -> task12()
        13 -> task13()
        14 -> task14()
        15 -> task15()
        16 -> task16()
        17 -> task17()
        18 -> task18()
        19 -> task19()
        20 -> task20()
        else -> println("Неверный номер задания. Введите число от 1 до 20.")
    }
}

fun task1() {
    val scanner = Scanner(System.`in`)
    println("Введите два числа:")

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if (a == b) throw IllegalArgumentException("Числа равны, невозможно определить максимум.")
    println("Максимум: ${if (a > b) a else b}")
}

fun task2() {
    val scanner = Scanner(System.`in`)
    println("Введите два числа:")

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо.")
    println("Результат деления: ${a.toDouble() / b}")
}

fun task3() {
    val scanner = Scanner(System.`in`)
    println("Введите строку:")

    val input = scanner.next()

    val result = input.toIntOrNull() ?: throw NumberFormatException("Строка не может быть конвертирована в число.")
    println("Преобразованное число: $result")
}

fun task4() {
    val scanner = Scanner(System.`in`)
    println("Введите возраст:")

    val age = scanner.nextInt()

    if (age < 0 || age > 150) throw IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150.")
    println("Возраст корректен")
}

fun task5() {
    val scanner = Scanner(System.`in`)
    println("Введите число:")

    val number = scanner.nextDouble()

    if (number < 0) throw IllegalArgumentException("Невозможно найти корень из отрицательного числа.")
    println("Квадратный корень: ${kotlin.math.sqrt(number)}")
}

fun task6() {
    val scanner = Scanner(System.`in`)
    println("Введите число для вычисления факториала:")

    val number = scanner.nextInt()

    if (number < 0) throw IllegalArgumentException("Факториал для отрицательного числа не определен.")
    var factorial = 1L
    for (i in 1..number) {
        factorial *= i
    }
    println("Факториал числа $number: $factorial")
}

fun task7() {
    val scanner = Scanner(System.`in`)
    println("Введите размер массива:")

    val size = scanner.nextInt()

    val array = IntArray(size) {
        println("Введите элемент массива:")
        scanner.nextInt()
    }
    if (array.contains(0)) throw IllegalArgumentException("Массив содержит нули.")
    println("Массив не содержит нулей")
}

fun task8() {
    val scanner = Scanner(System.`in`)
    println("Введите число и степень:")

    val base = scanner.nextDouble()
    val exponent = scanner.nextInt()

    if (exponent < 0) throw IllegalArgumentException("Степень не может быть отрицательной.")
    println("Результат: ${Math.pow(base, exponent.toDouble())}")
}

fun task9() {
    val scanner = Scanner(System.`in`)
    println("Введите строку:")

    val input = scanner.next()

    println("Введите количество символов:")

    val length = scanner.nextInt()

    if (length > input.length) throw IllegalArgumentException("Число символов больше длины строки.")
    println("Обрезанная строка: ${input.substring(0, length)}")
}

fun task10() {
    val scanner = Scanner(System.`in`)
    println("Введите размер массива:")

    val size = scanner.nextInt()

    val array = IntArray(size) {
        println("Введите элемент массива:")
        scanner.nextInt()
    }
    println("Введите элемент для поиска:")
    val element = scanner.nextInt()
    if (!array.contains(element)) throw IllegalArgumentException("Элемент $element не найден в массиве.")
    println("Элемент $element найден в массиве.")
}
fun task11() {
    val scanner = Scanner(System.`in`)
    println("Введите число для конвертации в двоичную систему:")

    val number = scanner.nextInt()

    if (number < 0) throw IllegalArgumentException("Число не может быть отрицательным.")
    println("Двоичное представление: ${Integer.toBinaryString(number)}")
}

fun task12() {
    val scanner = Scanner(System.`in`)
    println("Введите два числа для проверки делимости:")

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо.")
    println("Число $a ${if (a % b == 0) "делится" else "не делится"} на число $b")
}

fun task13() {
    val scanner = Scanner(System.`in`)
    println("Введите размер списка:")

    val size = scanner.nextInt()

    val list = MutableList(size) {
        println("Введите элемент списка:")
        scanner.nextInt()
    }
    println("Введите индекс элемента для чтения:")
    val index = scanner.nextInt()

    if (index !in list.indices) throw IndexOutOfBoundsException("Индекс $index выходит за пределы списка.")
    println("Элемент на индексе $index: ${list[index]}")
}

fun task14() {
    val scanner = Scanner(System.`in`)
    println("Введите пароль для проверки сложности:")

    val password = scanner.next()

    if (password.length < 8) throw IllegalArgumentException("Пароль слишком короткий, минимум 8 символов.")
    println("Пароль достаточно сложный.")
}

fun task15() {
    val scanner = Scanner(System.`in`)
    println("Введите дату в формате dd.MM.yyyy:")

    val input = scanner.next()

    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    try {
        val date = LocalDate.parse(input, formatter)
        println("Дата корректна: $date")
    } catch (e: DateTimeParseException) {
        throw IllegalArgumentException("Неверный формат даты.")
    }
}

fun task16() {
    val scanner = Scanner(System.`in`)
    println("Введите первую строку:")

    val str1 = scanner.nextLine()

    println("Введите вторую строку:")

    val str2 = scanner.nextLine()

    if (str1 == null || str2 == null) throw NullPointerException("Одна из строк равна null.")
    println("Результат конкатенации: $str1$str2")
}

fun task17() {
    val scanner = Scanner(System.`in`)

    println("Введите два числа:")
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо.")
    println("Остаток от деления: ${a % b}")
}

fun task18() {
    val scanner = Scanner(System.`in`)
    println("Введите число для вычисления квадратного корня:")

    val number = scanner.nextDouble()

    if (number < 0) throw IllegalArgumentException("Квадратный корень из отрицательного числа не определён.")
    println("Квадратный корень: ${kotlin.math.sqrt(number)}")
}

fun task19() {
    val scanner = Scanner(System.`in`)
    println("Введите температуру в градусах Цельсия:")

    val celsius = scanner.nextDouble()

    if (celsius < -273.15) throw IllegalArgumentException("Температура не может быть ниже абсолютного нуля.")
    println("Температура в Фаренгейтах: ${celsius * 9 / 5 + 32}")
}

fun task20() {
    val scanner = Scanner(System.`in`)
    println("Введите строку для проверки:")

    val input = scanner.nextLine()

    if (input.isEmpty() || input == null) throw IllegalArgumentException("Строка пуста или равна null.")
    println("Строка не пуста и не равна null.")
}