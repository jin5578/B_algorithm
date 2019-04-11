import java.util.*


val queue: Queue<Int> = LinkedList<Int>()


fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if(n in 1.. 100000) {

        for(i in 0.. n) {

            val input = sc.nextLine().split(" ")

            when(input[0]) {
                "push" -> push(input[1].toInt())

                "pop" -> pop()

                "size" -> size()

                "empty" -> empty()

                "front" -> front()

                "back" -> back()
            }
        }
    }
}

fun push(value: Int) {
    queue.offer(value)  //Queue에 삽입
}

fun pop() {
    if (queue.isEmpty())
        println(-1)
    else
        println(queue.poll())    //Queue에서 제거
}

fun size() {
    println(queue.size)
}

fun empty() {
    if (queue.isEmpty())
        println(1)
    else
        println(0)
}

fun front() {
    if (queue.isEmpty())
        println(-1)
    else
        println(queue.peek())   //Queue에서 가장 앞에 있는 수 읽기}
}

fun back() {
    if (queue.isEmpty())
        println(-1)
    else
        println(queue.last())   //Queue에서 가장 뒤에 있는 수 읽기
}


























































//val queue: Queue<Int> = LinkedList<Int>()
//
//fun main(args: Array<String>) {
//    val sc = Scanner(System.`in`)
//
//    val n = sc.nextInt()
//
//    if (n in 1..10000) {
//
//        for (i in 0..n) {
//
//            val input = sc.nextLine().split(" ")
//
//            when (input[0]) {
//                "push" -> push(input[1].toInt())
//
//                "pop" -> pop()
//
//                "front" -> front()
//
//                "back" -> back()
//
//                "empty" -> empty()
//
//                "size" -> size()
//            }
//        }
//    }
//}
//
//fun push(value: Int) {
//    queue.offer(value)
//}
//
//fun front() {
//    if (queue.isEmpty())
//        println(-1)
//    else
//        println(queue.element())
//}
//
//fun back() {
//    if (queue.isEmpty())
//        println(-1)
//    else
//        println(queue.last())
//}
//
//fun empty() {
//    if (queue.isEmpty())
//        println(1)
//    else
//        println(0)
//}
//
//fun size() {
//    println(queue.size)
//}
//
//fun pop() {
//    if(queue.isEmpty())
//        println(-1)
//    else
//        queue.poll()
//}

