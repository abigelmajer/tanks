package eu.javeo.tanks;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by pstepniewski on 02.10.14.
 */
public abstract class GameObject {

    protected Sprite sprite;
    protected TiledMap map;

    public abstract void init();
    public void draw() {}

    public boolean collidesWith(GameObject another) {
        return sprite.getBoundingRectangle().overlaps(another.sprite.getBoundingRectangle());
    }
}
