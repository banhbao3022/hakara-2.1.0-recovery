package p636z0.p774z.p775b;

import android.view.View;

/* JADX INFO: renamed from: z0.z.b.g0, reason: use source file name */
/* JADX INFO: compiled from: ViewBoundsCheck.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewBoundsCheck {

    /* JADX INFO: renamed from: a */
    public final b f39182a;

    /* JADX INFO: renamed from: b */
    public a f39183b = new a();

    /* JADX INFO: renamed from: z0.z.b.g0$a */
    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f39184a = 0;

        /* JADX INFO: renamed from: b */
        public int f39185b;

        /* JADX INFO: renamed from: c */
        public int f39186c;

        /* JADX INFO: renamed from: d */
        public int f39187d;

        /* JADX INFO: renamed from: e */
        public int f39188e;

        /* JADX INFO: renamed from: a */
        public boolean m17023a() {
            int i = this.f39184a;
            if ((i & 7) != 0 && (i & (m17024b(this.f39187d, this.f39185b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f39184a;
            if ((i2 & 112) != 0 && (i2 & (m17024b(this.f39187d, this.f39186c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f39184a;
            if ((i3 & 1792) != 0 && (i3 & (m17024b(this.f39188e, this.f39185b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f39184a;
            return (i4 & 28672) == 0 || (i4 & (m17024b(this.f39188e, this.f39186c) << 12)) != 0;
        }

        /* JADX INFO: renamed from: b */
        public int m17024b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.g0$b */
    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo767a(View view);

        /* JADX INFO: renamed from: b */
        int mo768b();

        /* JADX INFO: renamed from: c */
        int mo769c();

        /* JADX INFO: renamed from: d */
        View mo770d(int i);

        /* JADX INFO: renamed from: e */
        int mo771e(View view);
    }

    public ViewBoundsCheck(b bVar) {
        this.f39182a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public View m17021a(int i, int i2, int i3, int i4) {
        int iMo768b = this.f39182a.mo768b();
        int iMo769c = this.f39182a.mo769c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo770d = this.f39182a.mo770d(i);
            int iMo767a = this.f39182a.mo767a(viewMo770d);
            int iMo771e = this.f39182a.mo771e(viewMo770d);
            a aVar = this.f39183b;
            aVar.f39185b = iMo768b;
            aVar.f39186c = iMo769c;
            aVar.f39187d = iMo767a;
            aVar.f39188e = iMo771e;
            if (i3 != 0) {
                aVar.f39184a = 0;
                aVar.f39184a = i3 | 0;
                if (aVar.m17023a()) {
                    return viewMo770d;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.f39183b;
                aVar2.f39184a = 0;
                aVar2.f39184a = i4 | 0;
                if (aVar2.m17023a()) {
                    view = viewMo770d;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public boolean m17022b(View view, int i) {
        a aVar = this.f39183b;
        int iMo768b = this.f39182a.mo768b();
        int iMo769c = this.f39182a.mo769c();
        int iMo767a = this.f39182a.mo767a(view);
        int iMo771e = this.f39182a.mo771e(view);
        aVar.f39185b = iMo768b;
        aVar.f39186c = iMo769c;
        aVar.f39187d = iMo767a;
        aVar.f39188e = iMo771e;
        if (i == 0) {
            return false;
        }
        a aVar2 = this.f39183b;
        aVar2.f39184a = 0;
        aVar2.f39184a = 0 | i;
        return aVar2.m17023a();
    }
}
