import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //불변성: 데이터는 원본을 유지하고 새로운 걸 만들어야함.
        list.add(1);
        list.add(2);
        list.add(3);
        //만약 list *2 한 데이터를 요구
        List<Integer> list2 = new ArrayList<>();
        for (int i=0; i< list.size(); i++) {
            list2.add(list.get(i)*2);
        }
        System.out.println(list);
        System.out.println(list2);
        //stream 1.8
        // 익명함수
        List<Integer> collect = list.stream().map(el ->
//            System.out.println(el); //for each 역할
//            map은 길이가 같은 리스트를 만드는것
            el * 2
        ).collect(Collectors.toList()); //Stream 타입을 List로 형태 변환 해줌
        System.out.println(collect);

        List<Integer> collect1 = list
                .stream()
                .filter(el -> el % 2 == 0)
                .map(el-> el*2)
                .collect(Collectors.toList());
        System.out.println(collect1);
    }

}
