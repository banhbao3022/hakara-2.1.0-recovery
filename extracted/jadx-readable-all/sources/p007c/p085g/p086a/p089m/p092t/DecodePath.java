package p007c.p085g.p086a.p089m.p092t;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Registry;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.EncodeStrategy;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.ResourceEncoder;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p090s.DataRewinder;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p098v.p104i.ResourceTranscoder;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.t.j, reason: use source file name */
/* JADX INFO: compiled from: DecodePath.java */
/* JADX INFO: loaded from: classes.dex */
public class DecodePath<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final Class<DataType> f3269a;

    /* JADX INFO: renamed from: b */
    public final List<? extends ResourceDecoder<DataType, ResourceType>> f3270b;

    /* JADX INFO: renamed from: c */
    public final ResourceTranscoder<ResourceType, Transcode> f3271c;

    /* JADX INFO: renamed from: d */
    public final Pools2<List<Throwable>> f3272d;

    /* JADX INFO: renamed from: e */
    public final String f3273e;

    /* JADX INFO: renamed from: c.g.a.m.t.j$a */
    /* JADX INFO: compiled from: DecodePath.java */
    public interface a<ResourceType> {
    }

    public DecodePath(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> resourceTranscoder, Pools2<List<Throwable>> pools2) {
        this.f3269a = cls;
        this.f3270b = list;
        this.f3271c = resourceTranscoder;
        this.f3272d = pools2;
        StringBuilder sbM1556G = outline.m1556G("Failed DecodePath{");
        sbM1556G.append(cls.getSimpleName());
        sbM1556G.append("->");
        sbM1556G.append(cls2.getSimpleName());
        sbM1556G.append("->");
        sbM1556G.append(cls3.getSimpleName());
        sbM1556G.append("}");
        this.f3273e = sbM1556G.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public Resource2<Transcode> m1807a(DataRewinder<DataType> dataRewinder, int i, int i2, Options options, a<ResourceType> aVar) throws GlideException {
        Resource2<ResourceType> resource2Mo1704b;
        Transformation transformation;
        EncodeStrategy encodeStrategyMo1711b;
        Key dataCacheKey;
        List<Throwable> listMo2057a = this.f3272d.mo2057a();
        Objects.requireNonNull(listMo2057a, "Argument must not be null");
        List<Throwable> list = listMo2057a;
        try {
            Resource2<ResourceType> resource2M1808b = m1808b(dataRewinder, i, i2, options, list);
            this.f3272d.mo2058b(list);
            DecodeJob.b bVar = (DecodeJob.b) aVar;
            DecodeJob decodeJob = DecodeJob.this;
            DataSource dataSource = bVar.f3250a;
            Objects.requireNonNull(decodeJob);
            Class<?> cls = resource2M1808b.get().getClass();
            ResourceEncoder resourceEncoderM1968a = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                Transformation transformationM1793f = decodeJob.f3229f.m1793f(cls);
                transformation = transformationM1793f;
                resource2Mo1704b = transformationM1793f.mo1704b(decodeJob.f3236m, resource2M1808b, decodeJob.f3240q, decodeJob.f3241r);
            } else {
                resource2Mo1704b = resource2M1808b;
                transformation = null;
            }
            if (!resource2M1808b.equals(resource2Mo1704b)) {
                resource2M1808b.mo1830b();
            }
            boolean z = false;
            if (decodeJob.f3229f.f3203c.f2881c.f2898d.m1968a(resource2Mo1704b.mo1832d()) != null) {
                resourceEncoderM1968a = decodeJob.f3229f.f3203c.f2881c.f2898d.m1968a(resource2Mo1704b.mo1832d());
                if (resourceEncoderM1968a == null) {
                    throw new Registry.d(resource2Mo1704b.mo1832d());
                }
                encodeStrategyMo1711b = resourceEncoderM1968a.mo1711b(decodeJob.f3243t);
            } else {
                encodeStrategyMo1711b = EncodeStrategy.NONE;
            }
            ResourceEncoder resourceEncoder = resourceEncoderM1968a;
            DecodeHelper<R> decodeHelper = decodeJob.f3229f;
            Key key = decodeJob.f3221C;
            List<ModelLoader.a<?>> listM1790c = decodeHelper.m1790c();
            int size = listM1790c.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (listM1790c.get(i3).f3433a.equals(key)) {
                    z = true;
                    break;
                }
            }
            Object obj = resource2Mo1704b;
            if (decodeJob.f3242s.mo1812d(!z, dataSource, encodeStrategyMo1711b)) {
                if (resourceEncoder == null) {
                    throw new Registry.d(resource2Mo1704b.get().getClass());
                }
                int iOrdinal = encodeStrategyMo1711b.ordinal();
                if (iOrdinal == 0) {
                    dataCacheKey = new DataCacheKey(decodeJob.f3221C, decodeJob.f3237n);
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo1711b);
                    }
                    dataCacheKey = new ResourceCacheKey(decodeJob.f3229f.f3203c.f2880b, decodeJob.f3221C, decodeJob.f3237n, decodeJob.f3240q, decodeJob.f3241r, transformation, cls, decodeJob.f3243t);
                }
                LockedResource<Z> lockedResourceM1843a = LockedResource.m1843a(resource2Mo1704b);
                DecodeJob.c<?> cVar = decodeJob.f3234k;
                cVar.f3252a = dataCacheKey;
                cVar.f3253b = resourceEncoder;
                cVar.f3254c = lockedResourceM1843a;
                obj = lockedResourceM1843a;
            }
            return this.f3271c.mo1934a(obj, options);
        } catch (Throwable th) {
            this.f3272d.mo2058b(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Resource2<ResourceType> m1808b(DataRewinder<DataType> dataRewinder, int i, int i2, Options options, List<Throwable> list) throws GlideException {
        int size = this.f3270b.size();
        Resource2<ResourceType> resource2Mo1710b = null;
        for (int i3 = 0; i3 < size; i3++) {
            ResourceDecoder<DataType, ResourceType> resourceDecoder = this.f3270b.get(i3);
            try {
                if (resourceDecoder.mo1709a(dataRewinder.mo1722a(), options)) {
                    resource2Mo1710b = resourceDecoder.mo1710b(dataRewinder.mo1722a(), i, i2, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + resourceDecoder, e);
                }
                list.add(e);
            }
            if (resource2Mo1710b != null) {
                break;
            }
        }
        if (resource2Mo1710b != null) {
            return resource2Mo1710b;
        }
        throw new GlideException(this.f3273e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DecodePath{ dataClass=");
        sbM1556G.append(this.f3269a);
        sbM1556G.append(", decoders=");
        sbM1556G.append(this.f3270b);
        sbM1556G.append(", transcoder=");
        sbM1556G.append(this.f3271c);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
