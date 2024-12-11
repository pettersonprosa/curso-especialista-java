public class NumeroUtil {

    static int descobrirMaior(int x, int y) {
        return x > y ? x: y;
    }

    static int descobrirMaior(int x, int y, int z) {
        return descobrirMaior(descobrirMaior(x, y) , z);
    }

    static double descobrirMaior(double x, double y) {
        return x > y ? x: y;
    }

    static double descobrirMaior(double x, double y, double z) {
        return descobrirMaior(descobrirMaior(x, y) , z);
    }

}
