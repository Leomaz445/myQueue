import java.util.Iterator;

public class StringTest {
    public static void main(String[] args) {
        testMyQueue();
    }

    private static void testMyQueue() {
        System.out.println(Constants.ANSI_GREEN + "-------------------------Welcome to the tests------------------------" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 1 : Creating MyQueue" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_BLUE + "*****Should Work when the number is between 1-10" + Constants.ANSI_RESET);
        MyQueue<String> myQueue = new MyQueue<>(10);
        System.out.println(Constants.ANSI_PURPLE + "*****The size of the queue that was created: " + myQueue.size() + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "*****Printing myQueue:" + Constants.ANSI_RESET);
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 2 : Adding RandomValues" + Constants.ANSI_RESET);
        addMethodForTest(myQueue);
        System.out.println(Constants.ANSI_PURPLE + "*****Printing myQueue after adding:" + Constants.ANSI_RESET);
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_PURPLE + "The Size of the myQueue is now: " + myQueue.size() + " expected: 11" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 3 : using pop method" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "The First element Should be empty" + Constants.ANSI_RESET);
        myQueue.poll();
        System.out.println(myQueue.toString());
        System.out.println(Constants.ANSI_PURPLE + "after using pop again no element in the second part " + Constants.ANSI_RESET);
        myQueue.poll();
        System.out.println(Constants.ANSI_PURPLE + "after using pop 3 more time no value in third part " + Constants.ANSI_RESET);
        myQueue.poll();
        myQueue.poll();
        myQueue.poll();
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 4 : using contains method" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "Looking for something that is not there should return false" + Constants.ANSI_RESET);
        System.out.println(myQueue.contains("nothing_should_be"));
        System.out.println(Constants.ANSI_PURPLE + "Looking looking for something that is there:" + Constants.ANSI_RESET);
        System.out.println(myQueue.contains("ill-informed"));
        System.out.println(Constants.ANSI_BLUE + "------Test Number 5 : using contains method" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "should remove everything except one and return 5 true " + Constants.ANSI_RESET);
        System.out.println(myQueue.remove("honorable"));
        System.out.println(myQueue.remove("ill-informed"));
        System.out.println(myQueue.remove("wheel"));
        System.out.println(myQueue.remove("soup"));
        System.out.println(myQueue.remove("morale"));
        System.out.println(Constants.ANSI_PURPLE + "AfterRemoving" + Constants.ANSI_RESET);
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 6 : iteratorTest" + Constants.ANSI_RESET);
        Iterator<String> iterator = myQueue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        addMethodForTest(myQueue);
        Iterator<String> iterator1 = myQueue.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());


    }

    private static void addMethodForTest(MyQueue<String> myQueue) {
        myQueue.add("butterfly", 3);
        myQueue.add("loose", 3);
        myQueue.add("reconcile", 2);
        myQueue.add("feast", 1);
        myQueue.add("wheel", 0);
        myQueue.add("soup", -5);
        myQueue.add("morale", 11);
        myQueue.add("valid", 10);
        myQueue.add("wretched", 3);
        myQueue.add("honorable", 8);
        myQueue.add("ill-informed", 9);
    }


}
