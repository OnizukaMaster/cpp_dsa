import java.util.ArrayList;

public class arrayList {
    public static void main(String [] args){

//        the basic syntax for arraylist is
//        --> ArrayList<datatype> name = new ArrayList<datatype>
        ArrayList<String> food = new ArrayList<String>();
        food.add("Jelly");

        //        if you want to change the food name for specific index
//        you use the syntax: name.set(index,value)
        food.set(0,"pizza");

//        if you want to remove data from specific index posiiton we use remove(index)
        food.remove(0);

//        and if you want to clear whole arraylist or make it empty we use clear()
        food.clear();
//        length do not work with when using for loop instead use size() method as its a collection
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }


    }
}
