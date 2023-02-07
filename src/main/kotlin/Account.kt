class Account{
    //1.properties
    private var acc_no:Int = 0
    private var name:String? = null
    private var amount: Float = 0f

    //2.method/function
    fun insert(ac:Int,n:String,am:Float){
        acc_no = ac
        name = n
        amount = am
        print("Acount no: $acc_no Holder: ${name} amount: ${amount}")
    }
    fun deposit(){

    }

    fun withdraw(){

    }

    fun checkBalance(){

    }

}