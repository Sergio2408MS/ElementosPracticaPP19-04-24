
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2
{
public boolean puedoGenerar(String[] a, String x){
    boolean res;
    res = buscar(a, x, 0);
    
    return res;
}
private boolean buscar(String[]a, String n, int cn){
    boolean res = true;
    if(cn< n.length()){
        char d = n.charAt(cn);
        if(comparar(d,a,0)){
            res = buscar(a,n,cn+1);
        }else{
            res = false;
        }
    }
    return res;
}
private boolean comparar(char d, String[]a, int ca){
    boolean res;
    if(ca<a.length){
        char x = a[ca].charAt(0);
        if(x == d){
            res = true;
        }else{
            res = comparar(d, a, ca+1);
        }
    }else{
        res = false;
    }
    return res;
}

}
