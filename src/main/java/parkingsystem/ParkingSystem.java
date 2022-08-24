package parkingsystem;

public class ParkingSystem {
    int bigBuf = 0; // с определением 0 общее время 8мс, без 0 - 11мс
    int mediumBuf = 0;
    int smallBuf = 0;
    int bigSize;
    int mediumSize;
    int smallSize;

    public ParkingSystem(int big, int medium, int small) {
        bigSize = big;
        mediumSize = medium;
        smallSize = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case (1):
                if (bigBuf < bigSize) {
                    bigBuf++;
                    return true;
                }
                break;
            case (2):
                if (mediumBuf < mediumSize) {
                    mediumBuf++;
                    return true;
                }
                break;
            case (3):
                if (smallBuf < smallSize) {
                    smallBuf++;
                    return true;
                }
                break;
            default:
                break;
        }
        return false;
    }
}
