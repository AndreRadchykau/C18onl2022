public class Buyer extends Thread {
    private final CashDesk[] cashDesks;
    private final String[] goods;

    Buyer(String name, CashDesk[] cashDesks, String[] goods) {
        super(name);
        this.cashDesks = cashDesks;
        this.goods = goods;
        this.start();
    }

    String[] getGoods() {
        return this.goods;
    }

    @Override
    public void run() {
        CashDesk chosenCashDesk = cashDesks[0];

        do {
            for (CashDesk cashDesk : cashDesks) {
                if (cashDesk.getLock().getQueueLength() < chosenCashDesk.getLock().getQueueLength()) {
                    chosenCashDesk = cashDesk;
                    break;
                }
            }
            System.out.println(chosenCashDesk.getGoods(this));
        } while (!this.isAlive());
    }
}
