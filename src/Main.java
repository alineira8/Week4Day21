public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> pair = Pair.create("Marks", 95);
        Pair<Integer, Integer> pair1= Pair.create(100, 20);

        System.out.println(pair);
        System.out.println(pair1);
    
    }
}