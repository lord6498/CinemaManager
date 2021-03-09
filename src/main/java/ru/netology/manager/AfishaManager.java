package ru.netology.manager;

import lombok.*;
import ru.netology.domain.CinemaItem;

@Data
public class AfishaManager {

    private final AfishaRepository repository;
    private final int showCount;

    public AfishaManager(AfishaRepository repo, int showCount){
        this.repository = repo;
        this.showCount = showCount;
    }

    public void addFilms(CinemaItem item) { // Добавление эелементов
        System.out.println(item);
        repository.addToAfishaArray(item);
    }

    public CinemaItem[] showFilms(){
        repository.findAll();
        return new CinemaItem[0];
    }
}
