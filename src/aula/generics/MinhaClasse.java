package aula.generics;

//T = type: definir um tipo dinamico
public class MinhaClasse<T> {
    T obj;

    public MinhaClasse(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
