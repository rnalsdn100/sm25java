package shop.test;

import shop.dto.CustDto;
import shop.frame.SmService;
import shop.service.CustService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application");
        SmService<CustDto, String> smService;
        smService = new CustService();
        System.out.println("1. CUST Register");
        CustDto custDto = new CustDto("id01", "pwd01", "이말숙");
        smService.register(custDto);

        System.out.println("2. CUST getALL......");
        List<CustDto> custs = null;
        custs =smService.get();
        for (CustDto cust : custs) {
            System.out.println(cust);
        }
        System.out.println("3. CUST Delete...");
        String id = "id08";
        smService.remove(id);

        System.out.println("4. CUST Select...");
        String id2 = "id01";
        CustDto myInfo = null;
        myInfo = smService.get(id2);
        System.out.println(myInfo);

        System.out.println("5. CUST Update...");
        CustDto uCust = new CustDto("id01", "pwd01", "홍말숙");
        smService.modify(uCust);



        System.out.println("End Main Application");
    }
}
