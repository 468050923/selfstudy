package array;

import javax.security.auth.login.CredentialNotFoundException;

public class Stack {
    Object[] ob ;
    private int length = 0;

    public int getOb() {
        return ob.length;
    }

    public Stack(int num) {
       this.ob = new Object[num];
    }


    public int getLength() {
        return length;
    }

    public Stack setLength(int length) {
        this.length = length;
        return this;
    }



    public boolean push(Object object){
        if (length<this.ob.length-1){
            ob[length] = object;
            setLength(getLength()-1);
            return true;
        }else
            return false;
    }


    public boolean pop(){
        if (length>0){
            setLength(getLength()-1);
            return true;

        }
        else{
            return false;
        }
    }


}

