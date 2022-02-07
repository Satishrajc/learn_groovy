class MyCLass{
    private String fruitName

    def setfFruitName(name){
        fruitName = name
    }

    def getFruitName(){
        return fruitName
    } 

    def static void main(args) {
        MyCLass obj = new MyCLass()
        obj.setfFruitName("Apple")
        println(obj.getFruitName())

    }   
}
