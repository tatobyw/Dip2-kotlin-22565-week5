class Lamp {
    //property(dta:member)/value
    private var isOn: Boolean = false
    //member function/method turnOn
    fun turnOn(){
        isOn = true
    }
    //member function turnOff
    fun turnOff(){
        isOn = false
    }

    fun displayLight(lamp: String) {
        if(isOn == true){
            println("$isOn Lamp is on")
        } else{
            println("$isOn Lamp is off")
        }
    }
}