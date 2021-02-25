package ru.netology.manager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class AfishaManagerTest {

    private AfishaManager afisha = new AfishaManager();

    @Test
    public void AddAfishaArrayCount() { // проверяем количество выводимых строк с фильмами

        afisha.addToAfishaArray("1", "King Arthur");
        afisha.addToAfishaArray("2", "King Arthur2");
        afisha.addToAfishaArray("3", "Space Odyssey");
        afisha.addToAfishaArray("4", "Game of Thrones");
        afisha.addToAfishaArray("5", "Minecraft The Movie");
        afisha.addToAfishaArray("6", "Mortal Combat");
        afisha.addToAfishaArray("7", "Vikings");
        afisha.addToAfishaArray("8", "Winx saga");
        afisha.addToAfishaArray("9", "SnowPiercer");
        afisha.addToAfishaArray("10", "Vendetta");

        int expected;

        expected = 5;
        String[] actual = afisha.afishaShow(5); //проверка длины массива, который выводится. должен соответстовать числу Count
        Assertions.assertEquals(expected, actual.length);

        actual = afisha.afishaShow(0); //Если выводишь 0, то вывести все
        expected = 10;
        Assertions.assertEquals(expected, actual.length);

        actual = afisha.afishaShow(11); //если ыводишь больше имеющегося, то выводишь весь остаток
        expected = 10;
        Assertions.assertEquals(expected, actual.length);


    }

}