class ProblemC {

    fun main() {

        var numberOfStudents= readLine()?.toInt()
        var studentsLevelArray = readLine()!!.split(" ").map { it.toInt() }.sorted().toTypedArray()
        var minimumNumberOfTasks = 0

        for (i in 1 .. numberOfStudents!! step 2) {
            minimumNumberOfTasks += studentsLevelArray[i] - studentsLevelArray[i-1]
        }

        println(minimumNumberOfTasks)

    }

}