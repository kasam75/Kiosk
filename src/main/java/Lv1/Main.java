package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]\n" +
                    "1" + ". ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2" + ". SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3" + ". Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "4" + ". Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0" + ". 종료      | 종료\n" + "0 <- // 0을 입력 ");
            String a1 = sc.nextLine();
            if (a1.equals("1")) {
                System.out.println("🍔👍🏼ShackBurger\n\n");
            } else if (a1.equals("2")) {
                System.out.println("🍔🍿SmokeShack\n\n");
            } else if (a1.equals("3")) {
                System.out.println("🧀🍔Cheeseburger\n\n");
            } else if (a1.equals("4")) {
                System.out.println("🍔🍠Hamburger\n\n");
            } else if (a1.equals("0")) {
                while (true) {
                    System.out.println("영수증이 필요하시다면 1번을 눌러 주세요");
                    System.out.println("번호표만 필요하시다면 2번을 눌러 주세요");
                    String a2 = sc.nextLine();
                    if (a2.equals("1")) {
                        System.out.println("영수증이 출력 됩니다.");
                    }
                    //영수증은 라이브러리 저장해놓고 주문 시킨 메뉴마다 같이 불러오는 식으로 해볼 예정+로 주문번호도 같이 출력
                    else if (a2.equals("2")) {
                        System.out.println("주문번호 몇번입니다.");
                        // 주문번호는 여기 데이터를 라이브러리에 쏴주고 add로 기입되면 그 번호만큼 카운트 되는 형식으로 해볼 예정
                        // 이건 영수증과같이 불러와야 하니 주의
                    } else {
                        System.out.println("\n없는 번호입니다 번호를 확인해 주세요\n");
                        continue;
                    }
                    break;
                }
                //구동하면 맨위로감 바로 위에 if로 가고싶은데... 검색해봐야겠다
                System.out.println("\n감사합니다.\n다음에 또 오세요");

                break;

            } else {
                System.out.println("없는 번호입니다 번호를 확인해 주세요");
                continue;
            }
        }
    }
}
//            else if {
//                (a1.equals("0"));
//




