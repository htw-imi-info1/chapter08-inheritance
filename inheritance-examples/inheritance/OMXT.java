
public class OMXT
{
    class O{}
    class M{}
    class X{}
    class T extends M{}
    O o; 
    M m;
    X x;
    T t;

    public void valid(){
        m = t; 
        m = x;
        o = t;
    }
    public void invalid(){
        o = m;
        o = x;
        x = o;
    
    }

}
