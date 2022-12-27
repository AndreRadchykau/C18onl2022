package by.tms.flowers;

public class Main {
    /**
     * Задача2: Цветочный магазин.
     * Создать класс "Flower", который содержит переменные имя и стоимость, гет сет и toString (lombok подключаем)
     * Необходимо:
     * 1) собрать 5 букетов (используем массив) с определением их стоимости, т.е создаем класс Bouquet,
     * который содержит массив объектов Flower, который инициализируется через конструктор, а также метод по вычислению стоимости.
     * 2) вывести на консоль информацию по каждому букету.
     * 3*звездочка) Подсчитать количество всех проданных цветов.
     * Пояснения решения:
     * Создать класс FlowerMarket, который содержит метод public Bouquet getBouquet(String... flowers),
     * Создать enum FlowerType c константами названия цветов.
     * Для создания букета в метод getBouquet нужно передавать константы через запятую(ROSE, ROSE, ROSE, ROSE, ROSE)
     * По названию константы enam создать объект класса Flower и поместить в массив,
     * для передачи его в класс букета.
     * Также в енам константах необходимо создать переменную cost(стоимость) типа int и прописать стоимость каждого цветка, гет, сет, конструктор!
     * ROSE - 15
     * LILY - 7
     * ASTER - 5
     * HERBERA - 5
     * TULIP - 8
     * CARNATION - 11
     */
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();

        Bouquet bouquetOne = flowerMarket.getBouquet("ROSE", "ROSE");
        System.out.println("Price of first bouquet: " + bouquetOne.getFlowersPrice());

        Bouquet bouquetSecond = flowerMarket.getBouquet("ROSE", "HERBERA", "TULIP");
        System.out.println("Price of second bouquet: " + bouquetSecond.getFlowersPrice());

        Bouquet bouquetThird = flowerMarket.getBouquet("ASTER", "CARNATION", "TULIP");
        System.out.println("Price of third bouquet: " + bouquetThird.getFlowersPrice());

        Bouquet bouquetFourth = flowerMarket.getBouquet("LILY", "CARNATION", "ASTER");
        System.out.println("Price of fourth bouquet: " + bouquetFourth.getFlowersPrice());

        Bouquet bouquetFifth = flowerMarket.getBouquet("CARNATION", "CARNATION", "CARNATION");
        System.out.println("Price of fifth bouquet: " + bouquetFifth.getFlowersPrice());

        System.out.println("Total amount: " + (bouquetOne.getFlowersPrice() + bouquetSecond.getFlowersPrice() + bouquetThird.getFlowersPrice() + bouquetFourth.getFlowersPrice() + bouquetFifth.getFlowersPrice()));
    }
}
