package sk.kosickaakademia.kincel.chat.out;

import sk.kosickaakademia.kincel.chat.entity.Message;

import java.util.List;

public class Output {
    public void printMyMessages(List<Message> list){
        System.out.println("New messages: ");
        for(Message ms : list){
            System.out.println(" from: " + ms.getUser() +": \""+ms.getTextMessage()+"\" "+ ms.getDate() );
        }
    }
}
