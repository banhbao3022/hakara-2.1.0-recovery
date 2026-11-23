package p007c.p056c.p057a.p068z.p070c;

import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieValueCallback;

/* JADX INFO: renamed from: c.c.a.z.c.a, reason: use source file name */
/* JADX INFO: compiled from: BaseKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: c */
    public final d<K> f2631c;

    /* JADX INFO: renamed from: e */
    public LottieValueCallback<A> f2633e;

    /* JADX INFO: renamed from: a */
    public final List<b> f2629a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f2630b = false;

    /* JADX INFO: renamed from: d */
    public float f2632d = 0.0f;

    /* JADX INFO: renamed from: f */
    public A f2634f = null;

    /* JADX INFO: renamed from: g */
    public float f2635g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f2636h = -1.0f;

    /* JADX INFO: renamed from: c.c.a.z.c.a$b */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1345a();
    }

    /* JADX INFO: renamed from: c.c.a.z.c.a$c */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class c<T> implements d<T> {
        public c(a aVar) {
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: a */
        public boolean mo1509a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: b */
        public Keyframe<T> mo1510b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: c */
        public boolean mo1511c(float f) {
            return false;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: d */
        public float mo1512d() {
            return 1.0f;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: e */
        public float mo1513e() {
            return 0.0f;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: renamed from: c.c.a.z.c.a$d */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface d<T> {
        /* JADX INFO: renamed from: a */
        boolean mo1509a(float f);

        /* JADX INFO: renamed from: b */
        Keyframe<T> mo1510b();

        /* JADX INFO: renamed from: c */
        boolean mo1511c(float f);

        /* JADX INFO: renamed from: d */
        float mo1512d();

        /* JADX INFO: renamed from: e */
        float mo1513e();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: c.c.a.z.c.a$e */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a */
        public final List<? extends Keyframe<T>> f2637a;

        /* JADX INFO: renamed from: c */
        public Keyframe<T> f2639c = null;

        /* JADX INFO: renamed from: d */
        public float f2640d = -1.0f;

        /* JADX INFO: renamed from: b */
        public Keyframe<T> f2638b = m1514f(0.0f);

        public e(List<? extends Keyframe<T>> list) {
            this.f2637a = list;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: a */
        public boolean mo1509a(float f) {
            Keyframe<T> keyframe = this.f2639c;
            Keyframe<T> keyframe2 = this.f2638b;
            if (keyframe == keyframe2 && this.f2640d == f) {
                return true;
            }
            this.f2639c = keyframe2;
            this.f2640d = f;
            return false;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: b */
        public Keyframe<T> mo1510b() {
            return this.f2638b;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: c */
        public boolean mo1511c(float f) {
            if (this.f2638b.m1448a(f)) {
                return !this.f2638b.m1451d();
            }
            this.f2638b = m1514f(f);
            return true;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: d */
        public float mo1512d() {
            List<? extends Keyframe<T>> list = this.f2637a;
            return list.get(list.size() - 1).m1449b();
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: e */
        public float mo1513e() {
            return this.f2637a.get(0).m1450c();
        }

        /* JADX INFO: renamed from: f */
        public final Keyframe<T> m1514f(float f) {
            List<? extends Keyframe<T>> list = this.f2637a;
            Keyframe<T> keyframe = list.get(list.size() - 1);
            if (f >= keyframe.m1450c()) {
                return keyframe;
            }
            for (int size = this.f2637a.size() - 2; size >= 1; size--) {
                Keyframe<T> keyframe2 = this.f2637a.get(size);
                if (this.f2638b != keyframe2 && keyframe2.m1448a(f)) {
                    return keyframe2;
                }
            }
            return this.f2637a.get(0);
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: renamed from: c.c.a.z.c.a$f */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a */
        public final Keyframe<T> f2641a;

        /* JADX INFO: renamed from: b */
        public float f2642b = -1.0f;

        public f(List<? extends Keyframe<T>> list) {
            this.f2641a = list.get(0);
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: a */
        public boolean mo1509a(float f) {
            if (this.f2642b == f) {
                return true;
            }
            this.f2642b = f;
            return false;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: b */
        public Keyframe<T> mo1510b() {
            return this.f2641a;
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: c */
        public boolean mo1511c(float f) {
            return !this.f2641a.m1451d();
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: d */
        public float mo1512d() {
            return this.f2641a.m1449b();
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        /* JADX INFO: renamed from: e */
        public float mo1513e() {
            return this.f2641a.m1450c();
        }

        @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.d
        public boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        d<K> fVar;
        if (list.isEmpty()) {
            fVar = new c<>(null);
        } else {
            fVar = list.size() == 1 ? new f<>(list) : new e<>(list);
        }
        this.f2631c = fVar;
    }

    /* JADX INFO: renamed from: a */
    public Keyframe<K> m1500a() {
        Keyframe<K> keyframeMo1510b = this.f2631c.mo1510b();
        L.m1365a("BaseKeyframeAnimation#getCurrentKeyframe");
        return keyframeMo1510b;
    }

    /* JADX INFO: renamed from: b */
    public float mo1501b() {
        if (this.f2636h == -1.0f) {
            this.f2636h = this.f2631c.mo1512d();
        }
        return this.f2636h;
    }

    /* JADX INFO: renamed from: c */
    public float m1502c() {
        Keyframe<K> keyframeM1500a = m1500a();
        if (keyframeM1500a.m1451d()) {
            return 0.0f;
        }
        return keyframeM1500a.f2361d.getInterpolation(m1503d());
    }

    /* JADX INFO: renamed from: d */
    public float m1503d() {
        if (this.f2630b) {
            return 0.0f;
        }
        Keyframe<K> keyframeM1500a = m1500a();
        if (keyframeM1500a.m1451d()) {
            return 0.0f;
        }
        return (this.f2632d - keyframeM1500a.m1450c()) / (keyframeM1500a.m1449b() - keyframeM1500a.m1450c());
    }

    /* JADX INFO: renamed from: e */
    public A mo1504e() {
        float fM1502c = m1502c();
        if (this.f2633e == null && this.f2631c.mo1509a(fM1502c)) {
            return this.f2634f;
        }
        A aMo1505f = mo1505f(m1500a(), fM1502c);
        this.f2634f = aMo1505f;
        return aMo1505f;
    }

    /* JADX INFO: renamed from: f */
    public abstract A mo1505f(Keyframe<K> keyframe, float f2);

    /* JADX INFO: renamed from: g */
    public void mo1506g() {
        for (int i = 0; i < this.f2629a.size(); i++) {
            this.f2629a.get(i).mo1345a();
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo1507h(float f2) {
        if (this.f2631c.isEmpty()) {
            return;
        }
        if (this.f2635g == -1.0f) {
            this.f2635g = this.f2631c.mo1513e();
        }
        float f3 = this.f2635g;
        if (f2 < f3) {
            if (f3 == -1.0f) {
                this.f2635g = this.f2631c.mo1513e();
            }
            f2 = this.f2635g;
        } else if (f2 > mo1501b()) {
            f2 = mo1501b();
        }
        if (f2 == this.f2632d) {
            return;
        }
        this.f2632d = f2;
        if (this.f2631c.mo1511c(f2)) {
            mo1506g();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1508i(LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.f2633e;
        this.f2633e = null;
    }
}
