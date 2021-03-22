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
    AfishaManager afisha = new AfishaManager(new AfishaRepository(), 9);

    CinemaItem item1 = new CinemaItem(1, "King Arthur", 65);
    CinemaItem item2 = new CinemaItem(2, "King Arthur 2", 65);
    CinemaItem item3 = new CinemaItem(3, "Game of Games", 65);
    CinemaItem item4 = new CinemaItem(4, "Game of Thrones", 65);
    CinemaItem item5 = new CinemaItem(5, "Game of Thrones 2", 65);
    CinemaItem item6 = new CinemaItem(6, "Withcer", 65);
    CinemaItem item7 = new CinemaItem(7, "Aegis", 65);
    CinemaItem item8 = new CinemaItem(8, "Kingdom", 65);
    CinemaItem item9 = new CinemaItem(9, "The Expanse", 65);
    CinemaItem item10 = new CinemaItem(10, "The Expanse s5", 65);

    @BeforeEach
    public void setUp() {

        afisha.addFilms(item1);
        afisha.addFilms(item2);
        afisha.addFilms(item3);
        afisha.addFilms(item4);
        afisha.addFilms(item5);
        afisha.addFilms(item6);
        afisha.addFilms(item7);
        afisha.addFilms(item8);
        afisha.addFilms(item9);
        afisha.addFilms(item10);
    }


    @Test
    public void currentArrayEqualsNeededArray() { // проверяем количество выводимых строк из массива в репозитории с фильмами

        CinemaItem[] returned = new CinemaItem[]{item3, item2, item1};
        Assertions.assertArrayEquals(returned, afisha.getAll());
    }

    @Test
    public void deleteFromArray() {

        afisha.remove(2);

        CinemaItem[] actual = afisha.getAll();
        CinemaItem[] expected = new CinemaItem[]{item10,item9,item8,item7,item6,item5,item4,item3, item1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findByIdinRepo() {
        AfishaRepository repo = afisha.getRepository(); // присваиваем текущий репозиторий сервису repo
        int idToFind = 2;

        Assertions.assertEquals(item2, repo.findById(idToFind));

    }

}
