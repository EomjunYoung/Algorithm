package programmers

fun main() {

    val clothes= arrayOf(arrayOf("yellowhat","headgear"),
            arrayOf("bluesunglasses", "eyewear"),
            arrayOf("green_turban", "headgear"))

    for (i in 0..clothes.size-1) {
        println(clothes[i][0])
    }


    for (i in 0..clothes.size-1) {

        println(clothes.groupBy { it[1] }.values)
        //2차원배열의 열값을 key로 만들고, 해당 key를 기준으로 map형태(리턴값)로 value를 만드는 함수
    }

    clothes.groupBy { it[1] }.values.fold(1) { acc, v -> acc * (v.size + 1) } - 1
    //values는 map형태로 리턴된 값을 불러오고, fold는 초기값을 정해 처음부터 끝까지 순차적으로 누적값을 계산해 나가는 함수
    //즉, 1을 초기값으로하고, acc, v의 두가지 매개변수를 통해 리턴값을 도출해나가는 것

//    for (i in 0..clothes.size-1) {
//
//        println(clothes.groupBy { it[1] }.values)
//    }
}