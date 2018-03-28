package classworks.mar222018.homework.task2;

public class Aircompany {
    private Aircraft[] aircrafts;

    public Aircompany(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    String printAircraftsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Aircraft aircraft : aircrafts) {
            stringBuilder = stringBuilder.append(aircraft.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    private Aircraft getMinConsume(Aircraft[] aircrafts) {
        Aircraft minConsumer = aircrafts[0];
        for (int i = 0; i < aircrafts.length; i++) {
            Aircraft aircraft = aircrafts[i];
            if (aircraft.getConsumer() < minConsumer.getConsumer()) {
                minConsumer = aircraft;
            }
        }
        return minConsumer;
    }

    private Aircraft getMaxConsume(Aircraft[] aircrafts) {
        Aircraft maxConsumer = aircrafts[0];
        for (int i = 0; i < aircrafts.length; i++) {
            Aircraft aircraft = aircrafts[i];
            if (aircraft.getConsumer() < maxConsumer.getConsumer()) {
                maxConsumer = aircraft;
            }
        }
        return maxConsumer;
    }


    public double getAverageBaggageVolume() {
        double averageVolume = 0;
        for (int i = 0; i < aircrafts.length; i++) {
            averageVolume += aircrafts[i].getValueBaggage();
        }
        return averageVolume / aircrafts.length;
    }

    public double getAveragePassengerCount() {
        double averagePlacesCount = 0;
        for (int i = 0; i < aircrafts.length; i++) {
            averagePlacesCount += aircrafts[i].getCountPassengers();
        }
        return (int) averagePlacesCount / aircrafts.length;
    }

    public void findPlaneByConsumer(Aircraft[] aircrafts, double startRangeConsum, double endRangeConsume) {
        System.out.println("Aircraft in the company, corresponding to the given " +
                "range of fuel consumption parameters: ");
        for (int i = 0; i < aircrafts.length; i++) {
            if ((startRangeConsum < getMinConsume(aircrafts).getConsumer() || endRangeConsume < getMinConsume(aircrafts).getConsumer()) ||
                    (startRangeConsum > getMaxConsume(aircrafts).getConsumer() || endRangeConsume > getMaxConsume(aircrafts).getConsumer())) {
                System.out.println("No aircraft found for this parameters!");
                return;
            } else if (aircrafts[i].getConsumer() >= startRangeConsum && aircrafts[i].getConsumer() <= endRangeConsume) {
                System.out.println(aircrafts[i]);
            }
        }
    }
}