package p636z0.p774z.p775b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.d0, reason: use source file name */
/* JADX INFO: compiled from: SimpleItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleItemAnimator extends RecyclerView.AbstractC0157j {

    /* JADX INFO: renamed from: g */
    public boolean f39156g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: a */
    public boolean mo687a(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0157j.c cVar, RecyclerView.AbstractC0157j.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.f1032a) == (i2 = cVar2.f1032a) && cVar.f1033b == cVar2.f1033b)) ? mo16992o(abstractC0149b0) : mo16994q(abstractC0149b0, i, cVar.f1033b, i2, cVar2.f1033b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: b */
    public boolean mo688b(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0149b0 abstractC0149b1, RecyclerView.AbstractC0157j.c cVar, RecyclerView.AbstractC0157j.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f1032a;
        int i4 = cVar.f1033b;
        if (abstractC0149b1.m659u()) {
            int i5 = cVar.f1032a;
            i2 = cVar.f1033b;
            i = i5;
        } else {
            i = cVar2.f1032a;
            i2 = cVar2.f1033b;
        }
        return mo16993p(abstractC0149b0, abstractC0149b1, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: c */
    public boolean mo689c(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0157j.c cVar, RecyclerView.AbstractC0157j.c cVar2) {
        int i = cVar.f1032a;
        int i2 = cVar.f1033b;
        View view = abstractC0149b0.f1003b;
        int left = cVar2 == null ? view.getLeft() : cVar2.f1032a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1033b;
        if (abstractC0149b0.m651m() || (i == left && i2 == top)) {
            return mo16995r(abstractC0149b0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo16994q(abstractC0149b0, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: d */
    public boolean mo690d(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0157j.c cVar, RecyclerView.AbstractC0157j.c cVar2) {
        int i = cVar.f1032a;
        int i2 = cVar2.f1032a;
        if (i != i2 || cVar.f1033b != cVar2.f1033b) {
            return mo16994q(abstractC0149b0, i, cVar.f1033b, i2, cVar2.f1033b);
        }
        m693h(abstractC0149b0);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0157j
    /* JADX INFO: renamed from: f */
    public boolean mo691f(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        return !this.f39156g || abstractC0149b0.m649k();
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo16992o(RecyclerView.AbstractC0149b0 abstractC0149b0);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo16993p(RecyclerView.AbstractC0149b0 abstractC0149b0, RecyclerView.AbstractC0149b0 abstractC0149b1, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo16994q(RecyclerView.AbstractC0149b0 abstractC0149b0, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: r */
    public abstract boolean mo16995r(RecyclerView.AbstractC0149b0 abstractC0149b0);
}
