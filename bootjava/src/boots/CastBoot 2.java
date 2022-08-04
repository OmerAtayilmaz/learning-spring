package boots;

public class CastBoot {
/*
* By @OmerAtayilmaz
* short to byte
* integer to short
* integer to byte
* float to integer
* float to short
* float to byte
* double to float
* double to integer
* double to short
* double to byte
* Long to integer
* */
    public static byte ShortToByte(short value){return (byte)value;}
    public static short IntegerToShort(int value){ return (short)value; }
    public static byte IntegerToByte(int value){ return (byte)value; }
    public static int FloatToInteger(float value){ return (int)value; }
    public static short FloatToShort(float value){ return (short)value; }
    public static byte FloatToByte(float value){ return (byte)value; }
    public static float DoubleToFloat(double value){ return (float)value; }
    public static int DoubleToInteger(double value){ return (int)value; }
    public static short DoubleToShort(double value){ return (short)value; }
    public static byte DoubleToByte(double value){ return (byte)value; }
    public static int LongToInteger(Long value){ return Math.toIntExact(value); }
}
