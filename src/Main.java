public class Main {
    public static void main(String[] args) {
        double[] myList = new double[]{1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for(double ml:myList){
            if(max<ml){
                max = ml;
            }
            total+=ml;
            System.out.println("Toplam :"+total);
            System.out.println(max + " En Büyük Sayı");
        }
    }
}