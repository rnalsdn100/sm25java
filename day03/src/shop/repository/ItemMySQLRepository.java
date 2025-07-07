package shop.repository;

import shop.dto.ItemDto;
import shop.frame.SmRepository;

import java.util.ArrayList;
import java.util.List;

public class ItemMySQLRepository implements SmRepository<ItemDto, Integer> {
    @Override
    public void insert(ItemDto itemDto) {
        System.out.println("MySQL: Inserted Item Table");
        System.out.println("MySQL: "+ itemDto);
    }

    @Override
    public void update(ItemDto itemDto) {
        System.out.println("MySQL: Updated Item Table");
        System.out.println("MySQL:" + itemDto);
    }

    @Override
    public void delete(Integer integer) {
        System.out.println("MySQL: Deleted Item Table");
        System.out.println("MySQL: " + integer);
    }

    @Override
    public List<ItemDto> selectAll() {
        System.out.println("MySQL: Select All Item");
        List<ItemDto> items = new ArrayList<>();
        items.add(new ItemDto(100, "사과", 1000.0));
        items.add(new ItemDto(101, "버내나", 2000.0));
        items.add(new ItemDto(102, "오렌지", 3000.0));
        return items;
    }

    @Override
    public ItemDto select(Integer integer) {
        System.out.println("MySQL: Select Item");
        ItemDto itemDto = new ItemDto(integer, "망고", 4000.0);
        return itemDto;
    }
}
