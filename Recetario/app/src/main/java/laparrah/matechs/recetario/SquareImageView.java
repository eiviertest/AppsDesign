package laparrah.matechs.recetario;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by lauranellyparra on 25/11/17.
 */

public class SquareImageView extends androidx.appcompat.widget.AppCompatImageView {
    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(900, 450);
        //Snap to width
    }
}