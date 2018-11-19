//package independentWork.ardas.task1;
//
//import java.util.logging.Logger;
//
//public class MessageBuilderImpl implements MessageBuilder {
//    private static final Logger LOG = Logger.getLogger(String.valueOf(MessageBuilderImpl.class));
//
//    @Override
//    public Message buildMessage(int currentTime) {
//        if ((currentTime >= 6) && (currentTime < 9)) {
//            return new MorningMessage();
//        } else if ((currentTime >= 9) && (currentTime < 19)) {
//            return new DayMessage();
//        } else if ((currentTime >= 19) && (currentTime < 23)) {
//            return new EveningMessage();
//        } else if ((currentTime == 23) || ((currentTime < 6) && (currentTime >= 0))) {
//            return new NightMessage();
//        } else {
//            // we user warning (not error) cause its user error, not system fail
//            LOG.warning("invalid time " + currentTime + ", app wont crash");
//            return null;
//        }
//    }
//}
