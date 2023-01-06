import java.util.ArrayList;
import java.util.Iterator;

public class MyQueue<T> implements Iterable<T> {
    private ArrayList<ArrayList<T>> myQueue;
    private int n;
    private int size;

    public MyQueue(int n) {
        if (!(n >= Constants.LOWER_BOUND && Constants.UPPER_BOUND >= n)) {
            System.out.println("Can't Create Queue");
        } else {
            this.n = n;
            this.size = 0;
            this.myQueue = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                myQueue.add(i, new ArrayList<T>());
            }
        }
    }

    public void add(T element, int priority) {
        if (priority >= Constants.LOWER_BOUND && priority <= this.n) {
            myQueue.get(priority - 1).add(element);
        } else {
            myQueue.get(n - 1).add(element);
        }
        this.size++;
    }


    public T poll() {
        T temp;
        for (ArrayList<T> element : myQueue) {
            if (!element.isEmpty()) {
                temp = element.get(Constants.FIRST_PLACE);
                element.remove(element.get(Constants.FIRST_PLACE));
                this.size--;
                return temp;
            }
        }
        return null;
    }

    public boolean contains(T item) {
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            T temp = iterator.next();
            if (item.equals(temp))
                return true;
        }
        return false;
    }

    public boolean remove(T item) {
        if (contains(item)) {
            for (ArrayList<T> element : myQueue) {
                for (T temp : element) {
                    if (item.equals(temp)) {
                        element.remove(item);
                        this.size--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return new myQueueIterator();
    }

    @Override
    public String toString() {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myQueue.size(); i++) {
            sb.append("Elements in priority number ")
                    .append(++count).append(": ");
            sb.append('\n');
            for (T element : myQueue.get(i)) {
                sb.append(element.toString() + "\n");
            }
        }
        return sb.toString().trim();
    }

    private class myQueueIterator implements Iterator<T> {
        private int currentPriority = 0;
        private Iterator<T> currentIterator = myQueue.get(0).iterator();

        @Override
        public boolean hasNext() {
            if (currentIterator.hasNext()) {
                return true;
            }
            for (int i = currentPriority + 1; i < myQueue.size(); i++) {
                if (myQueue.get(i).size() > 0) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public T next() {
            if (currentIterator.hasNext()) {
                return currentIterator.next();
            }
            for (int i = currentPriority + 1; i < myQueue.size(); i++) {
                if (myQueue.get(i).size() > 0) {
                    currentPriority = i;
                    currentIterator = myQueue.get(i).iterator();
                    return currentIterator.next();
                }
            }
            return null;
        }
    }
}

