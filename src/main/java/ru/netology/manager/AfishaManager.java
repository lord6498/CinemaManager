package ru.netology.manager;

import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class AfishaManager {

    @NonNull
    int id;
    @NonNull
    String name;
    @NonNull
    String genre;
    @NonNull
    int price;
    AfishaManager[] items = new AfishaManager[0];
    int showCount;

    // создание массивва

    public void addToAfishaArray(AfishaManager item) { // создание массива с фильмами
        int length = items.length+1;
        AfishaManager[] tmp = new AfishaManager[length];
        System.arraycopy(items,0,tmp,0,items.length);
        int lastIndex = tmp.length-1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    public AfishaManager[] afishaShow(int count){

        if (count > items.length || count < 1){
            setShowCount(items.length);
        }
        else {
            setShowCount(count);
        }


        AfishaManager[] result = new AfishaManager[getShowCount()];
        for (int i = 0; i < getShowCount(); i++){
            int index = items.length-i-1;
            result[i] = items [index];

        }

        for (int i = 0; i < getShowCount(); i++){
            System.out.println(result[i]);
        }

        return result;

    }

}
