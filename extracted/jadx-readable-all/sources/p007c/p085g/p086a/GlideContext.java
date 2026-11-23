package p007c.p085g.p086a;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;
import p007c.p085g.p086a.p089m.p092t.Engine;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p108q.RequestListener;
import p007c.p085g.p086a.p108q.RequestOptions;
import p007c.p085g.p086a.p108q.p109h.ImageViewTargetFactory;

/* JADX INFO: renamed from: c.g.a.e, reason: use source file name */
/* JADX INFO: compiled from: GlideContext.java */
/* JADX INFO: loaded from: classes.dex */
public class GlideContext extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public static final TransitionOptions<?, ?> f2879a = new GenericTransitionOptions();

    /* JADX INFO: renamed from: b */
    public final ArrayPool f2880b;

    /* JADX INFO: renamed from: c */
    public final Registry f2881c;

    /* JADX INFO: renamed from: d */
    public final ImageViewTargetFactory f2882d;

    /* JADX INFO: renamed from: e */
    public final Glide.a f2883e;

    /* JADX INFO: renamed from: f */
    public final List<RequestListener<Object>> f2884f;

    /* JADX INFO: renamed from: g */
    public final Map<Class<?>, TransitionOptions<?, ?>> f2885g;

    /* JADX INFO: renamed from: h */
    public final Engine f2886h;

    /* JADX INFO: renamed from: i */
    public final boolean f2887i;

    /* JADX INFO: renamed from: j */
    public final int f2888j;

    /* JADX INFO: renamed from: k */
    public RequestOptions f2889k;

    public GlideContext(Context context, ArrayPool arrayPool, Registry registry, ImageViewTargetFactory imageViewTargetFactory, Glide.a aVar, Map<Class<?>, TransitionOptions<?, ?>> map, List<RequestListener<Object>> list, Engine engine, boolean z, int i) {
        super(context.getApplicationContext());
        this.f2880b = arrayPool;
        this.f2881c = registry;
        this.f2882d = imageViewTargetFactory;
        this.f2883e = aVar;
        this.f2884f = list;
        this.f2885g = map;
        this.f2886h = engine;
        this.f2887i = z;
        this.f2888j = i;
    }
}
