fun main(){
    val l1 = Lamp() //Create l1 object1 of Lamp() class
    val l2 = Lamp() //Create l2 object2 of Lamp() class
    val ac = Account()

    l1.turnOn()
    l2.turnOff()

    l1.displayLight("l1")
    l2.displayLight("l2")

    ac.insert(5555,"Mark",10000f)
}