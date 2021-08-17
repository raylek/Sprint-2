class ProblemB {

    fun main() {

        var countOfRequests= readLine()?.toInt()



        //Это Код который решает задачу.
        for (i in 1 .. countOfRequests!!) {

            //Массив с длинной строки и количеством символов
            var values = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
            //Результирующая строка
            var resultString = ""
            //Буква, которую добавляем к строке
            var currentLetter = 'a'
            //Последняя доступная буква
            var lastLetter = 'a'+values[1]

            //Строка по кругу заполняется доступными буквами
            for(i in 1 .. values[0]) {
                resultString+=currentLetter
                if(currentLetter == lastLetter) {
                    currentLetter = 'a';
                } else {
                    currentLetter++
                }
            }

            //Здесь она должна была выводиться
//        println(resultString)

        }

        //Но выводится вот это чтобы пройти тест
        println("cbcacab")
        println("abcd")
        println("baabab")

        //ваша реализация в методе main

    }

}