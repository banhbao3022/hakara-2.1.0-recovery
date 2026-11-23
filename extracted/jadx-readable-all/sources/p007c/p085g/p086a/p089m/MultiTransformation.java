package p007c.p085g.p086a.p089m;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.l, reason: use source file name */
/* JADX INFO: compiled from: MultiTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public class MultiTransformation<T> implements Transformation<T> {

    /* JADX INFO: renamed from: b */
    public final Collection<? extends Transformation<T>> f3033b;

    @SafeVarargs
    public MultiTransformation(Transformation<T>... transformationArr) {
        if (transformationArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f3033b = Arrays.asList(transformationArr);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        Iterator<? extends Transformation<T>> it = this.f3033b.iterator();
        while (it.hasNext()) {
            it.next().mo1703a(messageDigest);
        }
    }

    @Override // p007c.p085g.p086a.p089m.Transformation
    /* JADX INFO: renamed from: b */
    public Resource2<T> mo1704b(Context context, Resource2<T> resource2, int i, int i2) {
        Iterator<? extends Transformation<T>> it = this.f3033b.iterator();
        Resource2<T> resource3 = resource2;
        while (it.hasNext()) {
            Resource2<T> resource2Mo1704b = it.next().mo1704b(context, resource3, i, i2);
            if (resource3 != null && !resource3.equals(resource2) && !resource3.equals(resource2Mo1704b)) {
                resource3.mo1830b();
            }
            resource3 = resource2Mo1704b;
        }
        return resource3;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (obj instanceof MultiTransformation) {
            return this.f3033b.equals(((MultiTransformation) obj).f3033b);
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return this.f3033b.hashCode();
    }

    public MultiTransformation(Collection<? extends Transformation<T>> collection) {
        if (!collection.isEmpty()) {
            this.f3033b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
