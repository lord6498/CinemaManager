package ru.netology.manager;

import lombok.*;
import ru.netology.domain.CinemaItem;

@Data
public class AfishaManager {

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

    }

    public CinemaItem[] afishaShow(int count) {

        if (count > items.length || count < 1) {
            setShowCount(items.length);
        } else {
            setShowCount(count);
        }


        CinemaItem[] result = new CinemaItem[getShowCount()];
        for (int i = 0; i < getShowCount(); i++) {
            int index = items.length - i - 1;
            result[i] = items[index];

        }

        for (int i = 0; i < getShowCount(); i++) {
            System.out.println(result[i]);
        }

        return result;

    }

}
