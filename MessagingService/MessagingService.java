package MessagingService;
import java.util.ArrayList;

public class MessagingService {
    private ArrayList <Message> Messagez;
    
    public MessagingService() {
        this.Messagez = new ArrayList<>();
    }
    
    public void add(Message message) {
        String body = message.getContent();
        if (body.length() <= 280) {
            this.Messagez.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.Messagez;
    }
}
