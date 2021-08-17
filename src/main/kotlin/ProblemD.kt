class ProblemD {

    fun main() {

        var countOfRequests= readLine()?.toInt()

        for (i in 1 .. countOfRequests!!) {

            var numberOfClients= readLine()?.toInt()
            var clientsCoins = readLine()!!.split(" ").map { it.toLong() }.sorted().toTypedArray()

            var optimalPrice = clientsCoins[0]
            var gain = optimalPrice * numberOfClients!!;

            for (i in 1 .. numberOfClients-1) {
                if(clientsCoins[i] == clientsCoins[i - 1])
                    continue
                if(clientsCoins[i]*(numberOfClients-i) > gain) {
                    optimalPrice = clientsCoins[i]
                    gain = optimalPrice*(numberOfClients - i)
                }
            }
            println(gain)
        }
    }

}