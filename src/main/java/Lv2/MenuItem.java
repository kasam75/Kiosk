package Lv2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    List<MenuList> menu1;

    MenuItem() {

        menu1 = new ArrayList<>(List.of(
                new MenuList(1, "ShackBurger", 6.9, "토마토,양상추,쉑소스가 토핑된 치즈버거"),
                new MenuList(2, "SmokeShack", 8.9, "베이컨,체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuList(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuList(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ));
    }
}
//키오스크로 와일 같은걸 다넘기기
//리스트 선언 및 초기화 는 남아있음