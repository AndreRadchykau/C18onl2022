package by.tms.flowers;

public class FlowerMarket {
    public Bouquet getBouquet(String... flowers) {
        Flower[] bouquetWIthFLower = new Flower[flowers.length];
        int counter = 0;
        for (String string : flowers) {
            FlowerType fitFlowers = FlowerType.valueOf(string);
            bouquetWIthFLower[counter] = new Flower(string, fitFlowers.costFlower);
            counter++;
        }
        return new Bouquet(bouquetWIthFLower);
    }
}
