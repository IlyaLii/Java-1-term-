package com.company;


public class Lemonade extends Food{

    private String taste = null;
    private String alc = null;

    public Lemonade(String taste, String alc){
        super("Lemonade");
        this.taste = taste;
        this.alc = alc;
    }

    public void setTaste(String taste){
        this.taste = taste;
    }

    public String getTaste(){
        return taste;
    }

    public void setAlc(String alc){
        this.alc = alc;
    }

    public String getAlc(){
        return alc;
    }

    public void consume(){
        System.out.println(this + " has been drunk");
    }

    public String toString() {
        if (alc == null){
            return super.toString() + " taste of '" + taste.toUpperCase() + "'";
        }
        else{
            return super.toString() + " taste of '" + taste.toUpperCase() + "' and '" + alc.toUpperCase() + "'" ;
        }

    }

    public boolean equals(Object arg0)
    {
        if (!super.equals(arg0))
        {
            return false;
        }


        if(((Lemonade)arg0).getTaste() == this.getTaste() && ((Lemonade)arg0).getAlc() == this.getAlc()){
            return true;
        } else{
            return false;
        }
    }
}
