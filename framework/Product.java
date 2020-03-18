package framework;

public interface Product extends Cloneable{
    //cloneメソッドを使って自動的に複製を行うことができるようになる
    public abstract void Use(String s);

    public abstract Product CreateClone(); //CreateCloneメソッドはインスタンスの複製を行うもの
} 