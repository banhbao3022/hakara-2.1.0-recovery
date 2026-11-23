package p477d1;

import java.io.Serializable;

/* JADX INFO: renamed from: d1.c, reason: use source file name */
/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Lazy2<T> implements Lazy3<T>, Serializable {

    /* JADX INFO: renamed from: f */
    public final T f29440f;

    public Lazy2(T t) {
        this.f29440f = t;
    }

    @Override // p477d1.Lazy3
    public T getValue() {
        return this.f29440f;
    }

    public String toString() {
        return String.valueOf(this.f29440f);
    }
}
