package Enum;

class Level {
    enum Levels{
        LOW ("Low level"),
        MEDIUM ("Medium level"),
        HIGH("High level");



    private String description;
    Levels (String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    }


    public static void main(String[] args){
        Levels myVar=Levels.HIGH;
        System.out.println(myVar.getDescription());

    }
}



