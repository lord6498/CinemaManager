package ru.netology.manager;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.domain.CinemaItem;


class AfishaManagerTest {

    private AfishaManager afisha = new AfishaManager();
    CinemaItem item1 = new CinemaItem(1, "King Arthur",65);
    CinemaItem item2 = new CinemaItem(2, "King Arthur 2",65);
    CinemaItem item3 = new CinemaItem(3, "Game of Thrones",65);
    CinemaItem item4 = new CinemaItem(4, "The Witcher",65);
    CinemaItem item5 = new CinemaItem(4, "The Witcher 2",65);
    CinemaItem item6 = new CinemaItem(5, "Shreck",65);
    CinemaItem item7 = new CinemaItem(6, "Warcraft",65);
    CinemaItem item8 = new CinemaItem(7, "Elysium",65);
    CinemaItem item9 = new CinemaItem(8, "Mine story",65);
    CinemaItem item10 = new CinemaItem(9, "King Arthur 3",65);

    @BeforeEach
    public void setUp(){
        afisha.addToAfishaArray(item1);
        afisha.addToAfishaArray(item2);
        afisha.addToAfishaArray(item3);
        afisha.addToAfishaArray(item4);
        afisha.addToAfishaArray(item5);
        afisha.addToAfishaArray(item6);
        afisha.addToAfishaArray(item7);
        afisha.addToAfishaArray(item8);
        afisha.addToAfishaArray(item9);
        afisha.addToAfishaArray(item10);

    }

    @Test
    public void AddAfishaArrayCount() { // проверяем количество выводимых строк с фильмами

        int expected;

        expected = 5;
        CinemaItem[] actual = afisha.afishaShow(5); //проверка длины массива, который выводится. должен соответстовать числу Count
        Assertions.assertEquals(expected, actual.length);

        actual = afisha.afishaShow(0); //Если выводишь 0, то вывести все
        expected = 10;
        Assertions.assertEquals(expected, actual.length);

        actual = afisha.afishaShow(11); //если ыводишь больше имеющегося, то выводишь весь остаток
        expected = 10;
        Assertions.assertEquals(expected, actual.length);


    }

}