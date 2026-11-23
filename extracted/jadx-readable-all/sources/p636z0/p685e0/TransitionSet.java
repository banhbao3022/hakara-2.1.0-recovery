package p636z0.p685e0;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e0.o, reason: use source file name */
/* JADX INFO: compiled from: TransitionSet.java */
/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition3 {

    /* JADX INFO: renamed from: D */
    public ArrayList<Transition3> f36482D;

    /* JADX INFO: renamed from: E */
    public boolean f36483E;

    /* JADX INFO: renamed from: F */
    public int f36484F;

    /* JADX INFO: renamed from: G */
    public boolean f36485G;

    /* JADX INFO: renamed from: H */
    public int f36486H;

    /* JADX INFO: renamed from: z0.e0.o$a */
    /* JADX INFO: compiled from: TransitionSet.java */
    public class a extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Transition3 f36487a;

        public a(TransitionSet transitionSet, Transition3 transition3) {
            this.f36487a = transition3;
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            this.f36487a.mo15496E();
            transition3.mo15518z(this);
        }
    }

    /* JADX INFO: renamed from: z0.e0.o$b */
    /* JADX INFO: compiled from: TransitionSet.java */
    public static class b extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a */
        public TransitionSet f36488a;

        public b(TransitionSet transitionSet) {
            this.f36488a = transitionSet;
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: a */
        public void mo12473a(Transition3 transition3) {
            TransitionSet transitionSet = this.f36488a;
            if (transitionSet.f36485G) {
                return;
            }
            transitionSet.m15503M();
            this.f36488a.f36485G = true;
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            TransitionSet transitionSet = this.f36488a;
            int i = transitionSet.f36484F - 1;
            transitionSet.f36484F = i;
            if (i == 0) {
                transitionSet.f36485G = false;
                transitionSet.m15513p();
            }
            transition3.mo15518z(this);
        }
    }

    public TransitionSet() {
        this.f36482D = new ArrayList<>();
        this.f36483E = true;
        this.f36485G = false;
        this.f36486H = 0;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: A */
    public Transition3 mo15494A(View view) {
        for (int i = 0; i < this.f36482D.size(); i++) {
            this.f36482D.get(i).mo15494A(view);
        }
        this.f36454n.remove(view);
        return this;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: C */
    public void mo15495C(View view) {
        super.mo15495C(view);
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            this.f36482D.get(i).mo15495C(view);
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: E */
    public void mo15496E() {
        if (this.f36482D.isEmpty()) {
            m15503M();
            m15513p();
            return;
        }
        b bVar = new b(this);
        Iterator<Transition3> it = this.f36482D.iterator();
        while (it.hasNext()) {
            it.next().mo15505a(bVar);
        }
        this.f36484F = this.f36482D.size();
        if (this.f36483E) {
            Iterator<Transition3> it2 = this.f36482D.iterator();
            while (it2.hasNext()) {
                it2.next().mo15496E();
            }
            return;
        }
        for (int i = 1; i < this.f36482D.size(); i++) {
            this.f36482D.get(i - 1).mo15505a(new a(this, this.f36482D.get(i)));
        }
        Transition3 transition3 = this.f36482D.get(0);
        if (transition3 != null) {
            transition3.mo15496E();
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: F */
    public /* bridge */ /* synthetic */ Transition3 mo15497F(long j2) {
        m15526Q(j2);
        return this;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: G */
    public void mo15498G(Transition3.c cVar) {
        this.f36447B = cVar;
        this.f36486H |= 8;
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            this.f36482D.get(i).mo15498G(cVar);
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: I */
    public /* bridge */ /* synthetic */ Transition3 mo15499I(TimeInterpolator timeInterpolator) {
        m15527R(timeInterpolator);
        return this;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: J */
    public void mo15500J(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f36448C = Transition3.f36444g;
        } else {
            this.f36448C = pathMotion;
        }
        this.f36486H |= 4;
        if (this.f36482D != null) {
            for (int i = 0; i < this.f36482D.size(); i++) {
                this.f36482D.get(i).mo15500J(pathMotion);
            }
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: K */
    public void mo15501K(TransitionPropagation transitionPropagation) {
        this.f36446A = transitionPropagation;
        this.f36486H |= 2;
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            this.f36482D.get(i).mo15501K(transitionPropagation);
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: L */
    public Transition3 mo15502L(long j2) {
        this.f36450j = j2;
        return this;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: N */
    public String mo15504N(String str) {
        String strMo15504N = super.mo15504N(str);
        for (int i = 0; i < this.f36482D.size(); i++) {
            StringBuilder sbM1561L = outline.m1561L(strMo15504N, "\n");
            sbM1561L.append(this.f36482D.get(i).mo15504N(str + "  "));
            strMo15504N = sbM1561L.toString();
        }
        return strMo15504N;
    }

    /* JADX INFO: renamed from: O */
    public TransitionSet m15524O(Transition3 transition3) {
        this.f36482D.add(transition3);
        transition3.f36457q = this;
        long j2 = this.f36451k;
        if (j2 >= 0) {
            transition3.mo15497F(j2);
        }
        if ((this.f36486H & 1) != 0) {
            transition3.mo15499I(this.f36452l);
        }
        if ((this.f36486H & 2) != 0) {
            transition3.mo15501K(this.f36446A);
        }
        if ((this.f36486H & 4) != 0) {
            transition3.mo15500J(this.f36448C);
        }
        if ((this.f36486H & 8) != 0) {
            transition3.mo15498G(this.f36447B);
        }
        return this;
    }

    /* JADX INFO: renamed from: P */
    public Transition3 m15525P(int i) {
        if (i < 0 || i >= this.f36482D.size()) {
            return null;
        }
        return this.f36482D.get(i);
    }

    /* JADX INFO: renamed from: Q */
    public TransitionSet m15526Q(long j2) {
        ArrayList<Transition3> arrayList;
        this.f36451k = j2;
        if (j2 >= 0 && (arrayList = this.f36482D) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f36482D.get(i).mo15497F(j2);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: R */
    public TransitionSet m15527R(TimeInterpolator timeInterpolator) {
        this.f36486H |= 1;
        ArrayList<Transition3> arrayList = this.f36482D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f36482D.get(i).mo15499I(timeInterpolator);
            }
        }
        this.f36452l = timeInterpolator;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public TransitionSet m15528S(int i) {
        if (i == 0) {
            this.f36483E = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(outline.m1590l("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f36483E = false;
        }
        return this;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: a */
    public Transition3 mo15505a(Transition3.d dVar) {
        super.mo15505a(dVar);
        return this;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: b */
    public Transition3 mo15506b(View view) {
        for (int i = 0; i < this.f36482D.size(); i++) {
            this.f36482D.get(i).mo15506b(view);
        }
        this.f36454n.add(view);
        return this;
    }

    @Override // p636z0.p685e0.Transition3
    public void cancel() {
        super.cancel();
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            this.f36482D.get(i).cancel();
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: e */
    public void mo11341e(TransitionValues transitionValues) {
        if (m15516w(transitionValues.f36493b)) {
            for (Transition3 transition3 : this.f36482D) {
                if (transition3.m15516w(transitionValues.f36493b)) {
                    transition3.mo11341e(transitionValues);
                    transitionValues.f36494c.add(transition3);
                }
            }
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: i */
    public void mo15508i(TransitionValues transitionValues) {
        super.mo15508i(transitionValues);
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            this.f36482D.get(i).mo15508i(transitionValues);
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: j */
    public void mo11342j(TransitionValues transitionValues) {
        if (m15516w(transitionValues.f36493b)) {
            for (Transition3 transition3 : this.f36482D) {
                if (transition3.m15516w(transitionValues.f36493b)) {
                    transition3.mo11342j(transitionValues);
                    transitionValues.f36494c.add(transition3);
                }
            }
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: m */
    public Transition3 clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f36482D = new ArrayList<>();
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            Transition3 transition3Clone = this.f36482D.get(i).clone();
            transitionSet.f36482D.add(transition3Clone);
            transition3Clone.f36457q = transitionSet;
        }
        return transitionSet;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: o */
    public void mo15512o(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        long j2 = this.f36450j;
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            Transition3 transition3 = this.f36482D.get(i);
            if (j2 > 0 && (this.f36483E || i == 0)) {
                long j3 = transition3.f36450j;
                if (j3 > 0) {
                    transition3.mo15502L(j3 + j2);
                } else {
                    transition3.mo15502L(j2);
                }
            }
            transition3.mo15512o(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: y */
    public void mo15517y(View view) {
        super.mo15517y(view);
        int size = this.f36482D.size();
        for (int i = 0; i < size; i++) {
            this.f36482D.get(i).mo15517y(view);
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: z */
    public Transition3 mo15518z(Transition3.d dVar) {
        super.mo15518z(dVar);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36482D = new ArrayList<>();
        this.f36483E = true;
        this.f36485G = false;
        this.f36486H = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.f36442e);
        m15528S(C8162a.m16077v(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
