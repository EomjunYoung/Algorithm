import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    println(
        readLine()
            .split(" ")
            .map { it.toInt() }
            .reduce{ a, b -> a - b }
    )

}