package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();


    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + "합계: " + item.getTotalPrice());
        }
        int totalPrice = 0;
        calculatorPrice(totalPrice);
    }

    private void calculatorPrice(int totalPrice) {
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
