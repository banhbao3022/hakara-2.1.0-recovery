package p636z0.p752p.p753c;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p735h.CancellationSignal;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.p.c.x0, reason: use source file name */
/* JADX INFO: compiled from: SpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f38573a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<d> f38574b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<d> f38575c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public boolean f38576d = false;

    /* JADX INFO: renamed from: e */
    public boolean f38577e = false;

    /* JADX INFO: renamed from: z0.p.c.x0$a */
    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ c f38578f;

        public a(c cVar) {
            this.f38578f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SpecialEffectsController.this.f38574b.contains(this.f38578f)) {
                c cVar = this.f38578f;
                cVar.f38583a.m16632f(cVar.f38585c.f38416M);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.x0$b */
    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ c f38580f;

        public b(c cVar) {
            this.f38580f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            SpecialEffectsController.this.f38574b.remove(this.f38580f);
            SpecialEffectsController.this.f38575c.remove(this.f38580f);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.x0$c */
    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public static class c extends d {

        /* JADX INFO: renamed from: h */
        public final FragmentStateManager f38582h;

        public c(d.c cVar, d.b bVar, FragmentStateManager fragmentStateManager, CancellationSignal cancellationSignal) {
            super(cVar, bVar, fragmentStateManager.f38341c, cancellationSignal);
            this.f38582h = fragmentStateManager;
        }

        @Override // p636z0.p752p.p753c.SpecialEffectsController.d
        /* JADX INFO: renamed from: b */
        public void mo16626b() {
            super.mo16626b();
            this.f38582h.m16485k();
        }

        @Override // p636z0.p752p.p753c.SpecialEffectsController.d
        /* JADX INFO: renamed from: d */
        public void mo16627d() {
            if (this.f38584b == d.b.ADDING) {
                Fragment fragment = this.f38582h.f38341c;
                View viewFindFocus = fragment.f38416M.findFocus();
                if (viewFindFocus != null) {
                    fragment.m16567r().f38467o = viewFindFocus;
                    if (FragmentManager.m16647O(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                View viewM16530H0 = this.f38585c.m16530H0();
                if (viewM16530H0.getParent() == null) {
                    this.f38582h.m16476b();
                    viewM16530H0.setAlpha(0.0f);
                }
                if (viewM16530H0.getAlpha() == 0.0f && viewM16530H0.getVisibility() == 0) {
                    viewM16530H0.setVisibility(4);
                }
                Fragment.b bVar = fragment.f38419P;
                viewM16530H0.setAlpha(bVar == null ? 1.0f : bVar.f38466n);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.x0$d */
    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public c f38583a;

        /* JADX INFO: renamed from: b */
        public b f38584b;

        /* JADX INFO: renamed from: c */
        public final Fragment f38585c;

        /* JADX INFO: renamed from: d */
        public final List<Runnable> f38586d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final HashSet<CancellationSignal> f38587e = new HashSet<>();

        /* JADX INFO: renamed from: f */
        public boolean f38588f = false;

        /* JADX INFO: renamed from: g */
        public boolean f38589g = false;

        /* JADX INFO: renamed from: z0.p.c.x0$d$a */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        public class a implements CancellationSignal.a {
            public a() {
            }

            @Override // p636z0.p725k.p735h.CancellationSignal.a
            /* JADX INFO: renamed from: b */
            public void mo15489b() {
                d.this.m16628a();
            }
        }

        /* JADX INFO: renamed from: z0.p.c.x0$d$b */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: renamed from: z0.p.c.x0$d$c */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: renamed from: h */
            public static c m16630h(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(outline.m1590l("Unknown visibility ", i));
            }

            /* JADX INFO: renamed from: j */
            public static c m16631j(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m16630h(view.getVisibility());
            }

            /* JADX INFO: renamed from: f */
            public void m16632f(View view) {
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m16647O(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (FragmentManager.m16647O(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (FragmentManager.m16647O(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (FragmentManager.m16647O(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public d(c cVar, b bVar, Fragment fragment, CancellationSignal cancellationSignal) {
            this.f38583a = cVar;
            this.f38584b = bVar;
            this.f38585c = fragment;
            cancellationSignal.m16202b(new a());
        }

        /* JADX INFO: renamed from: a */
        public final void m16628a() {
            if (this.f38588f) {
                return;
            }
            this.f38588f = true;
            if (this.f38587e.isEmpty()) {
                mo16626b();
                return;
            }
            Iterator it = new ArrayList(this.f38587e).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).m16201a();
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo16626b() {
            if (this.f38589g) {
                return;
            }
            if (FragmentManager.m16647O(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f38589g = true;
            Iterator<Runnable> it = this.f38586d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m16629c(c cVar, b bVar) {
            c cVar2 = c.REMOVED;
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 0) {
                if (this.f38583a != cVar2) {
                    if (FragmentManager.m16647O(2)) {
                        StringBuilder sbM1556G = outline.m1556G("SpecialEffectsController: For fragment ");
                        sbM1556G.append(this.f38585c);
                        sbM1556G.append(" mFinalState = ");
                        sbM1556G.append(this.f38583a);
                        sbM1556G.append(" -> ");
                        sbM1556G.append(cVar);
                        sbM1556G.append(". ");
                        Log.v("FragmentManager", sbM1556G.toString());
                    }
                    this.f38583a = cVar;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f38583a == cVar2) {
                    if (FragmentManager.m16647O(2)) {
                        StringBuilder sbM1556G2 = outline.m1556G("SpecialEffectsController: For fragment ");
                        sbM1556G2.append(this.f38585c);
                        sbM1556G2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sbM1556G2.append(this.f38584b);
                        sbM1556G2.append(" to ADDING.");
                        Log.v("FragmentManager", sbM1556G2.toString());
                    }
                    this.f38583a = c.VISIBLE;
                    this.f38584b = b.ADDING;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (FragmentManager.m16647O(2)) {
                StringBuilder sbM1556G3 = outline.m1556G("SpecialEffectsController: For fragment ");
                sbM1556G3.append(this.f38585c);
                sbM1556G3.append(" mFinalState = ");
                sbM1556G3.append(this.f38583a);
                sbM1556G3.append(" -> REMOVED. mLifecycleImpact  = ");
                sbM1556G3.append(this.f38584b);
                sbM1556G3.append(" to REMOVING.");
                Log.v("FragmentManager", sbM1556G3.toString());
            }
            this.f38583a = cVar2;
            this.f38584b = b.REMOVING;
        }

        /* JADX INFO: renamed from: d */
        public void mo16627d() {
        }

        public String toString() {
            StringBuilder sbM1561L = outline.m1561L("Operation ", "{");
            sbM1561L.append(Integer.toHexString(System.identityHashCode(this)));
            sbM1561L.append("} ");
            sbM1561L.append("{");
            sbM1561L.append("mFinalState = ");
            sbM1561L.append(this.f38583a);
            sbM1561L.append("} ");
            sbM1561L.append("{");
            sbM1561L.append("mLifecycleImpact = ");
            sbM1561L.append(this.f38584b);
            sbM1561L.append("} ");
            sbM1561L.append("{");
            sbM1561L.append("mFragment = ");
            sbM1561L.append(this.f38585c);
            sbM1561L.append("}");
            return sbM1561L.toString();
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f38573a = viewGroup;
    }

    /* JADX INFO: renamed from: f */
    public static SpecialEffectsController m16618f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m16619g(viewGroup, fragmentManager.m16660M());
    }

    /* JADX INFO: renamed from: g */
    public static SpecialEffectsController m16619g(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        Objects.requireNonNull((FragmentManager.f) specialEffectsControllerFactory);
        DefaultSpecialEffectsController defaultSpecialEffectsController = new DefaultSpecialEffectsController(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsController);
        return defaultSpecialEffectsController;
    }

    /* JADX INFO: renamed from: a */
    public final void m16620a(d.c cVar, d.b bVar, FragmentStateManager fragmentStateManager) {
        synchronized (this.f38574b) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            d dVarM16622d = m16622d(fragmentStateManager.f38341c);
            if (dVarM16622d != null) {
                dVarM16622d.m16629c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, fragmentStateManager, cancellationSignal);
            this.f38574b.add(cVar2);
            cVar2.f38586d.add(new a(cVar2));
            cVar2.f38586d.add(new b(cVar2));
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo16461b(List<d> list, boolean z);

    /* JADX INFO: renamed from: c */
    public void m16621c() {
        if (this.f38577e) {
            return;
        }
        ViewGroup viewGroup = this.f38573a;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!viewGroup.isAttachedToWindow()) {
            m16623e();
            this.f38576d = false;
            return;
        }
        synchronized (this.f38574b) {
            if (!this.f38574b.isEmpty()) {
                ArrayList<d> arrayList = new ArrayList(this.f38575c);
                this.f38575c.clear();
                for (d dVar : arrayList) {
                    if (FragmentManager.m16647O(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                    }
                    dVar.m16628a();
                    if (!dVar.f38589g) {
                        this.f38575c.add(dVar);
                    }
                }
                m16625i();
                ArrayList arrayList2 = new ArrayList(this.f38574b);
                this.f38574b.clear();
                this.f38575c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).mo16627d();
                }
                mo16461b(arrayList2, this.f38576d);
                this.f38576d = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final d m16622d(Fragment fragment) {
        for (d dVar : this.f38574b) {
            if (dVar.f38585c.equals(fragment) && !dVar.f38588f) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m16623e() {
        ViewGroup viewGroup = this.f38573a;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f38574b) {
            m16625i();
            Iterator<d> it = this.f38574b.iterator();
            while (it.hasNext()) {
                it.next().mo16627d();
            }
            for (d dVar : new ArrayList(this.f38575c)) {
                if (FragmentManager.m16647O(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zIsAttachedToWindow ? "" : "Container " + this.f38573a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dVar.m16628a();
            }
            for (d dVar2 : new ArrayList(this.f38574b)) {
                if (FragmentManager.m16647O(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zIsAttachedToWindow ? "" : "Container " + this.f38573a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar2.m16628a();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m16624h() {
        synchronized (this.f38574b) {
            m16625i();
            this.f38577e = false;
            for (int size = this.f38574b.size() - 1; size >= 0; size--) {
                d dVar = this.f38574b.get(size);
                d.c cVarM16631j = d.c.m16631j(dVar.f38585c.f38416M);
                d.c cVar = dVar.f38583a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && cVarM16631j != cVar2) {
                    this.f38577e = dVar.f38585c.m16554U();
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16625i() {
        for (d dVar : this.f38574b) {
            if (dVar.f38584b == d.b.ADDING) {
                dVar.m16629c(d.c.m16630h(dVar.f38585c.m16530H0().getVisibility()), d.b.NONE);
            }
        }
    }
}
