fun main(args: Array<String>) {
    var opcao = "Sim"

    while(opcao == "Sim"){

        print("Digite um valor para calcularmos sua tabuada: ")
        var num = readLine()!!.toInt()

        for(i in 1..10){

            println("$num X $i = ${num * i}")

        }


        for(i in 10 downTo 1){

            println("$num X $i = ${num * i}")

        }

        print("Você quer continuar?")
        opcao = readLine()!!

    }
}