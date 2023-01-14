package clother.utils;


import clother.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import static clother.Clothes.Size.*;
import static clother.Clothes.Type.*;
import static clother.PersonType.MAN;
import static clother.PersonType.WOMAN;


public class ClothesMain {
    public static void main(String[] args) {
        ArrayList<Clothes> clothesArrayList = new ArrayList<>();
        clothesArrayList.add(createClothes(CRAVAT, "синий", XS, 6));
        clothesArrayList.add(createClothes(SKIRT, "жёлтый", S, 50));
        clothesArrayList.add(createClothes(TSHIRT, "чёрный", M, 7));
        Atelier atelier = new Atelier(clothesArrayList);
        atelier.dress(MAN);
        atelier.dress(WOMAN);

        BigDecimal price;
        try {
            price = new BigDecimal("sds");
        } catch (Exception exception) {
            System.out.println("неверный формат данных");
        }

    }

    private static Clothes createClothes(Clothes.Type type, String color, Clothes.Size size, int cost) {
        return switch (type) {
            case PANTS -> Pants.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            case SKIRT -> Skirt.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            case CRAVAT -> Cravat.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            case TSHIRT -> TShirt.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            default -> throw new IllegalArgumentException("неверный тип данных");
        };
    }
}
