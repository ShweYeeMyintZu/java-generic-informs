 class Box<T,S> {
private T t;
private S s;
public void add(T t,S s){
    this.t=t;
    this.s=s;
}
public T fistget(){
    return t;
}
public S secondget(){
    return s;
}

}
