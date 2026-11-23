package p636z0.p644b.p648e.p649a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: renamed from: z0.b.e.a.d, reason: use source file name */
/* JADX INFO: compiled from: StateListDrawable.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class StateListDrawable extends DrawableContainer {

    /* JADX INFO: renamed from: s */
    public a f34659s;

    /* JADX INFO: renamed from: t */
    public boolean f34660t;

    /* JADX INFO: renamed from: z0.b.e.a.d$a */
    /* JADX INFO: compiled from: StateListDrawable.java */
    public static class a extends DrawableContainer.c {

        /* JADX INFO: renamed from: J */
        public int[][] f34661J;

        public a(a aVar, StateListDrawable stateListDrawable, Resources resources) {
            super(aVar, stateListDrawable, resources);
            if (aVar != null) {
                this.f34661J = aVar.f34661J;
            } else {
                this.f34661J = new int[this.f34638g.length][];
            }
        }

        @Override // p636z0.p644b.p648e.p649a.DrawableContainer.c
        /* JADX INFO: renamed from: e */
        public void mo14715e() {
            int[][] iArr = this.f34661J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f34661J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f34661J = iArr2;
        }

        /* JADX INFO: renamed from: g */
        public int m14727g(int[] iArr) {
            int[][] iArr2 = this.f34661J;
            int i = this.f34639h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new StateListDrawable(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawable(this, resources);
        }
    }

    public StateListDrawable(a aVar, Resources resources) {
        mo14710e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p636z0.p644b.p648e.p649a.DrawableContainer, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p636z0.p644b.p648e.p649a.DrawableContainer
    /* JADX INFO: renamed from: e */
    public void mo14710e(DrawableContainer.c cVar) {
        this.f34609g = cVar;
        int i = this.f34615m;
        if (i >= 0) {
            Drawable drawableM14725d = cVar.m14725d(i);
            this.f34611i = drawableM14725d;
            if (drawableM14725d != null) {
                m14720c(drawableM14725d);
            }
        }
        this.f34612j = null;
        if (cVar instanceof a) {
            this.f34659s = (a) cVar;
        }
    }

    @Override // p636z0.p644b.p648e.p649a.DrawableContainer
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a mo14709b() {
        return new a(this.f34659s, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p636z0.p644b.p648e.p649a.DrawableContainer, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f34660t) {
            super.mutate();
            if (this == this) {
                this.f34659s.mo14715e();
                this.f34660t = true;
            }
        }
        return this;
    }

    @Override // p636z0.p644b.p648e.p649a.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM14727g = this.f34659s.m14727g(iArr);
        if (iM14727g < 0) {
            iM14727g = this.f34659s.m14727g(StateSet.WILD_CARD);
        }
        return m14721d(iM14727g) || zOnStateChange;
    }

    public StateListDrawable(a aVar) {
    }
}
