package org.zeelo.mytrials.model;

//public class Sample {
//
//    static void myFunctionalInterfaceTest(MyFunctionalInterface myFunctionalInterface) {
//        myFunctionalInterface.defaultMethod();
//        myFunctionalInterface.myMethod();
//    }
//}
//
//    // Find most repeated character/number
//    public static Integer findMostRepeated(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            return null; // Handle empty or null array
//        }
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.sort(Comparator.reverseOrder());
//
//        SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
//
//
////        return
////        System.out.println(
////                Arrays.stream(arr)
////                .boxed() // Convert IntStream to Stream<Integer>
////                .collect(Collectors.groupingBy(
////                        Function.identity(), // Group by the element itself
////                        Collectors.counting())) // Count occurrences of each element
////
////                .entrySet().stream() // Convert the map to a stream of entries
////                .max(Map.Entry.comparingByValue()) // Find the entry with the maximum value (count)
////                .map(Map.Entry::getKey) // Extract the key (element) from the entry
////                .orElse(orElsenull); // Return null if no element is found
//    }
//
//    public static Integer findThirdLargestNumber(int[] arr) {
//        // Find third largest number
//        List<Integer> data = List.of(10, 4, 5, 6, 9);
//        int x =0;
//
//        data
//                .stream()
//                .distinct() // Ensure distinct numbers
//                .sorted(Comparator.reverseOrder()) // Sort in descending order
//                .skip(2) // Skip the first two (largest and second largest)
////                .findFirst() // Get the first element (third largest)
//                .forEach(System.out::println);
////                .orElse(null);
//
////        System.out.println("Third largest number: " + x);
//        System.out.println();
//
//        return  x;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//
//        int[] array = {1, 2, 3, 2, 2, 4, 5, 2, 6, 6};
//        Integer mostRepeated = findMostRepeated(array);
//
//        if (mostRepeated != null) {
//            System.out.println("The most repeated element is: " + mostRepeated);
//        } else {
//            System.out.println("The array is empty or null.");
//        }
//
//        Predicate<String> predicate = s -> s.equals("a");
//        Function<String, String> function = new Function<String, String>() {
//            @Override
//            public String apply(String object) {
//                return "Function updates: "+ object;
//            }
//        };
//
//        myFunctionalInterfaceTest(() -> System.out.println("Try1"));
//        myFunctionalInterfaceTest(() -> System.out.println("Try2"));
//        myFunctionalInterfaceTest(() -> System.out.println("Try3"));
//
//        Supplier<String> supplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "Supplier returns";
//            }
//        };
//
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("Consumer: " + s);
//            }
//        };
//
//        List<String> list = List.of("z","h","a", "b", "c");
//        list.stream().forEach(consumer);
//        list.stream().map(function).forEach(consumer);
//        list.stream().map(s -> s.toUpperCase()+ "-- CHANGED").sorted().forEach(consumer);
//
//        list.stream().sorted().forEach(consumer); // Original not updated
//
//        System.out.println();
//        list.stream().flatMap(s -> List.of(s, s.toUpperCase(), s.concat(": LowerCase"), "AnotherOne").stream()).forEach(consumer); // FlatMap updates by adding new elements to the steam.
//
//
//        LinkedList<String> list2 = new LinkedList<>(List.of("z","h","a", "b", "c"));
//
//        Car car = new Car();
//        Car truck = new Truck();
//        Car sedan = new Sedan();
//
//        Runnable runnable = () -> {
//            try {
//                car.move();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//
//        Runnable runnable2 = () -> {
//            try {
//                truck.move();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//
//        Runnable runnable3 = () -> {
//            try {
//                sedan.move();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
////
////        Thread thread = new Thread(runnable);
////        thread.start();
////
////        Thread thread1 = new Thread(runnable2);
////        thread1.start();
////
////        Thread thread2 = new Thread(runnable3);
////        thread2.setName("Sedan Thread");
////        thread2.start();
////
////        thread.join(); //wait for thread to finish then continue
////
////        for (int i = 0; i < 10; i++) {
////            SingletonClass singletonClass = SingletonClass.getInstance();
////            System.out.println(singletonClass.hashCode());
////
////            System.out.println("Same instance?: "+ (singletonClass.hashCode()==1463801669));
////        }
////
////        System.gc();
//    }
//}
//
//@FunctionalInterface
//interface MyFunctionalInterface {
//    public void myMethod();
//
//    default void defaultMethod(){
//        System.out.println("Default method");
//    }
//}
//
//class SingletonClass{
//
//    private static SingletonClass instance;
//    private SingletonClass(){}
//
//    public static SingletonClass getInstance(){
//        if(instance == null){
//            instance = new SingletonClass();
//        }
//        return instance;
//    }
//}
//
//class Car {
//
//    void move() throws InterruptedException {
//        System.out.println("Car is moving");
//        Thread.sleep(1000);
//        System.out.println(Thread.currentThread().getName() + " is moving");
//    }
//}
//
//class Truck extends Car {
//    void move() throws InterruptedException {
//        System.out.println("Truck is moving");
//        Thread.sleep(1000);
//        System.out.println(Thread.currentThread().getName() + " is moving");
//
//    }
//}
//
//class Sedan extends Car {
//    void move() throws InterruptedException {
//        System.out.println("Sedan is moving");
//        Thread.sleep(1000);
//        System.out.println(Thread.currentThread().getName() + " is moving");
//
//    }
//}
