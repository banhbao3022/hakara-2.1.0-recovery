package p007c.p056c.p057a.p059b0.p060j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;

/* JADX INFO: renamed from: c.c.a.b0.j.n, reason: use source file name */
/* JADX INFO: compiled from: BaseAnimatableValue.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {

    /* JADX INFO: renamed from: a */
    public final List<Keyframe<V>> f2018a;

    public BaseAnimatableValue(V v) {
        this.f2018a = Collections.singletonList(new Keyframe(v));
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: b */
    public List<Keyframe<V>> mo1340b() {
        return this.f2018a;
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: c */
    public boolean mo1341c() {
        return this.f2018a.isEmpty() || (this.f2018a.size() == 1 && this.f2018a.get(0).m1451d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f2018a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f2018a.toArray()));
        }
        return sb.toString();
    }

    public BaseAnimatableValue(List<Keyframe<V>> list) {
        this.f2018a = list;
    }
}
