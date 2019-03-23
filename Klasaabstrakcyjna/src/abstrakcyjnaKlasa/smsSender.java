package abstrakcyjnaKlasa;

public class smsSender extends MessegeSender {
    @Override
    public boolean sendMessege(Message message){
        System.out.println("wysylanie wiaodmosci za pomoca sms");

    }
}
