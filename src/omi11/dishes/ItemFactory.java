package omi11.dishes;

enum ItemType {
    DUMMY(0),
    PIZZA (11),
    SALAD(12),
    SOUP(13),
    PASTA (14),
    DESSERT (15),
    SOFT (21),
    BEER (22),
    LIQUOR (23);

    private Integer id;
     ItemType(Integer id){
        this.id = id;
    }

    public Integer id(){
         return this.id;
    }
    public Boolean sell(){
         return true;
    }



}



public class ItemFactory {

    public ItemFactory(Stock stock){

    }

    public Iteml createItem(ItemType itemType, String name,Float price,Integer quantity){

        return new DummyItem();
    }
}
