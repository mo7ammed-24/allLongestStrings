fun main() {
    println(mutableListOf("aba", "aa", "ad", "vcd", "aba"))
}

fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    var myList=mutableListOf<String>()
    var max=inputArray[0].length
    for(item in inputArray)
        if(item.length>=max)
            max=item.length
    for(item in inputArray)
        if(item.length>=max)
            myList.add(item)
    return myList
}
