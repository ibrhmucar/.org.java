package day44_oopreview.callcenter;

public interface VoiceCallable {

    boolean CAN_CALL= true;

    void call(String contact);

    public static void decline(){
        System.out.println("Mike declined voice call...");
    }

    public default void accept(){
        System.out.println("Mike finally accepted voice call..");
    }



}
