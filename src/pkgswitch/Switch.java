
package pkgswitch;

public class Switch {

    public static void main(String[] args) {
        // programa que escriba 6 veces alternativamente hola, adiós
        int sw=0;
        for(int i=0;i<6;i++){    
            if(sw==0){
                System.out.println("Hola");
                sw=1;
            }else{
                System.out.println("Adiós");
                sw=0;
            }
        }
    }
    
}
