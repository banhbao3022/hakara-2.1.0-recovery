package p636z0.p637a.p639e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p637a.p639e.p640g.ActivityResultContract;
import p636z0.p725k.p726c.ActivityOptionsCompat;

/* JADX INFO: renamed from: z0.a.e.d, reason: use source file name */
/* JADX INFO: compiled from: ActivityResultRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a */
    public Random f34173a = new Random();

    /* JADX INFO: renamed from: b */
    public final Map<Integer, String> f34174b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Integer> f34175c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<String, c> f34176d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f34177e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final transient Map<String, b<?>> f34178f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> f34179g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Bundle f34180h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: z0.a.e.d$a */
    /* JADX INFO: compiled from: ActivityResultRegistry.java */
    public class a<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f34181a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34182b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ActivityResultContract f34183c;

        public a(String str, int i, ActivityResultContract activityResultContract) {
            this.f34181a = str;
            this.f34182b = i;
            this.f34183c = activityResultContract;
        }

        @Override // p636z0.p637a.p639e.ActivityResultLauncher
        /* JADX INFO: renamed from: a */
        public void mo14493a(I i, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultRegistry.this.f34177e.add(this.f34181a);
            ActivityResultRegistry.this.mo131b(this.f34182b, this.f34183c, i, null);
        }

        @Override // p636z0.p637a.p639e.ActivityResultLauncher
        /* JADX INFO: renamed from: b */
        public void mo14494b() {
            ActivityResultRegistry.this.m14497d(this.f34181a);
        }
    }

    /* JADX INFO: renamed from: z0.a.e.d$b */
    /* JADX INFO: compiled from: ActivityResultRegistry.java */
    public static class b<O> {

        /* JADX INFO: renamed from: a */
        public final ActivityResultCallback<O> f34185a;

        /* JADX INFO: renamed from: b */
        public final ActivityResultContract<?, O> f34186b;

        public b(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            this.f34185a = activityResultCallback;
            this.f34186b = activityResultContract;
        }
    }

    /* JADX INFO: renamed from: z0.a.e.d$c */
    /* JADX INFO: compiled from: ActivityResultRegistry.java */
    public static class c {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14495a(int i, int i2, Intent intent) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.f34174b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f34177e.remove(str);
        b<?> bVar = this.f34178f.get(str);
        if (bVar != null && (activityResultCallback = bVar.f34185a) != null) {
            activityResultCallback.mo14492a(bVar.f34186b.mo14500c(i2, intent));
            return true;
        }
        this.f34179g.remove(str);
        this.f34180h.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract <I, O> void mo131b(int i, ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i2, ActivityOptionsCompat activityOptionsCompat);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final <I, O> ActivityResultLauncher<I> m14496c(String str, ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        int iIntValue;
        Integer num = this.f34175c.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iNextInt = this.f34173a.nextInt(2147418112);
            while (true) {
                iIntValue = iNextInt + 65536;
                if (!this.f34174b.containsKey(Integer.valueOf(iIntValue))) {
                    break;
                }
                iNextInt = this.f34173a.nextInt(2147418112);
            }
            this.f34174b.put(Integer.valueOf(iIntValue), str);
            this.f34175c.put(str, Integer.valueOf(iIntValue));
        }
        this.f34178f.put(str, new b<>(activityResultCallback, activityResultContract));
        if (this.f34179g.containsKey(str)) {
            Object obj = this.f34179g.get(str);
            this.f34179g.remove(str);
            activityResultCallback.mo14492a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f34180h.getParcelable(str);
        if (activityResult != null) {
            this.f34180h.remove(str);
            activityResultCallback.mo14492a(activityResultContract.mo14500c(activityResult.f34171f, activityResult.f34172g));
        }
        return new a(str, iIntValue, activityResultContract);
    }

    /* JADX INFO: renamed from: d */
    public final void m14497d(String str) {
        Integer numRemove;
        if (!this.f34177e.contains(str) && (numRemove = this.f34175c.remove(str)) != null) {
            this.f34174b.remove(numRemove);
        }
        this.f34178f.remove(str);
        if (this.f34179g.containsKey(str)) {
            StringBuilder sbM1562M = outline.m1562M("Dropping pending result for request ", str, ": ");
            sbM1562M.append(this.f34179g.get(str));
            Log.w("ActivityResultRegistry", sbM1562M.toString());
            this.f34179g.remove(str);
        }
        if (this.f34180h.containsKey(str)) {
            StringBuilder sbM1562M2 = outline.m1562M("Dropping pending result for request ", str, ": ");
            sbM1562M2.append(this.f34180h.getParcelable(str));
            Log.w("ActivityResultRegistry", sbM1562M2.toString());
            this.f34180h.remove(str);
        }
        if (this.f34176d.get(str) != null) {
            throw null;
        }
    }
}
