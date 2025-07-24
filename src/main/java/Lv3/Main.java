package Lv3;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//메인할일 1번 햄버거 정보가 담긴 메뉴아이탬 만들기
        List<MenuItem> hamburger = new ArrayList<>();

        hamburger.add(new MenuItem(1, "ShackBurger", 6.9, "토마토,양상추,쉑소스가 토핑된 치즈버거"));
        hamburger.add(new MenuItem(2, "SmokeShack", 8.9, "베이컨,체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        hamburger.add(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        hamburger.add(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        Menu burgerMenu = new Menu(hamburger, "Burger");

        //2번 메뉴객체만들기(햄버거매뉴객체)o

        //메뉴객체에 카테고리에 스트링 카테고리 만들기 메뉴아이탬 리스트도  필드선언(7번째 줄임)o

        //3번 1번에서 만든 햄버거 매뉴 아이탬 리스트를 2번에서 만든 메뉴객체의 햄버거 매뉴 아이탬 리스트에 넣기o
        //반복 디저트와 음료 나중


//투스탭
        List<Menu> menuList = new ArrayList<>();
        menuList.add(burgerMenu);

        /*1번 메뉴리스트 변수선언
        스텝1에서 만든 메뉴객체 3개 넣어주기
        2번 키오스크 객체 생성하면서 생성자에 1번에서 만든 메뉴리스트 넣어주기
        3번 키오스크에 스타트 메서드 실행
        */
        Kiosk kiosk = new Kiosk(menuList,burgerMenu);
        kiosk.start();



    }
}
//알고리즘과 웹서킷 https://www.acmicpc.net/ 백준과 https://leetcode.com/리트코드