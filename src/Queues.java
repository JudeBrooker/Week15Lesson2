import java.util.ArrayDeque;
public class Queues {
    public static void main(String[] args){
        ArrayDeque<String> queueBusStop = new ArrayDeque<>();
        queueBusStop.add("Person 1");
        queueBusStop.add("Person 2");
        queueBusStop.add("Person 3");
        System.out.println(queueBusStop);
        queueBusStop.remove();
        queueBusStop.add("Person 4");
        queueBusStop.remove();
        queueBusStop.remove();
        System.out.println(queueBusStop);
    }
}
