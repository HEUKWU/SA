package transport;

public class BusClient {
    public static void main(String[] args) {
        Bus b1 = new Bus(1);
        Bus b2 = new Bus(2);

        b1.takePassenger(2);
        System.out.println("잔여 승객 수 = " + b1.getPassengerLeft());

        b1.changeFuel(-50);
        System.out.println("주유량: " + b1.getFuelAmount());

        b1.setState("차고지행");
        System.out.println("상태: " + b1.getState());

        b1.changeFuel(10);
        System.out.println("주유량: " + b1.getFuelAmount());

        b1.setState("운행");
        System.out.println("상태: " + b1.getState());

        b1.takePassenger(45);

        b1.takePassenger(5);
        System.out.println("잔여 승객 수 = " + b1.getPassengerLeft());

        b1.changeFuel(-55);

        System.out.println("주유량: " + b1.getFuelAmount());
        System.out.println(b1.getState());
    }
}
