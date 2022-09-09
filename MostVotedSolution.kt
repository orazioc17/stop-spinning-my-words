fun spinWords(s: String) = s.split(" ").joinToString(" ") { if (it.length > 4) it.reversed() else it }
