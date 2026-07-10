package order_report;

public class Main{
    static void main(String[] args) {

        int stock = 5;
        int order = 0;

        while(order < 10){
            --stock;
            order++;
            if(stock >= 1){
                System.out.println(order +"번 주문성공, 남은재고: "+ stock);
            }
            else {
                System.out.println(order +"번 주문실패, 재고 없음");
            }
        }
    }
}