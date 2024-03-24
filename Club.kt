package com.example.utspemrogramanmobilesatu

// data class Club
data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ucl: Int,
    val uel: Int,
) {
    val totalTrophy: Int
        get() = epl + fa + efl + efl + ucl + uel ;
}

// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $epl trofi liga primer Inggris,$fa trofi FA, $efl trofi EFL, $ucl trofi Liga Champions, dan $uel trofi Liga Eropa"
}