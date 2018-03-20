package pattern.singleton;

public class Preferences {

//    make it private with only a getter so this singleton can't be changed
//    static so we don't need to initialize the class
    private static Preferences instance = null;

//    protected/private so only this class or its instances can create new, not from outside
    private Preferences() {
    }

    private synchronized static void createInstance(){
        if (instance == null) { instance = new Preferences(); }
    }

    public static Preferences getInstance() {
        if (instance == null) { createInstance(); }
        return instance;
    }

    @Override
    public String toString() {
        return "Preferences{} singleton";
    }
}
