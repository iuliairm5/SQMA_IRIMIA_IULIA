package irimiaiulia;



public class Division {

    private int a,b;

    public Division(int x,int y){
        this.a=x;
        this.b=y;
    }

    public int doQuotient(){
        if(b==0) throw new IllegalArgumentException("b is zero !");

        return a/b;
    }

    public int doRemainder(){
        if(b==0) throw new IllegalArgumentException("b is zero !");

        return a%b;
    }
}
