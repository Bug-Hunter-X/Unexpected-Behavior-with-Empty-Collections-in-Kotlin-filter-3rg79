```kotlin
fun main() {
    val list = listOf(1, 3, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) //This will print 0, which is expected but not ideal

    val list2 = listOf(2,4,6)
    val evenNumbers2 = list2.filter { it % 2 == 0 }
    println(evenNumbers2.size) //This will print 3, which is expected

    //Solution - Handle empty collection case explicitly:
    val list3 = listOf(1,3,5)
    val evenNumbers3 = list3.filter { it % 2 == 0 }
    val evenNumbersCount = if (evenNumbers3.isEmpty()){
        0 //Or throw custom exception
    } else{
        evenNumbers3.size
    }
    println(evenNumbersCount)
}
```