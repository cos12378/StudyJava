package controller;

import service.Service;

import java.util.Scanner;

public class Controller {

    private final Scanner sc;
    private final Service service; //하나만 만들때(자원적으로 이득임)
    public Controller(Scanner sc) {
        this.sc = sc;
        this.service = Service.getInstance();
    }
    /**
     * 기능: 모드를 찾아 검색한다
     * @param
     * @return None
     */


    public void selectMode() {
        int mod;
        try {
            mod = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            mod = 0;
        }

        if (mod == 1) {

//            TODO : insert 기능 만들것
            service.insert(sc.nextInt());
        }else if(mod ==2) {
//            TODO : 전체 찾기 기능 만들것
            service.insert(sc.nextInt());
        }
        else if(mod ==3) {
//            TODO : 인덱스 입력받아 찾는것
            service.insert(sc.nextInt());
        }
        else {
//            TODO : selectMode 다시 실행
        }
    }
}