package EjerciciosTema4;

public class Main {

    public static void main(String[] args) {
       SmartPhone smartphone1 =new SmartPhone();
        SmartPhone smartphone2 =new SmartPhone("00:1B:44:11:3A:B7","XIAOMI","Android",45,"1440 x 2960",32,"108 megapixeles",55236484,3);

       SmartWatch smartwatch1 = new SmartWatch();

       SmartWatch smartwatch2 = new SmartWatch("00:1B:44:21:3A:B4","Huawei","HarmonyOS",78,"280 x 456",16, "metalica",true,"Sport",true);

        System.out.println(smartphone2);
        System.out.println(smartwatch2);
    }
}
