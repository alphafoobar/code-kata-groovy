package kata02

class BinarySearch {

  int chop(int key, int[] array) {
    return chopWorker(key, array, 0, array.length)
  }

  private int chopWorker(int key, int[] array, int offset, int length) {
    int remaining = length - offset
    if (remaining == 0) {
      return -1
    }
    int point = (int) (offset + remaining / 2)
    if (array[point] == key) {
      return point
    }
    if (array[point] > key) {
      return chopWorker(key, array, offset, point)
    }
    return chopWorker(key, array, point + 1, length)
  }
}
