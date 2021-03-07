package ru.netology.manager;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.CinemaItem;

import java.lang.reflect.Array;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager afisha;
    CinemaItem item1 = new CinemaItem(1, "King Arthur",65);
    CinemaItem item2 = new CinemaItem(2, "King Arthur 2",65);
    CinemaItem item3 = new CinemaItem(3, "Game of Thrones",65);


    @Test
    public void AddAfishaArrayCount() { // проверяем количество выводимых строк с фильмами
        CinemaItem[] returned = new CinemaItem[]{item1,item2,item3};

        afisha.addFilms(item1);

        Assertions.assertArrayEquals(returned, repository.findall());



    }

}
