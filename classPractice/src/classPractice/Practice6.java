package classPractice;

class Market4 {
    int stock;       // 상품 재고
    int price;       // 상품 가격

    public Market(int stock, int price) {
        this.stock = stock;
        this.price = price;
    }

    public boolean sellTo(Consumer consumer, int quantity) {
        int totalCost = price * quantity;

        if (stock < quantity) {
            System.out.println("재고가 부족합니다.");
            return false;
        }

        if (consumer.getMoney() < totalCost) {
            System.out.println("소비자의 금액이 부족합니다.");
            return false;
        }

        stock -= quantity;
        consumer.pay(totalCost);
        System.out.println(quantity + "개의 상품을 판매했습니다.");
        return true;
    }

    public void printStock() {
        System.out.println("마켓의 남은 재고: " + stock);
    }
}

class Consumer4 {
    private int money;

    public Consumer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void pay(int amount) {
        money -= amount;
    }

    public void printMoney() {
        System.out.println("소비자의 남은 금액: " + money);
    }
}

public class Practice6 {
    public static void main(String[] args) {
        Market market = new Market(10, 1000);     // 재고 10개, 가격 1000원
        Consumer consumer = new Consumer(5000);   // 소비자 금액 5000원

        market.sellTo(consumer, 3);               // 3개 구매 시도

        market.printStock();                      // 마켓 재고 출력
        consumer.printMoney();                    // 소비자 잔액 출력
    }


}
