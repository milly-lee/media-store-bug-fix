package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.rating = rating;
        this.title = title;
        this.id = UUID.randomUUID();
    }

    public Movie(Movie anotherMovie) {
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Movie)) {
            return false;
        }


        Movie theOtherMovie = (Movie) obj;


        return id.equals(theOtherMovie.id);


    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setRating( String rating) {
        this.rating = rating;
    }

    public void setTitle( String title) {
        this.title = title;
    }

}
