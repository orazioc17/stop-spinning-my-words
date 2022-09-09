fun spinWords(sentence: String): String {
    val wordsList : List<String> = sentence.split(" ")
    val resultList: MutableList<String> = mutableListOf()
    wordsList.forEach {
            word -> if (word.length > 4) resultList.add(word.reversed())
            else resultList.add(word)
    }
    return resultList.joinToString(" ")
}
