package omi11.dishes;

import java.util.List;

public class Stock {
    List <Iteml> articles;

    public Boolean add(Iteml item,Integer quantity){

        if (!articles.contains(item)){
            articles.add(item);
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean request(Iteml item,Integer quantity){

        return (articles.contains(item)) ? true : false;
    }
    public Boolean remove(Iteml item){

        if (articles.contains(item)){
            articles.remove(item);
            return true;
        }
        else{
            return false;
        }
    }

    public List<Iteml> getAvailable(){
        return this.articles;
    }
    public Iteml getItem(String name){
       int counter = 0;
        for (Iteml item : articles){
            if (item.getName() == name){
                return articles.get(counter);
            }
            counter++;
        }

        return null;
    }

    public Integer nItems(){
        return articles.size();
    }

    public void printItemList(){
        for (Iteml item : articles){
            System.out.println(item + "\n");
        }
    }

}
