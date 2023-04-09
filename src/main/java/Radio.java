public class Radio {

        private int currentRadioStation;
        private int maxRadioStation = 9;
        private int minRadioStation = 0;
        private int currentSoundVolume;
        private int maxSoundVolume = 10;
        private int minSoundVolume = 0;

        public Radio() {
            currentRadioStation = 0;
            currentSoundVolume = 0;
        }

        public int getCurrentRadioStation() {
            return currentRadioStation;
        }

        public int getCurrentSoundVolume() {
            return currentSoundVolume;
        }


        public void setCurrentRadioStation(int newCurrentRadioStation) {
            if (newCurrentRadioStation < 0) {
                newCurrentRadioStation = 0;
            }
            if (newCurrentRadioStation > 9) {
                newCurrentRadioStation = 9;
            }
            currentRadioStation = newCurrentRadioStation;
        }

        public void setCurrentSoundVolume(int newCurrentSoundVolume) {
            if (newCurrentSoundVolume < 0) {
                newCurrentSoundVolume = 0;
            }
            if (newCurrentSoundVolume > 10) {
                return;
            }
            currentSoundVolume = newCurrentSoundVolume;
        }

        public void nextRadioStation() {
            if (currentRadioStation < maxRadioStation) {
                currentRadioStation = currentRadioStation + 1;
            } else {
                currentRadioStation = 0;
            }
        }

        public void preRadioStation() {
            if (currentRadioStation > minRadioStation) {
                currentRadioStation = currentRadioStation - 1;
            } else {
                currentRadioStation = 0;
            }
        }

        public void increaseSoundVolume() {
            if (currentSoundVolume < 10) {
                currentSoundVolume = currentSoundVolume + 1;
            }
        }

        public void lowSoundVolume() {
            if (currentSoundVolume > 0) {
                currentSoundVolume = currentSoundVolume - 1;
            }
        }

    }
