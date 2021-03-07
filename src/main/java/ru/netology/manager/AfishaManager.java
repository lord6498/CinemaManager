package ru.netology.manager;

import lombok.*;
import ru.netology.domain.CinemaItem;

@Data
public class AfishaManager {

    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository){
        this.repository = repository;
    }


    public void addFilms(CinemaItem item) { // Добавление эелементов
        repository.addToAfishaArray(item);
    }

    public CinemaItem[] getAll() { // вывод всех фильмов
        CinemaItem[] items = repository.findall();
        CinemaItem[] result = new CinemaItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];

        }
        return result;
    }
}
