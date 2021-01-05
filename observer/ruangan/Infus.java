import java.util.*;
public class Infus implements Subject {
    private ArrayList<Observer> observers;
    private String datapasien;
   

    public Infus() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(datapasien);
        }
    }

    public void datapasienChanged() {
        notifyObservers();
    }

    public void setDatapasien(String datapasien) {
        this.datapasien = datapasien;
        datapasienChanged();
    }

    public String getDatapasien() {
        return datapasien;
    }

}
