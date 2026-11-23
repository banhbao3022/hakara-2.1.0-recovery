package p007c.p190n.p194b.p334e.p337c;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: c.n.b.e.c.e, reason: use source file name */
/* JADX INFO: compiled from: DrawableAlphaProperty.java */
/* JADX INFO: loaded from: classes.dex */
public class DrawableAlphaProperty extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: a */
    public static final Property<Drawable, Integer> f24800a = new DrawableAlphaProperty();

    /* JADX INFO: renamed from: b */
    public final WeakHashMap<Drawable, Integer> f24801b;

    public DrawableAlphaProperty() {
        super(Integer.class, "drawableAlphaCompat");
        this.f24801b = new WeakHashMap<>();
    }

    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
