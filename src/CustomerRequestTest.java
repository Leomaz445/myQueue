import java.util.Iterator;

public class CustomerRequestTest {
    public static void main(String[] args) {
        CustomersRequests nataliePortman = new CustomersRequests("Natalie", "Portman", 324L, "Shalom");
        CustomersRequests galGadot = new CustomersRequests("Gal", "Gadot", 123L, "Shalom");
        CustomersRequests inbarLavi = new CustomersRequests("Inbar", "Lavi", 226L, "Shalom");
        CustomersRequests fehrOded = new CustomersRequests("Oded", "Fehr", 1234L, "Shalom");
        CustomersRequests ayeletZurer = new CustomersRequests("Ayelet", "Zurer", 245L, "Shalom");
        CustomersRequests alonaTal = new CustomersRequests("Alona", "Tal", 123L, "Shalom");
        CustomersRequests gilaAlmagor = new CustomersRequests("Gila", "Almagor", 234L, "Shalom");
        CustomersRequests liorAshkenazi = new CustomersRequests("Lior", "Ashkenazi", 123L, "Shalom");
        CustomersRequests davidAvidan = new CustomersRequests("David", "Avidan", 999L, "Shalom");
        CustomersRequests akiAvni = new CustomersRequests("Aki", "Avni", 643L, "Shalom");
        CustomersRequests ornaBanai = new CustomersRequests("Orna", "Banai", 823L, "Shalom");

        customerRequestTest(nataliePortman, galGadot, inbarLavi, fehrOded, ayeletZurer, alonaTal, gilaAlmagor,
                liorAshkenazi, davidAvidan, akiAvni, ornaBanai);
    }

    private static void customerRequestTest(CustomersRequests nataliePortman, CustomersRequests galGadot,
                                            CustomersRequests inbarLavi, CustomersRequests fehrOded,
                                            CustomersRequests ayeletZurer, CustomersRequests alonaTal,
                                            CustomersRequests gilaAlmagor, CustomersRequests liorAshkenazi,
                                            CustomersRequests davidAvidan, CustomersRequests akiAvni,
                                            CustomersRequests ornaBanai) {
        System.out.println(Constants.ANSI_GREEN + "-------------------------Welcome to the tests-----------------------------" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 1 : Creating MyQueue" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_BLUE + "*****Should Work when the number is between 1-10" + Constants.ANSI_RESET);
        MyQueue<CustomersRequests> myQueue = new MyQueue<>(10);
        System.out.println(Constants.ANSI_PURPLE + "*****The size of the queue that was created: " + myQueue.size() + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "*****Printing myQueue:" + Constants.ANSI_RESET);
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 2 : Adding RandomValues" + Constants.ANSI_RESET);
        myQueue.add(galGadot, 3);
        myQueue.add(nataliePortman, 3);
        myQueue.add(inbarLavi, 2);
        myQueue.add(fehrOded, 1);
        myQueue.add(ayeletZurer, 0);
        myQueue.add(alonaTal, -5);
        myQueue.add(gilaAlmagor, 11);
        myQueue.add(liorAshkenazi, 10);
        myQueue.add(davidAvidan, 3);
        myQueue.add(akiAvni, 8);
        myQueue.add(ornaBanai, 9);
        System.out.println(Constants.ANSI_PURPLE + "*****Printing myQueue after adding:" + Constants.ANSI_RESET);
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_PURPLE + "The Size of the myQueue is now: " + myQueue.size() + " expected: 11" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 3 : using pop method" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "The First element Should be empty" + Constants.ANSI_RESET);
        myQueue.poll();
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_PURPLE + "after using pop again no element in the second part " + Constants.ANSI_RESET);
        myQueue.poll();
        System.out.println(Constants.ANSI_PURPLE + "after using pop 3 more time no value in third part " + Constants.ANSI_RESET);
        myQueue.poll();
        myQueue.poll();
        myQueue.poll();
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_BLUE + "------Test Number 4 : using contains method" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "Looking for something that is not there should return false" + Constants.ANSI_RESET);
        System.out.println(myQueue.contains(new CustomersRequests("Joe", "Doe", 999L, "Shalom")));
        System.out.println(Constants.ANSI_PURPLE + "Looking looking for something that is there:" + Constants.ANSI_RESET);
        System.out.println(myQueue.contains(ornaBanai));
        System.out.println(Constants.ANSI_BLUE + "------Test Number 5 : using contains method" + Constants.ANSI_RESET);
        System.out.println(Constants.ANSI_PURPLE + "should remove everything except one and return 5 true " + Constants.ANSI_RESET);
        System.out.println(myQueue.remove(akiAvni));
        System.out.println(myQueue.remove(ayeletZurer));
        System.out.println(myQueue.remove(ornaBanai));
        System.out.println(myQueue.remove(alonaTal));
        System.out.println(myQueue.remove(gilaAlmagor));
        System.out.println(Constants.ANSI_PURPLE + "AfterRemoving" + Constants.ANSI_RESET);
        System.out.println(myQueue);
        System.out.println(Constants.ANSI_BLUE+ "------Test Number 6 : iteratorTest"+Constants.ANSI_RESET);
        Iterator<CustomersRequests> iterator = myQueue.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

}
