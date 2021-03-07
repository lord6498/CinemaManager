package ru.netology.manager;

import lombok.*;
import ru.netology.domain.CinemaItem;

@Data
public class AfishaManager {
    

    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository){
        this.repository = repository;
    }

    public AfishaManager() {

    }


    public void addFilms(CinemaItem item) { // Добавление эелементов
        System.out.println(item);
        repository.addToAfishaArray(item);
    }

    public CinemaItem[] getAll() { // вывод всех фильмов
        CinemaItem[] items = repository.items;
        items = repository.findall();
        System.out.println(items);
        
        if (items != null){
            CinemaItem[] result = new CinemaItem[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
        }
            return result;
        }
        else {

            System.out.println("Где-то случился нуль");
            return items;

        }

        
    }
}
