package p007c.p085g.p086a.p089m.p092t.p093c0;

import java.util.ArrayDeque;
import java.util.Queue;
import p007c.p085g.p086a.p089m.p092t.p093c0.Poolable;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.t.c0.c, reason: use source file name */
/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseKeyPool<T extends Poolable> {

    /* JADX INFO: renamed from: a */
    public final Queue<T> f3104a;

    public BaseKeyPool() {
        char[] cArr = Util4.f3828a;
        this.f3104a = new ArrayDeque(20);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo1746a();

    /* JADX INFO: renamed from: b */
    public T m1747b() {
        T tPoll = this.f3104a.poll();
        return tPoll == null ? (T) mo1746a() : tPoll;
    }

    /* JADX INFO: renamed from: c */
    public void m1748c(T t) {
        if (this.f3104a.size() < 20) {
            this.f3104a.offer(t);
        }
    }
}
