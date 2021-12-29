package day44_oopreview.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable {


    @Override
    public void sendMessage(String msg) {
        System.out.println("Whatsapp - sending a message - " + msg + " ...");

    }

    @Override
    public void videoCall() {
        System.out.println("Whatsapp doing a video call Mr mike..");
    }

    @Override
    public void call(String contact) {
        System.out.println("Whatsapp calling " + contact + "...");


    }
}
