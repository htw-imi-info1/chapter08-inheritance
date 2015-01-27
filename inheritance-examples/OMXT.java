
public class OMXT
{
    class M {}
    class X extends M{}
    class T extends O{}
    class O extends M{}
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
        // o = m;
        // o = x;
        // x = o;
    }
}
