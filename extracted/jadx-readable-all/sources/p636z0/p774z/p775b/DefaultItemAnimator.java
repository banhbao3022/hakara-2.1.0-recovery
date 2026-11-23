package p636z0.p774z.p775b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.z.b.h, reason: use source file name */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* JADX INFO: renamed from: h */
    public static TimeInterpolator f39189h;

    /* JADX INFO: renamed from: i */
    public ArrayList<RecyclerView.AbstractC0149b0> f39190i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public ArrayList<RecyclerView.AbstractC0149b0> f39191j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public ArrayList<e> f39192k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public ArrayList<d> f39193l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public ArrayList<ArrayList<RecyclerView.AbstractC0149b0>> f39194m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public ArrayList<ArrayList<e>> f39195n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public ArrayList<ArrayList<d>> f39196o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public ArrayList<RecyclerView.AbstractC0149b0> f39197p = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public ArrayList<RecyclerView.AbstractC0149b0> f39198q = new ArrayList<>();

    /* JADX INFO: renamed from: r */
    public ArrayList<RecyclerView.AbstractC0149b0> f39199r = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    public ArrayList<RecyclerView.AbstractC0149b0> f39200s = new ArrayList<>();

    /* JADX INFO: renamed from: z0.z.b.h$a */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f39201f;

        public a(ArrayList arrayList) {
            this.f39201f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : this.f39201f) {
                DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                RecyclerView.AbstractC0149b0 abstractC0149b0 = eVar.f39213a;
                int i = eVar.f39214b;
                int i2 = eVar.f39215c;
                int i3 = eVar.f39216d;
                int i4 = eVar.f39217e;
                Objects.requireNonNull(defaultItemAnimator);
                View view = abstractC0149b0.f1003b;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                defaultItemAnimator.f39198q.add(abstractC0149b0);
                viewPropertyAnimatorAnimate.setDuration(defaultItemAnimator.f1030e).setListener(new DefaultItemAnimator4(defaultItemAnimator, abstractC0149b0, i5, view, i6, viewPropertyAnimatorAnimate)).start();
            }
            this.f39201f.clear();
            DefaultItemAnimator.this.f39195n.remove(this.f39201f);
        }
    }

    /* JADX INFO: renamed from: z0.z.b.h$b */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f39203f;

        public b(ArrayList arrayList) {
            this.f39203f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (d dVar : this.f39203f) {
                DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                Objects.requireNonNull(defaultItemAnimator);
                RecyclerView.AbstractC0149b0 abstractC0149b0 = dVar.f39207a;
                View view = abstractC0149b0 == null ? null : abstractC0149b0.f1003b;
                RecyclerView.AbstractC0149b0 abstractC0149b1 = dVar.f39208b;
                View view2 = abstractC0149b1 != null ? abstractC0149b1.f1003b : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(defaultItemAnimator.f1031f);
                    defaultItemAnimator.f39200s.add(dVar.f39207a);
                    duration.translationX(dVar.f39211e - dVar.f39209c);
                    duration.translationY(dVar.f39212f - dVar.f39210d);
                    duration.alpha(0.0f).setListener(new DefaultItemAnimator5(defaultItemAnimator, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    defaultItemAnimator.f39200s.add(dVar.f39208b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(defaultItemAnimator.f1031f).alpha(1.0f).setListener(new DefaultItemAnimator6(defaultItemAnimator, dVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
            this.f39203f.clear();
            DefaultItemAnimator.this.f39196o.remove(this.f39203f);
        }
    }

    /* JADX INFO: renamed from: z0.z.b.h$c */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f39205f;

        public c(ArrayList arrayList) {
            this.f39205f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (RecyclerView.AbstractC0149b0 abstractC0149b0 : this.f39205f) {
                DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                Objects.requireNonNull(defaultItemAnimator);
                View view = abstractC0149b0.f1003b;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                defaultItemAnimator.f39197p.add(abstractC0149b0);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(defaultItemAnimator.f1028c).setListener(new DefaultItemAnimator3(defaultItemAnimator, abstractC0149b0, view, viewPropertyAnimatorAnimate)).start();
            }
            this.f39205f.clear();
            DefaultItemAnimator.this.f39194m.remove(this.f39205f);
        }
    }

    /* JADX INFO: renamed from: z0.z.b.h$d */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0149b0 f39207a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0149b0 f39208b;

        /* JADX INFO: renamed from: c */
        public int f39209c;

        /* JADX INFO: renamed from: d */
        public int f39210d;

        /* JADX INFO: renamed from: e */
        public int f39211e;

        /* JADX INFO: renamed from: f */
        public int f39212f;

        public d(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0149b0 abstractC0149b1, int i, int i2, int i3, int i4) {
            this.f39207a = abstractC0149b0;
            this.f39208b = abstractC0149b1;
            this.f39209c = i;
            this.f39210d = i2;
            this.f39211e = i3;
            this.f39212f = i4;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("ChangeInfo{oldHolder=");
            sbM1556G.append(this.f39207a);
            sbM1556G.append(", newHolder=");
            sbM1556G.append(this.f39208b);
            sbM1556G.append(", fromX=");
            sbM1556G.append(this.f39209c);
            sbM1556G.append(", fromY=");
            sbM1556G.append(this.f39210d);
            sbM1556G.append(", toX=");
            sbM1556G.append(this.f39211e);
            sbM1556G.append(", toY=");
            sbM1556G.append(this.f39212f);
            sbM1556G.append('}');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: z0.z.b.h$e */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public static class e {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0149b0 f39213a;

        /* JADX INFO: renamed from: b */
        public int f39214b;

        /* JADX INFO: renamed from: c */
        public int f39215c;

        /* JADX INFO: renamed from: d */
        public int f39216d;

        /* JADX INFO: renamed from: e */
        public int f39217e;

        public e(RecyclerView.AbstractC0149b0 abstractC0149b0, int i, int i2, int i3, int i4) {
            this.f39213a = abstractC0149b0;
            this.f39214b = i;
            this.f39215c = i2;
            this.f39216d = i3;
            this.f39217e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: g */
    public boolean mo692g(RecyclerView.AbstractC0149b0 abstractC0149b0, List<Object> list) {
        return !list.isEmpty() || mo691f(abstractC0149b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: j */
    public void mo695j(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        View view = abstractC0149b0.f1003b;
        view.animate().cancel();
        int size = this.f39192k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f39192k.get(size).f39213a == abstractC0149b0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m693h(abstractC0149b0);
                this.f39192k.remove(size);
            }
        }
        m17027u(this.f39193l, abstractC0149b0);
        if (this.f39190i.remove(abstractC0149b0)) {
            view.setAlpha(1.0f);
            m693h(abstractC0149b0);
        }
        if (this.f39191j.remove(abstractC0149b0)) {
            view.setAlpha(1.0f);
            m693h(abstractC0149b0);
        }
        int size2 = this.f39196o.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList = this.f39196o.get(size2);
            m17027u(arrayList, abstractC0149b0);
            if (arrayList.isEmpty()) {
                this.f39196o.remove(size2);
            }
        }
        int size3 = this.f39195n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList2 = this.f39195n.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f39213a == abstractC0149b0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m693h(abstractC0149b0);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f39195n.remove(size3);
                    break;
                }
            }
        }
        int size5 = this.f39194m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f39199r.remove(abstractC0149b0);
                this.f39197p.remove(abstractC0149b0);
                this.f39200s.remove(abstractC0149b0);
                this.f39198q.remove(abstractC0149b0);
                m17026t();
                return;
            }
            ArrayList<RecyclerView.AbstractC0149b0> arrayList3 = this.f39194m.get(size5);
            if (arrayList3.remove(abstractC0149b0)) {
                view.setAlpha(1.0f);
                m693h(abstractC0149b0);
                if (arrayList3.isEmpty()) {
                    this.f39194m.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: k */
    public void mo696k() {
        int size = this.f39192k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = this.f39192k.get(size);
            View view = eVar.f39213a.f1003b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m693h(eVar.f39213a);
            this.f39192k.remove(size);
        }
        int size2 = this.f39190i.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m693h(this.f39190i.get(size2));
            this.f39190i.remove(size2);
        }
        int size3 = this.f39191j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0149b0 abstractC0149b0 = this.f39191j.get(size3);
            abstractC0149b0.f1003b.setAlpha(1.0f);
            m693h(abstractC0149b0);
            this.f39191j.remove(size3);
        }
        int size4 = this.f39193l.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = this.f39193l.get(size4);
            RecyclerView.AbstractC0149b0 abstractC0149b1 = dVar.f39207a;
            if (abstractC0149b1 != null) {
                m17028v(dVar, abstractC0149b1);
            }
            RecyclerView.AbstractC0149b0 abstractC0149b2 = dVar.f39208b;
            if (abstractC0149b2 != null) {
                m17028v(dVar, abstractC0149b2);
            }
        }
        this.f39193l.clear();
        if (!mo697l()) {
            return;
        }
        int size5 = this.f39195n.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList = this.f39195n.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar2 = arrayList.get(size6);
                    View view2 = eVar2.f39213a.f1003b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m693h(eVar2.f39213a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f39195n.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f39194m.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.AbstractC0149b0> arrayList2 = this.f39194m.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.AbstractC0149b0 abstractC0149b3 = arrayList2.get(size8);
                    abstractC0149b3.f1003b.setAlpha(1.0f);
                    m693h(abstractC0149b3);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f39194m.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f39196o.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                m17025s(this.f39199r);
                m17025s(this.f39198q);
                m17025s(this.f39197p);
                m17025s(this.f39200s);
                m694i();
                return;
            }
            ArrayList<d> arrayList3 = this.f39196o.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    d dVar2 = arrayList3.get(size10);
                    RecyclerView.AbstractC0149b0 abstractC0149b4 = dVar2.f39207a;
                    if (abstractC0149b4 != null) {
                        m17028v(dVar2, abstractC0149b4);
                    }
                    RecyclerView.AbstractC0149b0 abstractC0149b5 = dVar2.f39208b;
                    if (abstractC0149b5 != null) {
                        m17028v(dVar2, abstractC0149b5);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f39196o.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: l */
    public boolean mo697l() {
        return (this.f39191j.isEmpty() && this.f39193l.isEmpty() && this.f39192k.isEmpty() && this.f39190i.isEmpty() && this.f39198q.isEmpty() && this.f39199r.isEmpty() && this.f39197p.isEmpty() && this.f39200s.isEmpty() && this.f39195n.isEmpty() && this.f39194m.isEmpty() && this.f39196o.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: n */
    public void mo699n() {
        boolean z = !this.f39190i.isEmpty();
        boolean z2 = !this.f39192k.isEmpty();
        boolean z3 = !this.f39193l.isEmpty();
        boolean z4 = !this.f39191j.isEmpty();
        if (z || z2 || z4 || z3) {
            for (RecyclerView.AbstractC0149b0 abstractC0149b0 : this.f39190i) {
                View view = abstractC0149b0.f1003b;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f39199r.add(abstractC0149b0);
                viewPropertyAnimatorAnimate.setDuration(this.f1029d).alpha(0.0f).setListener(new DefaultItemAnimator2(this, abstractC0149b0, viewPropertyAnimatorAnimate, view)).start();
            }
            this.f39190i.clear();
            if (z2) {
                ArrayList<e> arrayList = new ArrayList<>();
                arrayList.addAll(this.f39192k);
                this.f39195n.add(arrayList);
                this.f39192k.clear();
                a aVar = new a(arrayList);
                if (z) {
                    View view2 = arrayList.get(0).f39213a.f1003b;
                    long j2 = this.f1029d;
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    view2.postOnAnimationDelayed(aVar, j2);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<d> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f39193l);
                this.f39196o.add(arrayList2);
                this.f39193l.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    View view3 = arrayList2.get(0).f39207a.f1003b;
                    long j3 = this.f1029d;
                    AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                    view3.postOnAnimationDelayed(bVar, j3);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC0149b0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f39191j);
                this.f39194m.add(arrayList3);
                this.f39191j.clear();
                c cVar = new c(arrayList3);
                if (!z && !z2 && !z3) {
                    cVar.run();
                    return;
                }
                long jMax = Math.max(z2 ? this.f1030e : 0L, z3 ? this.f1031f : 0L) + (z ? this.f1029d : 0L);
                View view4 = arrayList3.get(0).f1003b;
                AtomicInteger atomicInteger3 = ViewCompat.f38073a;
                view4.postOnAnimationDelayed(cVar, jMax);
            }
        }
    }

    @Override // p636z0.p774z.p775b.SimpleItemAnimator
    /* JADX INFO: renamed from: o */
    public boolean mo16992o(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        m17029w(abstractC0149b0);
        abstractC0149b0.f1003b.setAlpha(0.0f);
        this.f39191j.add(abstractC0149b0);
        return true;
    }

    @Override // p636z0.p774z.p775b.SimpleItemAnimator
    /* JADX INFO: renamed from: p */
    public boolean mo16993p(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0149b0 abstractC0149b1, int i, int i2, int i3, int i4) {
        if (abstractC0149b0 == abstractC0149b1) {
            return mo16994q(abstractC0149b0, i, i2, i3, i4);
        }
        float translationX = abstractC0149b0.f1003b.getTranslationX();
        float translationY = abstractC0149b0.f1003b.getTranslationY();
        float alpha = abstractC0149b0.f1003b.getAlpha();
        m17029w(abstractC0149b0);
        abstractC0149b0.f1003b.setTranslationX(translationX);
        abstractC0149b0.f1003b.setTranslationY(translationY);
        abstractC0149b0.f1003b.setAlpha(alpha);
        m17029w(abstractC0149b1);
        abstractC0149b1.f1003b.setTranslationX(-((int) ((i3 - i) - translationX)));
        abstractC0149b1.f1003b.setTranslationY(-((int) ((i4 - i2) - translationY)));
        abstractC0149b1.f1003b.setAlpha(0.0f);
        this.f39193l.add(new d(abstractC0149b0, abstractC0149b1, i, i2, i3, i4));
        return true;
    }

    @Override // p636z0.p774z.p775b.SimpleItemAnimator
    /* JADX INFO: renamed from: q */
    public boolean mo16994q(RecyclerView.AbstractC0149b0 abstractC0149b0, int i, int i2, int i3, int i4) {
        View view = abstractC0149b0.f1003b;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0149b0.f1003b.getTranslationY());
        m17029w(abstractC0149b0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m693h(abstractC0149b0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f39192k.add(new e(abstractC0149b0, translationX, translationY, i3, i4));
        return true;
    }

    @Override // p636z0.p774z.p775b.SimpleItemAnimator
    /* JADX INFO: renamed from: r */
    public boolean mo16995r(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        m17029w(abstractC0149b0);
        this.f39190i.add(abstractC0149b0);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m17025s(List<RecyclerView.AbstractC0149b0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).f1003b.animate().cancel();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m17026t() {
        if (mo697l()) {
            return;
        }
        m694i();
    }

    /* JADX INFO: renamed from: u */
    public final void m17027u(List<d> list, RecyclerView.AbstractC0149b0 abstractC0149b0) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = list.get(size);
            if (m17028v(dVar, abstractC0149b0) && dVar.f39207a == null && dVar.f39208b == null) {
                list.remove(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m17028v(d dVar, RecyclerView.AbstractC0149b0 abstractC0149b0) {
        if (dVar.f39208b == abstractC0149b0) {
            dVar.f39208b = null;
        } else {
            if (dVar.f39207a != abstractC0149b0) {
                return false;
            }
            dVar.f39207a = null;
        }
        abstractC0149b0.f1003b.setAlpha(1.0f);
        abstractC0149b0.f1003b.setTranslationX(0.0f);
        abstractC0149b0.f1003b.setTranslationY(0.0f);
        m693h(abstractC0149b0);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m17029w(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        if (f39189h == null) {
            f39189h = new ValueAnimator().getInterpolator();
        }
        abstractC0149b0.f1003b.animate().setInterpolator(f39189h);
        mo695j(abstractC0149b0);
    }
}
