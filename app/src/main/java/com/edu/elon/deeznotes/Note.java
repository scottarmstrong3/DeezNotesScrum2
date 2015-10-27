package com.edu.elon.deeznotes;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by scottarmstrong on 10/20/15.
 */
public class Note {

    private Bitmap bitmap;
    protected float width, height;
    protected float x, y;
    protected int IDNumber;
    protected boolean isSelected;

    private int screenWidth, screenHeight;

    public Note (Context context) {
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.mipmap.note);

        width = bitmap.getWidth();
        height = bitmap.getHeight();

        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;

        x = screenWidth / 2;
        y = screenHeight / 2;
    }

    public void doDraw(Canvas canvas) {
        canvas.drawBitmap(bitmap,
                null,
                new Rect((int) (x - width/2), (int) (y- height/2),
                        (int) (x + width/2), (int) (y + height/2)),
                null);
    }

    public void doUpdate(double elapsed, float touchX, float touchY) {
        x = (float) touchX;
        y = (float) touchY;
    }
}
