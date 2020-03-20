package com.diegomalone.morsenotifier

import com.diegomalone.morsenotifier.domain.SignalLength.SHORT
import com.diegomalone.morsenotifier.domain.SignalLength.LONG

object MorseCodeMap {
    val map = mapOf(
        'a' to listOf(SHORT, LONG),
        'b' to listOf(LONG, SHORT, SHORT, SHORT),
        'c' to listOf(LONG, SHORT, LONG, SHORT),
        'd' to listOf(LONG, SHORT, SHORT),
        'e' to listOf(SHORT),
        'f' to listOf(SHORT, SHORT, LONG, SHORT),
        'g' to listOf(LONG, LONG, SHORT),
        'h' to listOf(SHORT, SHORT, SHORT, SHORT),
        'i' to listOf(SHORT, SHORT),
        'j' to listOf(SHORT, LONG, LONG, LONG),
        'k' to listOf(LONG, SHORT, LONG),
        'l' to listOf(SHORT, LONG, SHORT, SHORT),
        'm' to listOf(LONG, LONG),
        'n' to listOf(LONG, SHORT),
        'o' to listOf(LONG, LONG, LONG),
        'p' to listOf(SHORT, LONG, LONG, SHORT),
        'q' to listOf(LONG, LONG, SHORT, LONG),
        'r' to listOf(SHORT, LONG, SHORT),
        's' to listOf(SHORT, SHORT, SHORT),
        't' to listOf(LONG),
        'u' to listOf(SHORT, SHORT, LONG),
        'v' to listOf(SHORT, SHORT, SHORT, LONG),
        'w' to listOf(SHORT, LONG, LONG),
        'x' to listOf(LONG, SHORT, SHORT, LONG),
        'y' to listOf(LONG, SHORT, LONG, LONG),
        'z' to listOf(LONG, LONG, SHORT, SHORT),
        '0' to listOf(LONG, LONG, LONG, LONG, LONG),
        '1' to listOf(SHORT, LONG, LONG, LONG, LONG),
        '2' to listOf(SHORT, SHORT, LONG, LONG, LONG),
        '3' to listOf(SHORT, SHORT, SHORT, LONG, LONG),
        '4' to listOf(SHORT, SHORT, SHORT, SHORT, LONG),
        '5' to listOf(SHORT, SHORT, SHORT, SHORT, SHORT),
        '6' to listOf(LONG, SHORT, SHORT, SHORT, SHORT),
        '7' to listOf(LONG, LONG, SHORT, SHORT, SHORT),
        '8' to listOf(LONG, LONG, LONG, SHORT, SHORT),
        '9' to listOf(LONG, LONG, LONG, LONG, SHORT),
        '&' to listOf(SHORT, LONG, SHORT, SHORT, SHORT),
        '\'' to listOf(SHORT, LONG, LONG, LONG, LONG, SHORT),
        '@' to listOf(SHORT, LONG, LONG, SHORT, LONG, SHORT),
        '(' to listOf(LONG, SHORT, LONG, LONG, SHORT, LONG),
        ')' to listOf(LONG, SHORT, LONG, LONG, SHORT),
        ':' to listOf(LONG, LONG, LONG, SHORT, SHORT, SHORT),
        ',' to listOf(LONG, LONG, SHORT, SHORT, LONG, LONG),
        '=' to listOf(LONG, SHORT, SHORT, SHORT, LONG),
        '!' to listOf(LONG, SHORT, LONG, SHORT, LONG, LONG),
        '.' to listOf(SHORT, LONG, SHORT, LONG, SHORT, LONG),
        '-' to listOf(LONG, SHORT, SHORT, SHORT, SHORT, LONG),
        '+' to listOf(SHORT, LONG, SHORT, LONG, SHORT),
        '"' to listOf(SHORT, LONG, SHORT, SHORT, LONG, SHORT),
        '?' to listOf(SHORT, SHORT, LONG, LONG, SHORT, SHORT),
        '/' to listOf(LONG, SHORT, SHORT, LONG, SHORT)
    )
}