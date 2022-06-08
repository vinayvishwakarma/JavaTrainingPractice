enum Mood {

    FUN,
    THRILLER,
    SAD,
    ROMANTIC,

}

enum FileType {

    JPEG,
    PNG,
    WAF,

}

public class FullAssociation {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Graphics graphics = new Graphics("Character", 100, FileType.JPEG);
        StoryLine storyLine = new StoryLine("this is a great Story", Mood.FUN);


        AnimationMovie animationMovie = new AnimationMovie(2000, "Vinay", "Nandish", graphics, storyLine);


        Anime anime = animationMovie.makeAnimation(graphics, storyLine, "The Human", "30min", "600X800", 100);

        System.out.println(graphics);
        System.out.println(storyLine);
        System.out.println(animationMovie);
        System.out.println(anime);
        anime.play();

    }

}

class Movie {

    int budget;
    String producer;
    String director;

    public Movie(int budget, String producer, String director) {
        this.budget = budget;
        this.producer = producer;
        this.director = director;
    }

}

class AnimationMovie extends Movie {// isA

    Graphics graphics;
    StoryLine storyLine;

    public Anime makeAnimation(Graphics graphics, StoryLine storyLine, String name, String duration, String resolution, int size) {

        return new Anime(name, duration, size, resolution); // useA and ProdueA

    }

    public AnimationMovie(int budget, String producer, String director, Graphics graphics, StoryLine storyLine) {
        super(budget, producer, director);
        this.graphics = graphics;
        this.storyLine = storyLine;
    }

}

class Graphics {

    String imgName;
    int size;
    FileType fileTyle;

    public Graphics(String imgName, int size, FileType fileTyle) {
        this.imgName = imgName;
        this.size = size;
        this.fileTyle = fileTyle;
    }

}

class StoryLine {

    String story;
    Mood mood;

    public StoryLine(String story, Mood mood) {
        this.story = story;
        this.mood = mood;
    }

}

class Anime {

    String name;
    String duration;
    int size;
    String resolution;

    public Anime(String name, String duration, int size, String resolution) {
        this.name = name;
        this.duration = duration;
        this.size = size;
        this.resolution = resolution;

    }

    public void play() {

        System.out.println(this.name + " is playing");
        System.out.println("Duration is " + this.duration);
    }

}