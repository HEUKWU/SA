package transport;

public class TaxiClient {
    public static void main(String[] args) {
        Taxi t = new Taxi(1);
        System.out.println("상태: " + t.getState());
        System.out.println("주유량: " + t.getFuelAmount());

        t.takePassenger(2);
        t.setDestDistance(2);
        t.setDestination("서울역");

        System.out.println("잔여 승객 수 = " + t.getPassengerLeft());
        System.out.println("기본 요금 확인 = " + t.getFee());
        System.out.println("목적지 = " + t.getDestination());
        System.out.println("목적지까지 거리 = " + t.getDestDistance() + "km");
        System.out.println("지불할 요금 = " + t.getMoney());
        System.out.println("상태 = " + t.getState());

        t.changeFuel(-80);
        System.out.println("주유량: " + t.getFuelAmount());

        t.pay();

        System.out.println("누적 요금 = " + t.getSumMoney());

        t.takePassenger(5);

        t.takePassenger(3);
        t.setDestDistance(12);
        t.setDestination("구로디지털단지역");

        System.out.println("잔여 승객 수 = " + t.getPassengerLeft());
        System.out.println("기본 요금 확인 = " + t.getFee());
        System.out.println("목적지 = " + t.getDestination());
        System.out.println("목적지까지 거리 = " + t.getDestDistance() + "km");
        System.out.println("지불할 요금 = " + t.getMoney());

        t.changeFuel(-20);
        System.out.println("상태 = " + t.getState());
        System.out.println("누적 요금 = " + t.getSumMoney());
    }
}
