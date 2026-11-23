package p636z0.p725k.p729e.p730l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: z0.k.e.l.e, reason: use source file name */
/* JADX INFO: compiled from: WrappedDrawableState.java */
/* JADX INFO: loaded from: classes.dex */
public final class WrappedDrawableState extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f37885a;

    /* JADX INFO: renamed from: b */
    public Drawable.ConstantState f37886b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f37887c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f37888d;

    public WrappedDrawableState(WrappedDrawableState wrappedDrawableState) {
        this.f37887c = null;
        this.f37888d = WrappedDrawableApi14.f37877f;
        if (wrappedDrawableState != null) {
            this.f37885a = wrappedDrawableState.f37885a;
            this.f37886b = wrappedDrawableState.f37886b;
            this.f37887c = wrappedDrawableState.f37887c;
            this.f37888d = wrappedDrawableState.f37888d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f37885a;
        Drawable.ConstantState constantState = this.f37886b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new WrappedDrawableApi21(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new WrappedDrawableApi21(this, resources);
    }
}
