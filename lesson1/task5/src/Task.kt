fun containsEven(collection: Collection<Int>): Boolean = collection.any {

    i: Int ->

    if (i % 2 == 0) {
        true
    } else {
        false
    }


 }