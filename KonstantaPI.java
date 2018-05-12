/*---------------------
=> Java Memungkinkan pendefinisian konstanta melalui katakunci "Final".
=> Karena "Pi" telah didefinisikan oleh kata kunci "Final" maka "Pi" tidak dapat diubah kembali.
-----------------------*/

public class KonstantaPI{
    public static void main(String[] args) {
        final double Pi=3.14;
        double radius=30;
        System.out.println("Keliling= "+2 * Pi * radius); //Rumus untuk menghitung. Yaitu Pi yang bernilai 3.14 dan radius bernilai 30
                                                        //Yang mempunyai kata kunci "Double"
    }
}