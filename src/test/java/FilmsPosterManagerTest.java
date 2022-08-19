import org.junit.jupiter.api.Assertions;

public class FilmsPosterManagerTest {
    Films item1 = new Films("Дорога домой");
    Films item2 = new Films("Зов предков");
    Films item3 = new Films("Ной");
    Films item4 = new Films("Бладшот");
    Films item5 = new Films("Вперед");
    Films item6 = new Films("Отель 'Белград'");
    Films item7 = new Films("Джентельмены");
    Films item8 = new Films("Человек-невидимка");
    Films item9 = new Films("Тролли.Мировой тур");
    Films item10 = new Films("Номер один");
    Films item11 = new Films("Эмма");

    FilmsPosterManager repo = new FilmsPosterManager();

    @org.junit.jupiter.api.Test
    public void createdArrayHasNoValues() {
        Films[] actual = repo.getFilms();

        Assertions.assertEquals(0, actual.length);
    }

    @org.junit.jupiter.api.Test
    public void createdManagerDoesNotContainFilms() {
        Films[] expected = { };
        Films[] actual = repo.getFilms();

        Assertions.assertArrayEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    public void checkAddingFilms() {
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        Films[] expected = {item1, item2, item3};
        Films[] actual = repo.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findAllWithOneFilms() {
        repo.add(item1);
        Films[] expected = {item1};
        Films[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findAll() {
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        Films[] expected = {item1, item2, item3};
        Films[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findLastWithoutParameters() {
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);
        repo.add(item8);
        repo.add(item9);
        repo.add(item10);
        repo.add(item11);

        Films[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        Films[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findLastWithParameters() {
        FilmsPosterManager repo = new FilmsPosterManager(2);
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);

        Films[] expected = {item6, item5};
        Films[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findLastWithOneFilms() {
        FilmsPosterManager repo = new FilmsPosterManager(3);
        repo.add(item1);

        Films[] expected = {item1};
        Films[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findLastWithOneFilmsWithoutParameters() {
        repo.add(item1);

        Films[] expected = {item1};
        Films[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

