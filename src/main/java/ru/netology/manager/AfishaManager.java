package ru.netology.manager;

import lombok.*;

@Data
public class AfishaManager {

    String[] items = new String[0]; // Массив с фильмами
    int showCount; // Колчиество выводимого добра

    // создание массивва

    public void addToAfishaArray(String id, String name) { // создание массива с фильмами
        int length = items.length + 1;
        String[] tmp = new String[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = id + "|" + name;
        items = tmp;

    }

    public String[] afishaShow(int count) {

        if (count > items.length || count < 1) {
            setShowCount(items.length);
        } else {
            setShowCount(count);
        }


        String[] result = new String[getShowCount()];
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
