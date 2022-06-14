/** COPYRIGHT (C) 2022 Kaitlin Timmer. All Rights Reserved.
 Bread Program
 Solves ITEC2150 homework assignment #2, part 2
 @author Kaitlin Timmer
 @version 1.02 2022-06-04
 Attribution: I used the starter code provided by Dr. Lutz for the main method
 I conformed to GGC’s academic integrity policies when creating this code
 – Kaitlin Timmer 04-June-2022
 */

package bread;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        // build and test Sourdough
        StringBuilder sourdoughRecipe = new StringBuilder();
        sourdoughRecipe.append("1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n");
        sourdoughRecipe.append("2. Make the dough\n");
        sourdoughRecipe.append("3. Bulk Rise\n");
        sourdoughRecipe.append("4. Stretch and fold the dough\n");
        sourdoughRecipe.append("5. Cut and shape the dough\n");
        sourdoughRecipe.append("6. Second rise\n");
        sourdoughRecipe.append("6. Preheat the oven to 450°F towards the tail end of the second rise.\n");
        sourdoughRecipe.append("7. Spray the loaf with luke warm water.\n");
        sourdoughRecipe.append("8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n");
        sourdoughRecipe.append("9. Remove the bread from the oven.\n");
        sourdoughRecipe.append("10.Let the bread cool until good to eat.");
        String recipe = sourdoughRecipe.toString();

        Sourdough dough = new Sourdough(5.0d, 1.5d, 2.5d, 0.0d, 1.0d,
                1.0d, recipe, false, 1.0d);

        System.out.println("Ingredients of " + dough.getBreadName() + " bread are:");
        System.out.println(dough.getIngredients());
        System.out.println();

        System.out.println("A recipe for " + dough.getBreadName() + " is");
        System.out.println(dough.getRecipe());
        System.out.println();

        System.out.println("The bread has been baked: " + dough.isBaked());

        System.out.println("Let's bake the bread now.");
        dough.bake();
        System.out.println("The bread has been baked: " + dough.isBaked());
        System.out.println();

        // build and test Pastry
        StringBuilder pastryRecipe = new StringBuilder();
        pastryRecipe.append("1. Mix sugar, pastry flour, salt, water, and fat together\n");
        pastryRecipe.append("2. Fluff dough with fingers and make sure it feels light\n");
        pastryRecipe.append("3. Roll dough with rolling pin\n");
        pastryRecipe.append("4. Put dough in fridge and leave for 3 hours, then enjoy\n");
        recipe = pastryRecipe.toString();

        Pastry pastry = new Pastry(2.0, 1.0, 2.0, 2.0,
                3.0, 1.0, recipe, false, 3.0);

        System.out.println("Ingredients of " + pastry.getBreadName() + " bread are:");
        System.out.println(pastry.getIngredients());
        System.out.println();

        System.out.println("A Recipe for a Pastry:");
        System.out.println(pastry.getRecipe());

        // build and test Cinnamon Raisin
        StringBuilder cinnamonRaisinRecipe = new StringBuilder();
        cinnamonRaisinRecipe.append("1. Mix flour, water, salt, baking powder, and yeast.\n");
        cinnamonRaisinRecipe.append("2. Make the dough\n");
        cinnamonRaisinRecipe.append("3. Fold in the raisins\n");
        cinnamonRaisinRecipe.append("4. Let the dough rise\n");
        cinnamonRaisinRecipe.append("5. Cut and shape the dough\n");
        cinnamonRaisinRecipe.append("6. Preheat the oven to 400°F.\n");
        cinnamonRaisinRecipe.append("7. Spray the loaf with luke warm water.\n");
        cinnamonRaisinRecipe.append("8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n");
        cinnamonRaisinRecipe.append("9. Remove the bread from the oven.\n");
        cinnamonRaisinRecipe.append("10.Let the bread cool until good to eat.");
        recipe = cinnamonRaisinRecipe.toString();

        cinnamonRaisin loaf = new cinnamonRaisin(5.0d, 1.5d, 2.5d, 0.0d, 1.0d,
                1.0d, recipe, false, 1.0d);

        System.out.println("Ingredients of " + loaf.getBreadName() + " bread are:");
        System.out.println(loaf.getIngredients());
        System.out.println();

        System.out.println("A recipe for " + loaf.getBreadName() + " is");
        System.out.println(loaf.getRecipe());
        System.out.println();

        System.out.println("The bread has been baked: " + loaf.isBaked());

        System.out.println("Let's bake the bread now.");
        loaf.bake();
        System.out.println("The bread has been baked: " + loaf.isBaked());
        System.out.println();

        // build and test Cinnamon Raisin
        StringBuilder bananaBreadRecipe = new StringBuilder();
        bananaBreadRecipe.append("1. Mix flour, water, salt, baking powder, and yeast.\n");
        bananaBreadRecipe.append("2. Make the dough\n");
        bananaBreadRecipe.append("3. Fold in the bananas\n");
        bananaBreadRecipe.append("4. Let the dough rise\n");
        bananaBreadRecipe.append("5. Cut and shape the dough\n");
        bananaBreadRecipe.append("6. Preheat the oven to 400°F.\n");
        bananaBreadRecipe.append("7. Spray the loaf with luke warm water.\n");
        bananaBreadRecipe.append("8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n");
        bananaBreadRecipe.append("9. Remove the bread from the oven.\n");
        bananaBreadRecipe.append("10.Let the bread cool until good to eat.");
        recipe = bananaBreadRecipe.toString();

        bananaBread loaf2 = new bananaBread(3.0d, 1.5d, 2.5d, 0.0d, 1.0d,
                1.0d, recipe, false, 3.0d);

        System.out.println("Ingredients of " + loaf2.getBreadName() + " bread are:");
        System.out.println(loaf2.getIngredients());
        System.out.println();

        System.out.println("A recipe for " + loaf2.getBreadName() + " is");
        System.out.println(loaf2.getRecipe());
        System.out.println();

        System.out.println("The bread has been baked: " + loaf2.isBaked());

        System.out.println("Let's bake the bread now.");
        loaf2.bake();
        System.out.println("The bread has been baked: " + loaf2.isBaked());
        System.out.println();

    }
}

class Bread{
    private ArrayList<String> ingredients;
    private String recipe;
    private boolean isBaked = false;

    public Bread() {
    }

    public Bread(double cupsOfFlour, double cupsOfWater, double tspsOfSalt,
                 double tspsOfSugar, double tspsOfBakingPowder, double tspsOfYeast, String recipe,
                 boolean isBaked) {
        ArrayList<String> breadIngredients = null;
        breadIngredients = new ArrayList<>();
        breadIngredients.add(cupsOfFlour + " cups of flour");
        breadIngredients.add(cupsOfWater + " cup of water");
        breadIngredients.add(tspsOfSalt + " tsps of salt");
        breadIngredients.add(tspsOfSugar + " tsps of sugar");
        breadIngredients.add(tspsOfBakingPowder + " tsps of baking powder");
        breadIngredients.add(tspsOfYeast + " tsps yeast");

        this.ingredients = breadIngredients;
        this.recipe = recipe;
        this.isBaked = isBaked;
    }

    public String getIngredients() {
        String result = "";
        for (String each : this.ingredients) {
            result += each;
            result += "\n";
        }
        return result;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public void bake() {
        isBaked = true;
    }

    public boolean isBaked() {
        return isBaked;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "ingredients=" + ingredients +
                ", recipe='" + recipe + '\'' +
                ", isBaked=" + isBaked +
                '}';
    }
}

class Sourdough extends Bread {
    private double cupsOfStarter;

    public Sourdough() {
    }

    public Sourdough(double cupsOfFlour, double cupsOfWater, double tspsOfSalt,
                     double tspsOfSugar, double tspsOfBakingPowder,
                     double tspsOfYeast, String recipe, boolean isBaked,
                     double cupsOfStarter) {
        super(cupsOfFlour, cupsOfWater, tspsOfSalt, tspsOfSugar,
                tspsOfBakingPowder, tspsOfYeast, recipe, isBaked);
        this.cupsOfStarter = cupsOfStarter;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()
        + cupsOfStarter + " cups of sourdough starter";
    }

    public String getBreadName() {
        return "Sourdough";
    }
}

class Pastry extends Bread {
    private double cupsOfPastryFlour;

    public Pastry() {
    }

    public Pastry(double cupsOfFlour, double cupsOfWater, double tspsOfSalt,
                  double tspsOfSugar, double tspsOfBakingPowder,
                  double tspsOfYeast, String recipe, boolean isBaked,
                  double cupsOfPastryFlour) {
        super(cupsOfFlour, cupsOfWater, tspsOfSalt, tspsOfSugar,
                tspsOfBakingPowder, tspsOfYeast, recipe, isBaked);
        this.cupsOfPastryFlour = cupsOfPastryFlour;
    }

    @Override
    public String getIngredients() {
        return cupsOfPastryFlour + " cups of pastry flour\n" +
                super.getIngredients();
    }


    public String getBreadName() {
        return "Pastry";
    }
}


class cinnamonRaisin extends Bread {
    private double cupsOfRaisins;

    public cinnamonRaisin() {
    }

    public cinnamonRaisin(double cupsOfFlour, double cupsOfWater,
                          double tspsOfSalt, double tspsOfSugar,
                          double tspsOfBakingPowder, double tspsOfYeast,
                          String recipe, boolean isBaked, double cupsOfRaisins){
        super(cupsOfFlour, cupsOfWater, tspsOfSalt, tspsOfSugar,
                tspsOfBakingPowder, tspsOfYeast, recipe, isBaked);
        this.cupsOfRaisins = cupsOfRaisins;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + cupsOfRaisins + " cups of raisins.";
    }

    public String getBreadName() {
        return "Cinnamon Raisin";
    }
}

class bananaBread extends Bread {
    private double numBananas;

    public bananaBread() {
    }

    public bananaBread(double cupsOfFlour, double cupsOfWater,
                      double tspsOfSalt, double tspsOfSugar,
                      double tspsOfBakingPowder, double tspsOfYeast,
                      String recipe, boolean isBaked, double numBananas) {
        super(cupsOfFlour, cupsOfWater, tspsOfSalt, tspsOfSugar,
                tspsOfBakingPowder, tspsOfYeast, recipe, isBaked);
        this.numBananas = numBananas;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + numBananas + " bananas";
    }

    public String getBreadName() {
        return "Banana Bread";
    }
}