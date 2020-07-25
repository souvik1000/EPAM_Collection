public class MainClass {
    public static void main(String[] args) {
        DataList<Integer> list = new DataList<>();

        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(list);
        
        //Remove elements from index
        list.remove(2);
        System.out.println(list);
        
        //Fetching element with index
        System.out.println("Fetching at index 0 is " + list.get(0));
        System.out.println("Fetching at index 1 is " + list.get(1));

        //List Print
        System.out.println(list.toString());
    }
}