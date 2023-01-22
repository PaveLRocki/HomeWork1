package HomeWork1;

public class Launch {

    private byte bbyte;
    private short sshort;
    private int iint;
    private long llong;
    private float ffloat;
    private double ddouble;
    private boolean bboolean;
    private char cchar;

    private Byte aByte;
    private Short aShort;
    private Integer integer;
    private Long aLong;
    private Float aFloat;
    private Double aDouble;
    private Character character;
    private Boolean aBoolean;
    private String string;

    public static void main(String[] args) {
        byte bbyte = -127;
        short sshort = -4165;
        int iint = 61456;
        long llong = -14651616L;
        float ffloat = 1.654F;
        double ddouble = 4.185968448D;
        boolean bboolean = true;
        char cchar = 'A';

        Byte aByte = -1;
        Short aShort = 132;
        Integer integer = 3513;
        Long aLong = -3123313313L;
        Float aFloat = 1.122466F;
        Double aDouble = 3.3651616165616D;
        Character character = 'L';
        Boolean aBoolean = false;
        String string = "Проба пера";

        int i = 100;
        byte b = (byte) i;
        float f = 3.33F;
        double d = (float) f;

    Variable one = new Variable();
    Variable two = new Variable();



        System.out.println(one.getBbyte());
        System.out.println(one.getSshort());
        System.out.println(one.getIint());
        System.out.println(one.getLlong());
        System.out.println(one.getFfloat());
        System.out.println(one.getDdouble());
        System.out.println(one.isBboolean());
        System.out.println(one.getCchar());

        System.out.println(one.getaByte());
        System.out.println(one.getaShort());
        System.out.println(one.getInteger());
        System.out.println(one.getaLong());
        System.out.println(one.getaFloat());
        System.out.println(one.getaDouble());
        System.out.println(one.getCharacter());
        System.out.println(one.getaBoolean());
        System.out.println(one.getString());

        System.out.println(bbyte);
        System.out.println(sshort);
        System.out.println(iint);
        System.out.println(llong);
        System.out.println(ffloat);
        System.out.println(ddouble);
        System.out.println(bboolean);
        System.out.println(cchar);

        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(character);
        System.out.println(aBoolean);
        System.out.println(string);

        System.out.println(i);
        System.out.println(f);


    }
}