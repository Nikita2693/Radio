import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


    public class RadioTest {
        @Test
        public void shouldSetRadioStation() {
            Radio station = new Radio();
            station.setCurrentRadioStation(8);
            int expected = 8;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetRadioStationMax() {
            Radio station = new Radio();
            station.setCurrentRadioStation(9);
            int expected = 9;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetRadioStationMin() {
            Radio station = new Radio();
            station.setCurrentRadioStation(0);
            int expected = 0;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void shouldNotSetRadioStationAboveMax() {
            Radio station = new Radio();
            station.setCurrentRadioStation(10);
            int expected = 9;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void shouldNotSetRadioStationAboveMin() {
            Radio station = new Radio();
            station.setCurrentRadioStation(-1);
            int expected = 0;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void turnToNextRadioStation() {
            Radio station = new Radio();
            station.setCurrentRadioStation(5);
            station.nextRadioStation();
            int expected = 6;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToNextRadioStationBeforeMax() {
            Radio station = new Radio();
            station.setCurrentRadioStation(8);
            station.nextRadioStation();
            int expected = 9;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToNextRadioStationAboveMax() {
            Radio station = new Radio();
            station.setCurrentRadioStation(10);
            station.nextRadioStation();
            int expected = 0;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToNextRadioStationMin() {
            Radio station = new Radio();
            station.setCurrentRadioStation(0);
            station.nextRadioStation();
            int expected = 1;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToNextRadioStationAfterMin() {
            Radio station = new Radio();
            station.setCurrentRadioStation(1);
            station.nextRadioStation();
            int expected = 2;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToPreRadioStation() {
            Radio station = new Radio();
            station.setCurrentRadioStation(5);
            station.preRadioStation();
            int expected = 4;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToPreRadioStationAboveMax() {
            Radio station = new Radio();
            station.setCurrentRadioStation(10);
            station.preRadioStation();
            int expected = 8;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToPreRadioStationMin() {
            Radio station = new Radio();
            station.setCurrentRadioStation(0);
            station.preRadioStation();
            int expected = 0;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void turnToPreRadioStationAfterMin() {
            Radio station = new Radio();
            station.setCurrentRadioStation(1);
            station.preRadioStation();
            int expected = 0;
            int actual = station.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetSoundVolume() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(9);
            int expected = 9;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetSoundVolumeMax() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(10);
            int expected = 10;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void lowSoundVolume() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(5);
            volume.lowSoundVolume();
            int expected = 4;
            int actual = volume.getCurrentSoundVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void lowSoundVolumeMax() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(10);
            volume.lowSoundVolume();
            int expected = 9;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void lowSoundVolumeBeforeMax() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(9);
            volume.lowSoundVolume();
            int expected = 8;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void lowSoundVolumeAboveMax() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(101);
            volume.lowSoundVolume();
            int expected = 0;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void increaseSoundVolumeMin() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(0);
            volume.increaseSoundVolume();
            int expected = 1;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void increaseSoundVolumeAfterMin() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(1);
            volume.increaseSoundVolume();
            int expected = 2;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void increaseSoundVolume() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(5);
            volume.increaseSoundVolume();
            int expected = 6;
            int actual = volume.getCurrentSoundVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseSoundVolumeMax() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(100);
            volume.increaseSoundVolume();
            int expected = 100;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void increaseSoundVolumeBeforeMax() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(9);
            volume.increaseSoundVolume();
            int expected = 10;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void increaseSoundVolumeAboveMax() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(100);
            volume.increaseSoundVolume();
            int expected = 100;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void lowSoundVolumeMin() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(0);
            volume.lowSoundVolume();
            int expected = 0;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void lowSoundVolumeAfterMin() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(1);
            volume.lowSoundVolume();
            int expected = 0;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void lowSoundVolumeOverMin() {
            Radio volume = new Radio();
            volume.setCurrentSoundVolume(-1);
            volume.lowSoundVolume();
            int expected = 0;
            int actual = volume.getCurrentSoundVolume();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void setCountRadioStation() {
            int countStation = 15;
            Radio radio = new Radio(countStation);

            int expected = radio.getMaxRadioStation();
            Assertions.assertEquals(expected, countStation -1 );
        }

        @Test
        public void notSetCountRadioStation() {
            Radio radio = new Radio();

            int expected = radio.getMaxRadioStation();
            Assertions.assertEquals(expected,  9 );
        }

    }
