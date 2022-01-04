package day44_oopreview.callcenter;

public class CallCnter {
    public static void main(String[] args) {

        WhatsApp wa = new WhatsApp();

        wa.launch();
        wa.allOSCompatible=true;
        wa.isFree=true;
        wa.name="What App";
        wa.call("Ozzy");
        wa.sendMessage("Thank You");
        wa.videoCall();
        wa.accept();

        VoiceCallable.decline();
        System.out.println(VoiceCallable.CAN_CALL);

        System.out.println(wa.getCount());
        wa.setCount(4);
        System.out.println(wa.getCount());

        System.out.println("=======================");


        VoiceCallable obj = new WhatsApp();
       /* MessagingApp obj2 = (MessagingApp) obj;
        obj2.launch();*/
        ((WhatsApp)obj).launch();

        ((MessagingApp)obj).allOSCompatible=false;
        obj.call("Mr Tom");

        ((WhatsApp)obj).videoCall();

        ((VideoCallable)obj).videoCall();


    }
}
