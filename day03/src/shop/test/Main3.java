package shop.test;

import shop.dto.ItemDto;
import shop.service.ItemService;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();

        System.out.println("1. Item Insert...");
        ItemDto itemDto1 = new ItemDto(100, "사과", 5000);
        itemService.register(itemDto1);

        System.out.println("\n2. Item SelectAll...");
        List<ItemDto> items = itemService.get();
        for (ItemDto item : items) {
            System.out.println(item);
        }

        System.out.println("\n3. Item Update...");
        ItemDto updatedItem = new ItemDto(100, "청사과", 5500);
        itemService.modify(updatedItem);

        System.out.println("\n4. Item Delete...");
        itemService.remove(100);

        System.out.println("\n5. Item Select by ID...");
        ItemDto selected = itemService.get(101);
        System.out.println(selected);
    }
}
