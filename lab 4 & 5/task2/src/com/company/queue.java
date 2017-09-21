package com.company;

public class queue {
    private final int x=0;
    char []q;
   // char [] ch={'A','B','C'};


    private int putloc,getloc;
    public queue(char[] ch){

       for(int i=0;i<ch.length;i++){
           System.out.println(ch[i]);
       }

    }
    public queue(queue Q1){
        q=new char[Q1.x];
        putloc=Q1.putloc;
        getloc=Q1.getloc;
    }

    public queue(int x){
        q=new char[x];
        int putloc=getloc=0;
    }

    public char put(char character){
        if(putloc==q.length-1){
            System.out.println("  ops  no Space left");
            return 0 ;
        }
        putloc=putloc+1;
        return q[putloc]=character;
    }

    public void get(){


        if(getloc<putloc||getloc==putloc){
            System.out.println(q[getloc]);
            getloc++;
            return;
        }
        if(getloc>putloc){
            System.out.println("queue is empty");
            return;
        }
    }

}
