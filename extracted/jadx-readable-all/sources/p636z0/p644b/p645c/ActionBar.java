package p636z0.p644b.p645c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.ActionMode;

/* JADX INFO: renamed from: z0.b.c.a, reason: use source file name */
/* JADX INFO: compiled from: ActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {

    /* JADX INFO: renamed from: z0.b.c.a$b */
    /* JADX INFO: compiled from: ActionBar.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m14601a(boolean z);
    }

    /* JADX INFO: renamed from: z0.b.c.a$c */
    /* JADX INFO: compiled from: ActionBar.java */
    @Deprecated
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract CharSequence m14602a();

        /* JADX INFO: renamed from: b */
        public abstract View m14603b();

        /* JADX INFO: renamed from: c */
        public abstract Drawable m14604c();

        /* JADX INFO: renamed from: d */
        public abstract CharSequence m14605d();

        /* JADX INFO: renamed from: e */
        public abstract void m14606e();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo14581a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo14582b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void mo14583c(boolean z) {
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo14584d();

    /* JADX INFO: renamed from: e */
    public Context mo14585e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo14586f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void mo14587g(Configuration configuration) {
    }

    /* JADX INFO: renamed from: h */
    public void mo14588h() {
    }

    /* JADX INFO: renamed from: i */
    public boolean mo14589i(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo14590j(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo14591k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void mo14592l(boolean z) {
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo14593m(boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo14594n(boolean z);

    /* JADX INFO: renamed from: o */
    public abstract void mo14595o(boolean z);

    /* JADX INFO: renamed from: p */
    public void mo14596p(boolean z) {
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo14597q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo14598r(CharSequence charSequence);

    /* JADX INFO: renamed from: s */
    public void mo14599s(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: t */
    public ActionMode mo14600t(ActionMode.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: z0.b.c.a$a */
    /* JADX INFO: compiled from: ActionBar.java */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f34411a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34411a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34386b);
            this.f34411a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.f34411a = 0;
            this.f34411a = 8388627;
        }

        public a(int i, int i2, int i3) {
            super(i, i2);
            this.f34411a = 0;
            this.f34411a = i3;
        }

        public a(int i) {
            this(-2, -1, i);
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f34411a = 0;
            this.f34411a = aVar.f34411a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34411a = 0;
        }
    }
}
