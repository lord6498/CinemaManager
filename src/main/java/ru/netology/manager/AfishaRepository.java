package ru.netology.manager;

import lombok.*;
import ru.netology.domain.CinemaItem;


public class AfishaRepository {

    CinemaItem[] items = new CinemaItem[0]; // Массив с фильмами
    int showCount; // Колчиество выводимого добра

    // создание массивва

    public void addToAfishaArray(CinemaItem item) { // создание массива с фильмами
        int length = items.length + 1;
        CinemaItem[] tmp = new CinemaItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
        System.out.println(items);


    }



    public CinemaItem[] findall(){
        return items;
    }

}