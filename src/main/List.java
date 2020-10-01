package main;


import java.util.ArrayList;

public class List {
    public ArrayList<Object> elements;

    public List(ArrayList<Object> newElements) {
        this.elements = new ArrayList<>();
        Object[] arrayList = newElements.toArray();
        for(int i = 0; i < arrayList.length; i++)
            this.elements.add(getNewObject(arrayList[i]));
    }

    public List(List that) {
        this(that.elements);
    }

    private Object getNewObject(Object o) {
        if(o instanceof List)
            return new List((List) o);
        else
            return o;
    }

    public Object getElement(Integer index) {
        return this.elements.get(index);
    }

    public void setElement(Integer index, Object o) {
        this.elements.set(index, getNewObject(o));
    }

}
