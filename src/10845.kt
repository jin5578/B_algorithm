import java.util.*


private val queue: Queue<Int> = LinkedList<Int>()


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

private fun push(value: Int) {
    queue.offer(value)  //Queue에 삽입
}

private fun pop() {
    if (queue.isEmpty())
        println(-1)
    else
        println(queue.poll())    //Queue에서 제거
}

private fun size() {
    println(queue.size)
}

private fun empty() {
    if (queue.isEmpty())
        println(1)
    else
        println(0)
}

private fun front() {
    if (queue.isEmpty())
        println(-1)
    else
        println(queue.peek())   //Queue에서 가장 앞에 있는 수 읽기}
}

private fun back() {
    if (queue.isEmpty())
        println(-1)
    else
        println(queue.last())   //Queue에서 가장 뒤에 있는 수 읽기
}