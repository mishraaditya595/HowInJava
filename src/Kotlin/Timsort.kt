package Kotlin

object Timsort
{
    var MIN_MERGE = 32
    fun minRunLength(n: Int): Int {
        var n = n
        assert(n >= 0)

        // Becomes 1 if any 1 bits are shifted off
        var r = 0
        while (n >= MIN_MERGE) {
            r = r or (n and 1)
            n = n shr 1
        }
        return n + r
    }

    // This function sorts array from left index to
    // to right index which is of size atmost RUN
    fun insertionSort(
        arr: IntArray, left: Int,
        right: Int
    ) {
        for (i in left + 1..right) {
            val temp = arr[i]
            var j = i - 1
            while (j >= left && arr[j] > temp) {
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = temp
        }
    }

    // Merge function merges the sorted runs
    fun merge(
        arr: IntArray, l: Int,
        m: Int, r: Int
    ) {
        // Original array is broken in two parts
        // left and right array
        val len1 = m - l + 1
        val len2 = r - m
        val left = IntArray(len1)
        val right = IntArray(len2)
        for (x in 0 until len1) {
            left[x] = arr[l + x]
        }
        for (x in 0 until len2) {
            right[x] = arr[m + 1 + x]
        }
        var i = 0
        var j = 0
        var k = l

        // After comparing, we merge those two array
        // in larger sub array
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i]
                i++
            } else {
                arr[k] = right[j]
                j++
            }
            k++
        }

        // Copy remaining elements
        // of left, if any
        while (i < len1) {
            arr[k] = left[i]
            k++
            i++
        }

        // Copy remaining element
        // of right, if any
        while (j < len2) {
            arr[k] = right[j]
            k++
            j++
        }
    }

    // Iterative Timsort function to sort the
    // array[0...n-1] (similar to merge sort)
    fun timSort(arr: IntArray, n: Int) {
        val minRun = minRunLength(MIN_MERGE)

        // Sort individual subarrays of size RUN
        var i = 0
        while (i < n) {
            insertionSort(
                arr, i,
                Math.min(i + MIN_MERGE - 1, n - 1)
            )
            i += minRun
        }

        // Start merging from size
        // RUN (or 32). It will
        // merge to form size 64,
        // then 128, 256 and so on
        // ....
        var size = minRun
        while (size < n) {


            // Pick starting point
            // of left sub array. We
            // are going to merge
            // arr[left..left+size-1]
            // and arr[left+size, left+2*size-1]
            // After every merge, we
            // increase left by 2*size
            var left = 0
            while (left < n) {


                // Find ending point of left sub array
                // mid+1 is starting point of right sub
                // array
                val mid = left + size - 1
                val right = Math.min(
                    left + 2 * size - 1,
                    n - 1
                )

                // Merge sub array arr[left.....mid] &
                // arr[mid+1....right]
                if (mid < right) merge(arr, left, mid, right)
                left += 2 * size
            }
            size = 2 * size
        }
    }

    fun printArray(arr: IntArray, n: Int) {
        for (i in 0 until n) {
            print(arr[i].toString() + " ")
        }
        println()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(
            -2, 7, 15, -14, 0, 15, 0, 7,
            -7, -4, -13, 5, 8, -14, 12
        )
        val n = arr.size
        println("Given Array is")
        printArray(arr, n)
        timSort(arr, n)
        println("After Sorting Array is")
        printArray(arr, n)
    }
}