import java.util.Scanner

fun main(args: Array<String>) {


   val bank = BankAccount(5000)
    bank.all()
//
//    bank.display()
//    bank.withDraw()
//    bank.deposit()
}

class BankAccount(var balance:Int)
{
    fun all()
    {
        println("Press 1 for balance enquiry")
        println("Press 2 for amount withdraw")
        println("Press 3 for deposit amount")
        var inputNum2 = Scanner(System.`in`)

        var inp = inputNum2.nextInt()
        when(inp){
            1->{
                display()
                all()
            }
            2->{
                withdraw()
                all()
            }

            3->{
                deposit()
                all()
            }
            else ->{
                println("Please enter valid number");
                all()
            }
        }
    }
    var scan = Scanner(System.`in`)
    var scan2 = Scanner(System.`in`)

    var withDr:Int = 0
    var depos:Int = 0

    fun withdraw()
    {
        println("Enter amount to withdraw")
        withDr = scan.nextInt()
        if(withDr>balance)
        {
            println("You don't have sufficient amount")
        }
        else{

            display()
        }


    }
    fun deposit ()
    {
        println("Enter amount to deposit")
        depos = scan2.nextInt()
        display ()
    }
    fun display()
    {
        var remaining:Int =0
        //if(withDr == 0 && depos == 0)
        // {
        // println("Total balance is $balance")
        // }

        var total:Int =0
        if(!(withDr > balance))
        {
            if(withDr>0 && withDr<balance)
            {
//                total = remaining+depos
//                println("Total Balance is $total")
                remaining = balance + depos - withDr
                println("Total Balance is $remaining")

            }
//            else {
//                remaining = balance + depos - withDr
//                println("Total Balance is $remaining")
//
//            }

        }
        else{





                total = balance+depos;
                println("Total Balance is $total")




        }
    }
}

//class BankAccount(var balance:Int)
//{
//    var scan = Scanner(System.`in`)
//    var withdr:Int=0
//    var depos:Int =0
//    fun withDraw()
//    {
//        println("Enter a amount to withdraw")
//        withdr = scan.nextInt()
//
//        display()
//
//    }
//    fun deposit()
//    {
//        println("Enter a amount to deposit")
//        depos = scan.nextInt()
//
//        display()
//
//    }
//    fun display()
//    {
//
//        if(withdr>0 || depos>0)
//        {
//            println("You withdrawed $withdr amount")
//            var remaining:Int = balance-withdr
//            println("Balance left is $remaining")
//
//        }
//        else if (depos>0)
//        {
//            println("You deposited $depos amount")
//            var remaining:Int = balance+depos
//            println("New Balance is $remaining")
//        }
//        else{
//            println("Total balance $balance")
//
//        }
//
//    }
//}