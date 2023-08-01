package baek.javaTheory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_forOrIter {
    public static void main(String[] args) {

        // 리스트 반복문

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("grape");
        fruitList.add("banana");
        fruitList.add("banana");
        fruitList.add("banana");
        fruitList.add("banana");


        // index 기반 반복문
        for(int i = 0; i < fruitList.size(); i++){
            String fruit = fruitList.get(i);
        }
        System.out.println();

        // 향상된 for 문 - foreach
        for(String fruit:fruitList){
            System.out.println(fruit);
        }
        System.out.println();


        Iterator<String> iter = fruitList.listIterator();
        while (iter.hasNext()){
            String fruit = iter.next();
            System.out.println(fruit);
        }
        System.out.println();
        System.out.println(fruitList);
    }
}
