public class ChallengeConstructor {

    public static void main(String[] args) {

        Brand brand1 = new Brand("ASUS");
        brand1.laptopBrand = "ASUS";
        Specification specification1 = new Specification("FX 505 DT", "AMD Ryzen 5");
        Specification specification2 = new Specification(5, 500);
        System.out.println("I have laptop " + brand1.laptopBrand + ", type " + specification1.type + ", processor " + specification1.processor + ", RAM " + specification2.ram + ", Storage " + specification2.storage);

//        System.out.println("\n");

        Brand brand2 = new Brand("LENOVO");
        brand2.laptopBrand = "LENOVO";
        Specification specification3 = new Specification("ThinkPad X13 Yoga", "Intel Evo");
        Specification specification4 = new Specification(16, 1);
        System.out.println("I have laptop " + brand2.laptopBrand + ", type " + specification3.type + ", processor " + specification3.processor + ", RAM " + specification4.ram + ", Storage " + specification4.storage);

    }

}
    class Brand{
        String laptopBrand;
        Brand(String brandName){
            System.out.println("Brand name : " + brandName);
        }
    }

    class Specification{

        // property
        String type;
        String processor;
        Integer ram;
        Integer storage;

        // overloading constructor
        Specification(String typeName, String processorName){
            type = typeName;
            processor = processorName;
            if(type.equalsIgnoreCase("asus")){
                Brand brand1 = new Brand("ASUS");
                System.out.println(brand1);
                System.out.println(this.type);
                System.out.println(this.processor);

            } else if(type.equalsIgnoreCase("lenovo")){
                Brand brand2 = new Brand("LENOVO");
                System.out.println(brand2);
                System.out.println(this.type);
                System.out.println(this.processor);

            }else{
//                System.out.println("not found");

             }
        }
        Specification(Integer ram, Integer storage){
            this.ram = ram;
            this.storage = storage;
            }
    }