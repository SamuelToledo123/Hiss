
public class Main {
    public static void main(String[] args) {

        Elevator elevator1 = new Elevator(0);
        Elevator elevator2 = new Elevator(5);

        System.out.println("Hiss1 står " + elevator1.where());
        System.out.println("Hiss2 sgår " + elevator2.where());

        elevator1.goTo(4);
        elevator2.goTo(1);

        System.out.println(elevator1.where());
        System.out.println(elevator2.where());



    }
}