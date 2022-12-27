package by.tms.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Bouquet {
    private Flower[] flowers;

    public int getFlowersPrice() {
        int cost = 0;
        for (Flower flower : flowers) {
            cost += flower.getFlowerCost();
        }
        return cost;
    }
}
