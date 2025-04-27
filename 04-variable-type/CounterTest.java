public class CounterTest{

    public static void main(String[] args) {
        System.out.println("Counter Test , instance variable / object variable example");

        Counter counter1 = new Counter(); // create a new object of Counter class
        counter1.countUp(); // call the countUp method of counter1 object

        System.out.println("Counter 1: " + counter1.count); // print the count of counter1 object

        Counter counter2 = new Counter();
        counter2.countUp(); 

        System.out.println("Counter 2: " + counter2.count);




        System.out.println("Counter Test , static variable example");

        CounterStatic counterStatic1 = new CounterStatic(); // create a new object of CounterStatic class
        counterStatic1.countUp(); // call the countUp method of counterStatic1 object

        System.out.println("Counter Static 1: " + counterStatic1.count); // print the count of counterStatic1 object

        CounterStatic counterStatic2 = new CounterStatic();
        counterStatic2.countUp();

        System.out.println("Counter Static 2: " + counterStatic2.count);

    }
}

class Counter{
    int count; // instance variable , object variable

    void countUp(){
        count++;
    }

} 

class CounterStatic{
    static int count;

    void countUp(){
        count++;
    }
}