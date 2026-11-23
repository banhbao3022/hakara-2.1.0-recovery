package p007c.p190n.p194b.p209b.p252x1;

import android.graphics.Bitmap;
import android.text.Layout;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.c, reason: use source file name */
/* JADX INFO: compiled from: Cue.java */
/* JADX INFO: loaded from: classes.dex */
public final class Cue {

    /* JADX INFO: renamed from: a */
    public static final Cue f9786a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f9787b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f9788c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f9789d;

    /* JADX INFO: renamed from: e */
    public final float f9790e;

    /* JADX INFO: renamed from: f */
    public final int f9791f;

    /* JADX INFO: renamed from: g */
    public final int f9792g;

    /* JADX INFO: renamed from: h */
    public final float f9793h;

    /* JADX INFO: renamed from: i */
    public final int f9794i;

    /* JADX INFO: renamed from: j */
    public final float f9795j;

    /* JADX INFO: renamed from: k */
    public final float f9796k;

    /* JADX INFO: renamed from: l */
    public final boolean f9797l;

    /* JADX INFO: renamed from: m */
    public final int f9798m;

    /* JADX INFO: renamed from: n */
    public final int f9799n;

    /* JADX INFO: renamed from: o */
    public final float f9800o;

    /* JADX INFO: renamed from: p */
    public final int f9801p;

    /* JADX INFO: renamed from: q */
    public final float f9802q;

    static {
        b bVar = new b();
        bVar.f9803a = "";
        f9786a = bVar.m4392a();
    }

    @Deprecated
    public Cue(CharSequence charSequence) {
        this(charSequence, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    /* JADX INFO: renamed from: a */
    public b m4391a() {
        return new b(this, null);
    }

    @Deprecated
    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    @Deprecated
    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    @Deprecated
    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, -3.4028235E38f, f3, -3.4028235E38f, z, i4, Integer.MIN_VALUE, 0.0f);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            Objects.requireNonNull(bitmap);
        } else {
            C2096e.m4566b(bitmap == null);
        }
        this.f9787b = charSequence;
        this.f9788c = alignment;
        this.f9789d = bitmap;
        this.f9790e = f;
        this.f9791f = i;
        this.f9792g = i2;
        this.f9793h = f2;
        this.f9794i = i3;
        this.f9795j = f4;
        this.f9796k = f5;
        this.f9797l = z;
        this.f9798m = i5;
        this.f9799n = i4;
        this.f9800o = f3;
        this.f9801p = i6;
        this.f9802q = f6;
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.c$b */
    /* JADX INFO: compiled from: Cue.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public CharSequence f9803a;

        /* JADX INFO: renamed from: b */
        public Bitmap f9804b;

        /* JADX INFO: renamed from: c */
        public Layout.Alignment f9805c;

        /* JADX INFO: renamed from: d */
        public float f9806d;

        /* JADX INFO: renamed from: e */
        public int f9807e;

        /* JADX INFO: renamed from: f */
        public int f9808f;

        /* JADX INFO: renamed from: g */
        public float f9809g;

        /* JADX INFO: renamed from: h */
        public int f9810h;

        /* JADX INFO: renamed from: i */
        public int f9811i;

        /* JADX INFO: renamed from: j */
        public float f9812j;

        /* JADX INFO: renamed from: k */
        public float f9813k;

        /* JADX INFO: renamed from: l */
        public float f9814l;

        /* JADX INFO: renamed from: m */
        public boolean f9815m;

        /* JADX INFO: renamed from: n */
        public int f9816n;

        /* JADX INFO: renamed from: o */
        public int f9817o;

        /* JADX INFO: renamed from: p */
        public float f9818p;

        public b() {
            this.f9803a = null;
            this.f9804b = null;
            this.f9805c = null;
            this.f9806d = -3.4028235E38f;
            this.f9807e = Integer.MIN_VALUE;
            this.f9808f = Integer.MIN_VALUE;
            this.f9809g = -3.4028235E38f;
            this.f9810h = Integer.MIN_VALUE;
            this.f9811i = Integer.MIN_VALUE;
            this.f9812j = -3.4028235E38f;
            this.f9813k = -3.4028235E38f;
            this.f9814l = -3.4028235E38f;
            this.f9815m = false;
            this.f9816n = -16777216;
            this.f9817o = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: a */
        public Cue m4392a() {
            return new Cue(this.f9803a, this.f9805c, this.f9804b, this.f9806d, this.f9807e, this.f9808f, this.f9809g, this.f9810h, this.f9811i, this.f9812j, this.f9813k, this.f9814l, this.f9815m, this.f9816n, this.f9817o, this.f9818p);
        }

        public b(Cue cue, a aVar) {
            this.f9803a = cue.f9787b;
            this.f9804b = cue.f9789d;
            this.f9805c = cue.f9788c;
            this.f9806d = cue.f9790e;
            this.f9807e = cue.f9791f;
            this.f9808f = cue.f9792g;
            this.f9809g = cue.f9793h;
            this.f9810h = cue.f9794i;
            this.f9811i = cue.f9799n;
            this.f9812j = cue.f9800o;
            this.f9813k = cue.f9795j;
            this.f9814l = cue.f9796k;
            this.f9815m = cue.f9797l;
            this.f9816n = cue.f9798m;
            this.f9817o = cue.f9801p;
            this.f9818p = cue.f9802q;
        }
    }
}
