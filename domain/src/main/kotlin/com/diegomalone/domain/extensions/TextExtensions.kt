package com.diegomalone.domain.extensions

import com.diegomalone.domain.EncodedChar
import com.diegomalone.domain.MorseCodeMap.map
import org.apache.commons.lang3.StringUtils
import java.util.Locale

fun String.toMorseCode(): List<EncodedChar> {
    val cleanString = clearString()
    val morseCharList = mutableListOf<EncodedChar>()

    cleanString.forEach { char ->
        char.toMorseCode()?.let { encodedChar ->
            morseCharList.add(encodedChar)
        }
    }

    return morseCharList
}

fun String.clearString() = StringUtils.stripAccents(this).toLowerCase(Locale.US)

fun Char.toMorseCode(): EncodedChar? {
    return map[this]?.let {
        EncodedChar(it)
    }
}