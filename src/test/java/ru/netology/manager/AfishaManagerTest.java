package ru.netology.manager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class AfishaManagerTest {

    @Test

    public void AddAfishaArrayCount() { // проверяем количество выводимых строк с фильмами
        AfishaManager afisha = new AfishaManager();
        AfishaManager item1 = new AfishaManager(1, "King Arthur", "Epic", 99);
        AfishaManager item2 = new AfishaManager(2, "G.Joe", "Epic", 128);
        AfishaManager item3 = new AfishaManager(3, "Rope", "Tragedy", 99);
        AfishaManager item4 = new AfishaManager(4, "Rasamen", "Epic", 99);
        AfishaManager item5 = new AfishaManager(5, "Hobbit", "Epic", 99);
        AfishaManager item6 = new AfishaManager(6, "Lord of the Rings", "Epic", 99);
        AfishaManager item7 = new AfishaManager(7, "Elon Musk", "Epic", 99);
        AfishaManager item8 = new AfishaManager(8, "Billy", "Epic", 99);
        AfishaManager item9 = new AfishaManager(9, "Fullmetal", "Epic", 99);
        AfishaManager item10 = new AfishaManager(10, "Major Pain", "Epic", 99);
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

        int expected;

        expected = 5;
        AfishaManager[] actual = afisha.afishaShow(5); //проверка длины массива, который выводится. должен соответстовать числу Count
        Assertions.assertEquals(expected, actual.length);

        actual = afisha.afishaShow(0); //Если выводишь 0, то вывести все
        expected = 10;
        Assertions.assertEquals(expected, actual.length);

        actual = afisha.afishaShow(11); //если ыводишь больше имеющегося, то выводишь весь остаток
        expected = 10;
        Assertions.assertEquals(expected, actual.length);


    }

}