fun main() {
    val miauto = auto(motor(400),rueda(400),puerta("cian"),carroseria("supra"),asientos("son negros"))
    println(
        miauto.motor.aceleracion)
    miauto.motor.engine()
    var rueda1=rueda(giro = 300)
    println(rueda1.giro)
    println(miauto.rueda.giro)
    miauto.rueda.girar()
    rueda1.girar()
    println(miauto.puerta.puerta)
    miauto.puerta
    miauto.puerta.ventanas()
    println(miauto.carroseria.carroseria)
    println(miauto.asientos.asientos)

}