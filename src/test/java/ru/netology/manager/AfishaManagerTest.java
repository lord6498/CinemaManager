package ru.netology.manager;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.CinemaItem;

import java.lang.reflect.Array;
import java.util.Objects;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {

    AfishaRepository repo = new AfishaRepository();
    //@Mock
    //@InjectMocks
    CinemaItem item1 = new CinemaItem(1, "King Arthur",65);
    CinemaItem item2 = new CinemaItem(2, "King Arthur 2",65);
    CinemaItem item3 = new CinemaItem(3, "Game of Thrones",65);


    @Test
    public void CurrentArrayEqualsNeededArray() { // проверяем количество выводимых строк из массива в репозитории с фильмами
        AfishaManager afisha = new AfishaManager(new AfishaRepository(), 9);
        CinemaItem[] returned = new CinemaItem[]{item1,item2,item3};
        afisha.addFilms(item1);
        afisha.addFilms(item2);
        afisha.addFilms(item3);
        AfishaRepository repo = afisha.getRepository(); // присваиваем текущий репозиторий сервису repo
        Assertions.assertArrayEquals(returned, repo.findAll());
    }

}
