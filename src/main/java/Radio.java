public class Radio {
    private int currentRadioStation;

    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVoiume = 0;
    private int maxVoiume = 100;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextNumber() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevNumber() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVoiume) {
            newCurrentVolume = minVoiume;
        }
        if (newCurrentVolume > maxVoiume) {
            newCurrentVolume = maxVoiume;
        }
        currentVolume = newCurrentVolume;
    }

    public void augmentVolume() {
        if (currentVolume < maxVoiume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decrementVolume() {
        if (currentVolume > minVoiume) {
            currentVolume = (currentVolume - 1);
        }
    }
}
