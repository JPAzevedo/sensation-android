package ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by joaop on 01/11/2016.
 */

public class CustomTextview extends TextView {
    public CustomTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/ADAM.CG PRO.otf"));
    }
}
