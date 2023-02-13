public class Action {

    private final String name;
    private Method method;
    private char hotkey;

    public char getHotkey() {
        return hotkey;
    }
    public void setHotkey(char hotkey) {
        this.hotkey = hotkey;
    }
    private Enemy kwargs;

    public Enemy getKwargs() {
        return kwargs;
    }
    public void setKwargs() {
        this.kwargs = kwargs;
    }

    public Action(Method method, String name, char hotkey, Enemy kwargs) {
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;
    }

    public String str() {
        return hotkey + ": " + name;
    }
}
