import java.util.Iterator;

public class Peeking_Iterator_284 {

	public static void main(String[] args) {

	}

	private Integer next = null;
    private Iterator<Integer> iter;

	class PeekingIterator implements Iterator<Integer> {

		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
			iter = iterator;
	        if (iter.hasNext())
	            next = iter.next();
		}

	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
			return next; 
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
			Integer res = next;
	        next = iter.hasNext() ? iter.next() : null;
	        return res; 
		}

		@Override
		public boolean hasNext() {
			return next != null;
		}
	}
}
