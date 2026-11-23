package p007c.p190n.p194b.p334e.p353n;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.e.n.d, reason: use source file name */
/* JADX INFO: compiled from: CircularRevealWidget.java */
/* JADX INFO: loaded from: classes.dex */
public interface CircularRevealWidget extends CircularRevealHelper.a {

    /* JADX INFO: renamed from: c.n.b.e.n.d$b */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: a */
        public static final TypeEvaluator<e> f25192a = new b();

        /* JADX INFO: renamed from: b */
        public final e f25193b = new e((a) null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f25193b;
            float fM10993i0 = C4799a.m10993i0(eVar3.f25196a, eVar4.f25196a, f);
            float fM10993i1 = C4799a.m10993i0(eVar3.f25197b, eVar4.f25197b, f);
            float fM10993i2 = C4799a.m10993i0(eVar3.f25198c, eVar4.f25198c, f);
            eVar5.f25196a = fM10993i0;
            eVar5.f25197b = fM10993i1;
            eVar5.f25198c = fM10993i2;
            return this.f25193b;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.n.d$c */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class c extends Property<CircularRevealWidget, e> {

        /* JADX INFO: renamed from: a */
        public static final Property<CircularRevealWidget, e> f25194a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(CircularRevealWidget circularRevealWidget, e eVar) {
            circularRevealWidget.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.n.d$d */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class d extends Property<CircularRevealWidget, Integer> {

        /* JADX INFO: renamed from: a */
        public static final Property<CircularRevealWidget, Integer> f25195a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(CircularRevealWidget circularRevealWidget, Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.n.d$e */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class e {

        /* JADX INFO: renamed from: a */
        public float f25196a;

        /* JADX INFO: renamed from: b */
        public float f25197b;

        /* JADX INFO: renamed from: c */
        public float f25198c;

        public e() {
        }

        public e(a aVar) {
        }

        public e(float f, float f2, float f3) {
            this.f25196a = f;
            this.f25197b = f2;
            this.f25198c = f3;
        }

        public e(e eVar) {
            this(eVar.f25196a, eVar.f25197b, eVar.f25198c);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo11199a();

    /* JADX INFO: renamed from: b */
    void mo11200b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
