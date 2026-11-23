package p007c.p190n.p194b.p334e.p336b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p007c.p190n.p194b.p334e.C4801b;
import p636z0.p644b.p646d.p647a.AppCompatResources;

/* JADX INFO: renamed from: c.n.b.e.b0.c, reason: use source file name */
/* JADX INFO: compiled from: TabItem.java */
/* JADX INFO: loaded from: classes.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: f */
    public final CharSequence f24772f;

    /* JADX INFO: renamed from: g */
    public final Drawable f24773g;

    /* JADX INFO: renamed from: h */
    public final int f24774h;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24740L);
        this.f24772f = typedArrayObtainStyledAttributes.getText(2);
        this.f24773g = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AppCompatResources.m14707b(context, resourceId);
        this.f24774h = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
