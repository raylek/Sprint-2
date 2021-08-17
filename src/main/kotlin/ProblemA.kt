class ProblemA {

    fun main() {

        var countOfRequests= readLine()?.toInt()

        for (i in 1 ..countOfRequests!!) {
            var values = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()
            var numberOfLeftJumps: Long = values[2] / 2;
            var numberOfRightJumps: Long = if(values[2] % 2 == 0L) {
                values[2] / 2;
            } else {
                values[2] / 2 + 1;
            }
            println(numberOfRightJumps*values[0] - numberOfLeftJumps*values[1])
        }

    }

}