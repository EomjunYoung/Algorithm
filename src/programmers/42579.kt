package programmers

fun main() {

    var genres = arrayOf<String>("classic", "pop", "classic", "classic", "pop")
    var plays = arrayOf<Int>(500, 600, 150, 800, 2500)

    println(genres.indices.groupBy { genres[it] }.toList().sortedByDescending { it.second.sumBy { plays[it] } }
            .map { it.second.sortedByDescending { plays[it] }.take(2) }.flatten().toIntArray()

    )


    for (i in 0..genres.indices.groupBy { genres[it] }.toList().sortedByDescending { it.second.sumBy { plays[it] } }
            .map { it.second.sortedByDescending { plays[it] }.take(2) }.flatten().toIntArray().size - 1) {

        println(genres.indices.groupBy { genres[it] }.toList().sortedByDescending { it.second.sumBy { plays[it] } }
                .map { it.second.sortedByDescending { plays[it] }.take(2) }.flatten().toIntArray()[i])

    }

//    for( i in 0..genres.indices.groupBy { genres[it] }.toList().get(0).second.size - 1) {
//
//        println(genres.indices.groupBy { genres[it] }.toList().get(0).second.get(i))
//
//    }




}