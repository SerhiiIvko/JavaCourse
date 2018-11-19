//package independentWork.ardas.task1;
//
//import java.util.Locale;
//import java.util.ResourceBundle;
//
//public abstract class Message {
//    private static final String MESSAGE_RESOURCE = "messages";
//    private static final String WORLD_RESOURCE = "world_message";
//    private static final String DELIMITER_RESOURCE = "delimiter";
//    private static final String END_OF_MESSAGE_RESOURCE = "end_message";
//
//    String getWelcomeMessage(){
//        return ResourceBundle.getBundle(MESSAGE_RESOURCE, Locale.getDefault()).getString(getWorldResource()) +
//                DELIMITER_RESOURCE +
//                ResourceBundle.getBundle(MESSAGE_RESOURCE, Locale.getDefault()).getString(WORLD_RESOURCE) +
//                ResourceBundle.getBundle(MESSAGE_RESOURCE, Locale.getDefault()).getString(END_OF_MESSAGE_RESOURCE);
//    }
//
//    abstract String getWorldResource();
//
//    public void printMessage(){
//        System.out.println(getWelcomeMessage());
//    }
//}