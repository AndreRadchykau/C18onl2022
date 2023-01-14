import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class CashDesk {
    private final String cashDeskName;
    private final ReentrantLock lock;

    CashDesk(String cashDeskName) {
        this.cashDeskName = cashDeskName;
        lock = new ReentrantLock();
    }

    private String getCashDeskName() {
        return this.cashDeskName;
    }

    String getGoods(Buyer buyer) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        int item = rand.nextInt(buyer.getGoods().length);

        lock.lock();

        try {

            for (; item < buyer.getGoods().length; item++) {

                if (item != buyer.getGoods().length - 1) {
                    result.append(buyer.getGoods()[item]).append(", ");
                } else {
                    result.append(buyer.getGoods()[item]);
                }
            }

            Thread.sleep((int) (Math.random() * 100));

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return "Покупатель " + buyer.getName() + " купил: " + result + " в " + this.getCashDeskName();
    }

    ReentrantLock getLock() {
        return lock;
    }
}
