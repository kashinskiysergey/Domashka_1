/**
 * Created by HP_Delphi on 02.10.2015.
 */
class Plane{}
public class Incapsulation {
    public static void main(String[] args) {
        int Speed = 500;
        boolean Forma = true;

        Plane SportPlane = new Plane(int , String){
            if( Speed <= 500  && Forma){
                System.out.println("Перегрузка");

            }
        }
    }

}

git config --global user.email "kashinskiysergey@ukr.net"
        git config --global user.name "Sergey"