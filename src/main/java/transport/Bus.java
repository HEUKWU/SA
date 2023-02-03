package transport;

public class Bus extends Transport implements TakePassenger, ChangeFuel {

    final int maxPassenger = 30;

    int passengerLeft = maxPassenger;

    final int fee = 1000;

    public Bus(int num) {
        setNum(num);
        System.out.println(getNum() + "번 버스객체 만들어짐!");
        passengerLeft = getMaxPassenger();
        setFuelAmount(100);
        setState("운행");
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public int getPassengerLeft() {
        return passengerLeft;
    }

    public void setPassengerLeft(int passengerLeft) {
        this.passengerLeft -= passengerLeft;
    }

    @Override
    public void takePassenger(int num) {
        if (getState().equals("운행")) {
            if (getPassengerLeft() >= num) {
                setPassengerLeft(num);
                System.out.println("탑승 승객 수 = " + num);
                System.out.println("요금 = " + num * fee);
            } else {
                System.out.println("최대 승객 수 초과");
            }
        }
    }
    @Override
    public void changeFuel(int amount) {
        setFuelAmount(amount);
        if (getFuelAmount() < 10) {
            System.out.println("주유가 필요합니다");
            setState("차고지행");
        }
    }
}
