package p007c.p085g.p086a;

import java.util.List;
import java.util.Map;
import p007c.p085g.p086a.p089m.p092t.Engine;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p092t.p094d0.DiskCache;
import p007c.p085g.p086a.p089m.p092t.p094d0.MemoryCache;
import p007c.p085g.p086a.p089m.p092t.p094d0.MemorySizeCalculator;
import p007c.p085g.p086a.p089m.p092t.p095e0.GlideExecutor;
import p007c.p085g.p086a.p105n.ConnectivityMonitorFactory;
import p007c.p085g.p086a.p105n.RequestManagerRetriever;
import p007c.p085g.p086a.p108q.RequestListener;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.g.a.d, reason: use source file name */
/* JADX INFO: compiled from: GlideBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class GlideBuilder {

    /* JADX INFO: renamed from: b */
    public Engine f2865b;

    /* JADX INFO: renamed from: c */
    public BitmapPool f2866c;

    /* JADX INFO: renamed from: d */
    public ArrayPool f2867d;

    /* JADX INFO: renamed from: e */
    public MemoryCache f2868e;

    /* JADX INFO: renamed from: f */
    public GlideExecutor f2869f;

    /* JADX INFO: renamed from: g */
    public GlideExecutor f2870g;

    /* JADX INFO: renamed from: h */
    public DiskCache.a f2871h;

    /* JADX INFO: renamed from: i */
    public MemorySizeCalculator f2872i;

    /* JADX INFO: renamed from: j */
    public ConnectivityMonitorFactory f2873j;

    /* JADX INFO: renamed from: m */
    public RequestManagerRetriever.b f2876m;

    /* JADX INFO: renamed from: n */
    public GlideExecutor f2877n;

    /* JADX INFO: renamed from: o */
    public List<RequestListener<Object>> f2878o;

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, TransitionOptions<?, ?>> f2864a = new ArrayMap();

    /* JADX INFO: renamed from: k */
    public int f2874k = 4;

    /* JADX INFO: renamed from: l */
    public Glide.a f2875l = new a(this);

    /* JADX INFO: renamed from: c.g.a.d$a */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public class a implements Glide.a {
        public a(GlideBuilder glideBuilder) {
        }
    }
}
