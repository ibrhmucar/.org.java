package day44_oopreview.callcenter;

public abstract class MessagingApp {

    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private static int count;
    public static final String APP_TYPE = "Messanger";

    public  int getCount() {
        return count;
    }

    public  void setCount(int count) {
        MessagingApp.count = count;
    }

    public MessagingApp() {
        System.out.println("MessagingApp no-arg constructor...");
    }

    public MessagingApp(String name) {
        this.name = name;

    }

    public abstract void sendMessage(String msg);

    public void launch(){}

    public static void close(){}





}
