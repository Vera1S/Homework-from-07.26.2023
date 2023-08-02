package Homework;

public class WorldState7 {

    public boolean isHasHunger; // есть голод
    public boolean isEnvironmentallyHealth; // Является экологически здоровым
    public boolean hasCleanWater; // имеет чистую воду
    public boolean isPeaceful; // является мирным
    public boolean hasEnoughFood; // у него достаточно еды
    public boolean  isPollution; // является загрязнением;
    public boolean isWar; // является ли война

   public WorldState7(boolean isHasHunger, boolean isEnvironmentallyHealth, boolean hasCleanWater, boolean isPeaceful, boolean hasEnoughFood, boolean isPollution, boolean isWar) {
       this.isHasHunger = isHasHunger;
       this.isEnvironmentallyHealth = isEnvironmentallyHealth;
       this.hasCleanWater = hasCleanWater;
       this.isPeaceful = isPeaceful;
       this.hasEnoughFood = hasEnoughFood;
       this.isPollution = isPollution;
       this.isWar = isWar;

   }

       // Метод для определения состояния мира в негативном свете
       public boolean isWorldNegativelyGood() {
           System.out.println(isHasHunger || !isEnvironmentallyHealth || !hasCleanWater || !isPeaceful || !hasEnoughFood || isPollution || isWar);
           return true;
       }

       // Метод для определения состояния мира в позитивном свете
       public boolean isWorldPositivelyGood() {
           System.out.println(!isHasHunger && isEnvironmentallyHealth && hasCleanWater && isPeaceful && hasEnoughFood && !isPollution && !isWar);
           return true;
       }



   }



