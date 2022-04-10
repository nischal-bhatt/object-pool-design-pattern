package com.coffeepoweredcrew.objectpool;

import javafx.geometry.Point2D;

public class Client {

	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()->new Bitmap("logo.bmp"),5);
	
	
    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10,10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(-10,0));
        
        b1.draw();
        b2.draw();
        System.out.println("hi");
        bitmapPool.release(b1);
        bitmapPool.release(b2);
        
        
        Bitmap b3 = bitmapPool.get();
        Bitmap b4 = bitmapPool.get();
        Bitmap b5 = bitmapPool.get();
        Bitmap b6 = bitmapPool.get();
        Bitmap b7 = bitmapPool.get();
        
        bitmapPool.release(b3);
        bitmapPool.release(b4);
        bitmapPool.release(b5);
        bitmapPool.release(b6);
        bitmapPool.release(b7);
        
        Bitmap b9 = bitmapPool.get();
        Bitmap b10 = bitmapPool.get();
        Bitmap b11 = bitmapPool.get();
        Bitmap b12 = bitmapPool.get();
        Bitmap b13 = bitmapPool.get();
        bitmapPool.release(b13);
        
        Bitmap n1 = bitmapPool.get();
        
        System.out.println("ending prog");
    }
}
