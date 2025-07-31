// Liskov Principle Implementation

public class Notification{
    public void sendNotification(){
        System.out.println("Notification send.");
    }
}

class TextNotification extends Notification{
    public void sendNotification(){
        System.out.println("Text notification send.");
    }
}

class Main{
    public static void main(String args[]){
        Notification not = new TextNotification();
        not.sendNotification();
    }
}