package Lv3;


import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> menuList;
    Menu m1;
    Scanner sc = new Scanner(System.in);

    public Kiosk(List<Menu> menuList, Menu m1) {
        this.menuList = menuList;
        this.m1 = m1;
    }

    public void start() {
        while (true) {
            for (Menu menu : menuList) {
                System.out.println(menu.name + "메뉴를 선택해 주세요");
                System.out.println("[ SHAKE SHACK MENU ]\n" +
                        "1" + ". ShackBurger   | W 6.9 | 토마토,  양상추,  쉑소스가 토핑된 치즈버거\n" +
                        "2" + ". SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                        "3" + ". Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                        "4" + ". Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                        "0" + ". 종료      | 종료\n" + "0 <- // 0을 입력 ");
            }
            String n1 = sc.nextLine();

            if (n1.equals("1")) {
                List<MenuItem> menu1 = m1.burger;

                for (MenuItem ml1 : menu1) {
                    if (ml1.Num == 1) {
                        System.out.print("\n 번호" + "  " + ml1.Num + "  ");
                        System.out.print(" 메뉴" + "  " + ml1.Name + "  ");
                        System.out.print(" 가격" + "  " + ml1.Price + "  ");
                        System.out.println(" 제료 " + "  " + ml1.Ingredient + "  ");
                    }
                }
            } else if (n1.equals("2")) {
                for (MenuItem ml2 : m1.burger)
                    if (ml2.Num == 2) {
                        {
                            System.out.print("번호" + "  " + ml2.Num + "  ");
                            System.out.print("메뉴" + "  " + ml2.Name + "  ");
                            System.out.print("가격" + "  " + ml2.Price + "  ");
                            System.out.println("제료" + "  " + ml2.Ingredient + "  ");
                        }
                    }
            } else if (n1.equals("3")) {
                for (MenuItem ml3 : m1.burger) {
                    if (ml3.Num == 3) {

                        System.out.print("번호" + "  " + ml3.Num + "  ");
                        System.out.print("메뉴" + "  " + ml3.Name + "  ");
                        System.out.print("가격" + "  " + ml3.Price + "  ");
                        System.out.println("제료 " + "  " + ml3.Ingredient + "  ");
                    }
                }
            } else if (n1.equals("4")) {
                for (MenuItem ml4 : m1.burger) {
                    if (ml4.Num == 4) {
                        System.out.print("번호" + "  " + ml4.Num + "  ");
                        System.out.print("메뉴" + "  " + ml4.Name + "  ");
                        System.out.print("가격" + "  " + ml4.Price + "  ");
                        System.out.println("제료 " + "  " + ml4.Ingredient + "  ");
                    }
                }
            }
            int num = sc.nextInt();
            sc.nextLine();
            if (num == (0)) {
                System.out.println("종료합니다.");
                break;
            } else if (num > m1.burger.size() || num < 0) {
                System.out.println("번호를 다시 입력 해 주세요");
            }
        }
        //순서 작성하고

    }
  /*1번 메뉴리스트 필드선언
  2번 스케너 필드선언
  3번 매뉴리스트 매개변수를 갖는 생성자 선언
  4번 생성자의 매개변수로 가져온 값을 1번 매뉴리스트에 대입(대입연산자)
  5번 스타트 메서드 선언 및 구현
  6번 1번 포문 돌려서 카테고리 하나씩 출력(출력예시 있음)
  */
}
