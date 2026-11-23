package p636z0.p637a.p639e.p640g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: z0.a.e.g.a, reason: use source file name */
/* JADX INFO: compiled from: ActivityResultContract.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* JADX INFO: renamed from: z0.a.e.g.a$a */
    /* JADX INFO: compiled from: ActivityResultContract.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        @SuppressLint({"UnknownNullness"})
        public final T f34195a;

        public a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f34195a = t;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Intent mo14498a(Context context, @SuppressLint({"UnknownNullness"}) I i);

    /* JADX INFO: renamed from: b */
    public a<O> mo14499b(Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public abstract O mo14500c(int i, Intent intent);
}
