import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){

    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    var result = a*b*c

    val arr = Array<Int>(10) { 0 }
    //val arr = Array<Int>(10, {0}) 도 같은 선언값
    //val arr = IntArray(10, {0})
    //val arr = arrayOf<Int>(10, 20, 30) 처럼 초기화
    //val arr = intArrayOf<Int>(10, 20, 30) 처럼 초기화

    while(result > 0) {
        arr[result % 10]++
        result /= 10
    }

    for(i in 0..arr.size - 1) {
//      println(arr.get(i)) 배열값을 표시하는 또 다른 방법
        println(arr[i])
    }
}