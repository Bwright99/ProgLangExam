fun main(args: Array<String>) {
   println("Solutions to 8,9, and 10")
}

fun validateEmail(email: String): Boolean {
    print("Enter your email: ")
    val valideEmail= Regex("^[A-Za-z0-9+_.-]+@(.+)\$")

    val input = readLine() ?: ""
    if (valideEmail.matches(input)) {
        println("Email is valid")
    } else {
        println("Email is invalid")
    }
    return valideEmail.matches(email)

}

fun validateFloatingPointNumber(number: String): Boolean {
    print("Enter a floating point number: ");
    val validFloatingPoint = Regex("^[+-]?([0-9]*[.])?[0-9]+\$")

    val input = readLine() ?: ""
    if (validFloatingPoint.matches(input)) {
        println("Floating point number is valid")
    } else {
        println("Floating point number is invalid")
    }
    return validFloatingPoint.matches(number)
}

fun validateIntegerNumber(number: String): Boolean {
    print("Enter an integer number: ");
    val validInteger = Regex("^[+-]?[0-9]+\$")

    val input = readLine() ?: ""
    if (validInteger.matches(input)) {
        println("Integer number is valid")
    } else {
        println("Integer number is invalid")
    }
    return validInteger.matches(number)
}

