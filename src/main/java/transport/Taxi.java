package transport;

public class Taxi extends Transport implements TakePassenger, ChangeFuel {

    private String destination;
    private int destDistance;
    final int distance = 1;
    final int fee = 3000;
    final int distFee = 1000;
    private String status;
    final int maxPassenger = 4;

    private int passengerLeft;

    private int money;

    private int sumMoney;

    public int getMoney() {
        return money;
    }

    public void setPassengerLeft(int passengerLeft) {
        this.passengerLeft -= passengerLeft;
    }

    public int getPassengerLeft() {
        return passengerLeft;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public int getDestDistance() {
        return destDistance;
    }

    public void setDestDistance(int destDistance) {
        this.destDistance = destDistance;
        setMoney();
    }

    public int getFee() {
        return fee;
    }

    public int getDistFee() {
        return distFee;
    }

    public Taxi(int num) {
        setNum(num);
        setState("일반");
        passengerLeft = getMaxPassenger();
        setFuelAmount(100);
    }

    public void setMoney() {
        this.money = getFee() + (getDestDistance() - getDistance()) * getDistFee();
        setSumMoney(getMoney());
    }

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney += getMoney();
    }

    public void pay() {
        money = 0;
        passengerLeft = getMaxPassenger();
        setState("일반");
    }

    @Override
    public void takePassenger(int num) {
        if (getState().equals("일반")) {
            if (getPassengerLeft() >= num) {
                setPassengerLeft(num);
                System.out.println("탑승 승객 수 = " + num);
                setState("운행 중");
            }
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }

    @Override
    public void changeFuel(int amount) {
        setFuelAmount(amount);
        if (getFuelAmount() < 10) {
            System.out.println("주유가 필요합니다");
            setState("운행불가");
        }
    }
}
