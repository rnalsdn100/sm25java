package shop.service;

import shop.dto.ItemDto;
import shop.frame.SmRepository;
import shop.frame.SmService;
import shop.repository.ItemMySQLRepository;

import java.util.List;

public class ItemService implements SmService<ItemDto, Integer> {

    SmRepository<ItemDto, Integer> smRepository;

    public ItemService(){
        smRepository = new ItemMySQLRepository();
    }

    @Override
    public void register(ItemDto itemDto) {
        System.out.println("서비스: register item");
        smRepository.insert(itemDto);

    }

    @Override
    public void modify(ItemDto itemDto) {
        System.out.println("서비스: modify item");
        smRepository.update(itemDto);

    }

    @Override
    public void remove(Integer integer) {
        System.out.println("서비스: remove item");
        smRepository.delete(integer);

    }

    @Override
    public List<ItemDto> get() {
        System.out.println("서비스: get item");
        return smRepository.selectAll();
    }

    @Override
    public ItemDto get(Integer integer) {
        System.out.println("get item by ID");
        return smRepository.select(integer);
    }
}
