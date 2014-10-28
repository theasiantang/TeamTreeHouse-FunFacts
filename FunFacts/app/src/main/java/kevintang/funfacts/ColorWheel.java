package kevintang.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Kevin on 28/10/2014.
 */
public class ColorWheel {

    // Member Variables (properties about the object)
    public String[] mColors =
            {
                "#39add1",
                "#3079ab",
                "#c25975",
                "#e15258",
                "#f9945b",
                "#838cc7",
                "#53bbb4",
                "#51b46d",
                "#e0ab18",
                "#637a91"
            };

    // Method (abilities: things the object can do)

    public int getColor()
    {
        String color = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
