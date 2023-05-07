public class Radio {

    private int currentRadioStation = 0;
    private int maxRadioStation = 9;
    private final int minRadioStation = 0;
    private int currentSoundVolume = 0;
    private final int maxSoundVolume = 100;
    private final int minSoundVolume = 0;

    public Radio() {
    }

    public Radio(int countRadioStation) {
        maxRadioStation = countRadioStation - 1;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            newCurrentRadioStation = minRadioStation;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = maxRadioStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minSoundVolume) {
            newCurrentSoundVolume = minSoundVolume;
        }
        if (newCurrentSoundVolume > maxSoundVolume) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void preRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void lowSoundVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

}
