fun main() {

    val hombre = persona(ojos("marron"),
        boca("tiene unos labio que forman una boca"),
        nariz("una nariz"),orejas("dos orejas"),
        torzo("esta persona tiene cuello","caja","abdomen")
        ,brazos("tiene 2","tiene 2"))

    println(hombre.ojos.ojos)
    println(hombre.boca.boca)
    println(hombre.nariz.nariz)
    println(hombre.orejas.orejas)
    println(hombre.torzo.cuello)
    println(hombre.torzo.cajatoraxica)
    println(hombre.torzo.abdomen)
    println(hombre.brazos.antebrazos)
}