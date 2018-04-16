package classworks.april.apr032018.homeworks.task1;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TrainPark implements ITrains {

    private PassTrain[] passTrains;

    public TrainPark(PassTrain[] passTrains) {
        this.passTrains = passTrains;
    }

    public int getAllPassengerCount() {
        int count = 0;
        for (int i = 0; i < passTrains.length; i++) {
            count += (passTrains[i].getPassengersCount() * passTrains[i].getCarriageCount());
        }
        return count;
    }

    public double getAllBaggageCount() {
        double count = 0;
        for (int i = 0; i < passTrains.length; i++) {
            count = count + passTrains[i].getBaggageCount();
        }
        return count;
    }

    public List<PassTrain> filterTrainsByPassengersCount(PassTrain[] trains, int minPassengers, int maxPassengers) {
        List<PassTrain> filteredTrains = new ArrayList<>();
        for (int i = 0; i < trains.length; i++) {
            PassTrain train = trains[i];
            if (train.getPassengersCount() >= minPassengers
                    && train.getPassengersCount() <= maxPassengers) {
                filteredTrains.add(train);
            }
        }
        return filteredTrains;
    }

    String getTrainsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (PassTrain passTrain : passTrains) {
            stringBuilder = stringBuilder.append(passTrain.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    @Nullable
    public PassTrain getTrainByIndex(int index) {
        PassTrain passTrain = null;
        try {
            for (int i = 0; i < this.passTrains.length; i++) {
                if (i == index) {
                    passTrain = this.passTrains[i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("No trains for this index: " + index);
        }
        return passTrain;
    }
}