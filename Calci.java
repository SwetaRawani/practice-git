interface Calci{
public int getSum(int a, int b);
public int getproduct(int a,int b);
}
class CalciImp implements Calci{
    public int getSum(int a, int b){
        return a+b;
    }
public int getproduct(int a,int b){
    return a*b;
}
}