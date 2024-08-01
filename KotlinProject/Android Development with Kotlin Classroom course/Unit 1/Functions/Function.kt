class Bank {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val date = Date(1, 1, 1998)
            val idGen = IDGenerator()
            val idGen2 = IDGenerator()
            val id = idGen.generate(date)
            println(id.toString())
            val id2 = idGen2.generate(date)
            println(id2.toString())
//            var account = DebitAccount("Tasnuva", id, date, "Mehnaz")
//            account.deposit(C)
//            account.withdraw(150.0)
//            account.printInfo()
        }
    }
}
