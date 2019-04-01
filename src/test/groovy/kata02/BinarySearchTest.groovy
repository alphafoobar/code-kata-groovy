package kata02

class BinarySearchTest extends GroovyTestCase {

  private BinarySearch search = new BinarySearch()

  void test_nothing() {
    int[] ints = []
    assert -1 == search.chop(3, ints)
  }

  void test_one() {
    int[] ints = [1]
    assert -1 == search.chop(3, ints)
    assert 0 == search.chop(1, ints)
  }

  void test_three() {
    int[] ints = [1, 3, 5]
    assert 0, search.chop(1, ints)
    assert 1, search.chop(3, ints)
    assert 2, search.chop(5, ints)
    assert -1, search.chop(0, ints)
    assert -1, search.chop(2, ints)
    assert -1, search.chop(4, ints)
    assert -1, search.chop(6, ints)
  }

  void test_four() {
    int[] ints = [1, 3, 5, 7]
    assert 0, search.chop(1, ints)
    assert 1, search.chop(3, ints)
    assert 2, search.chop(5, ints)
    assert 3, search.chop(7, ints)
    assert -1, search.chop(0, ints)
    assert -1, search.chop(2, ints)
    assert -1, search.chop(4, ints)
    assert -1, search.chop(6, ints)
    assert -1, search.chop(8, ints)
  }
}
