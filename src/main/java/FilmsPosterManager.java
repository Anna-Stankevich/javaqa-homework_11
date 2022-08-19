public class FilmsPosterManager {
    private int lastCount;
    //Создается класс в нем есть поля. Поле lastCount - пока пустое. Поле Films[] AllFilmsPoster - создает пустой массив.
    private Films[] AllFilmsPoster = new Films[0];

    public FilmsPosterManager(){

        this.lastCount = 10;
    }
    public FilmsPosterManager(int lastCount){
        this.lastCount = lastCount;
    }

    public void add(Films film) {
        Films[] NewFilmForPoster = new Films[AllFilmsPoster.length + 1];
        for (int i = 0; i < AllFilmsPoster.length; i++) {
            NewFilmForPoster[i] = AllFilmsPoster[i];
        }
        NewFilmForPoster[NewFilmForPoster.length - 1] = film;
        AllFilmsPoster = NewFilmForPoster;
    }
    public Films[] getFilms() {

        return AllFilmsPoster;
    }
    public Films[] findAll(){

        return this.getFilms();
    }

    public Films[] findLast() {
        Films[] all = getFilms();
        int arrLength = Math.min(lastCount, all.length);
        Films[] reversed = new Films[arrLength];
        for (int i = 0; i < arrLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }


}
