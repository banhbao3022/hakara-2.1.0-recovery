package p007c.p085g.p086a.p089m.p092t;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p085g.p086a.GlideContext;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.Registry;
import p007c.p085g.p086a.p089m.Encoder;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.p094d0.DiskCache;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p098v.UnitTransformation;
import p007c.p085g.p086a.p089m.p098v.p104i.ResourceTranscoder;
import p007c.p085g.p086a.p089m.p098v.p104i.TranscoderRegistry;
import p007c.p085g.p086a.p089m.p098v.p104i.UnitTranscoder;
import p007c.p085g.p086a.p107p.EncoderRegistry;
import p007c.p085g.p086a.p107p.LoadPathCache;
import p007c.p085g.p086a.p107p.ResourceDecoderRegistry;
import p007c.p085g.p086a.p112s.MultiClassKey;

/* JADX INFO: renamed from: c.g.a.m.t.h, reason: use source file name */
/* JADX INFO: compiled from: DecodeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class DecodeHelper<Transcode> {

    /* JADX INFO: renamed from: a */
    public final List<ModelLoader.a<?>> f3201a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<Key> f3202b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public GlideContext f3203c;

    /* JADX INFO: renamed from: d */
    public Object f3204d;

    /* JADX INFO: renamed from: e */
    public int f3205e;

    /* JADX INFO: renamed from: f */
    public int f3206f;

    /* JADX INFO: renamed from: g */
    public Class<?> f3207g;

    /* JADX INFO: renamed from: h */
    public DecodeJob.d f3208h;

    /* JADX INFO: renamed from: i */
    public Options f3209i;

    /* JADX INFO: renamed from: j */
    public Map<Class<?>, Transformation<?>> f3210j;

    /* JADX INFO: renamed from: k */
    public Class<Transcode> f3211k;

    /* JADX INFO: renamed from: l */
    public boolean f3212l;

    /* JADX INFO: renamed from: m */
    public boolean f3213m;

    /* JADX INFO: renamed from: n */
    public Key f3214n;

    /* JADX INFO: renamed from: o */
    public Priority f3215o;

    /* JADX INFO: renamed from: p */
    public DiskCacheStrategy f3216p;

    /* JADX INFO: renamed from: q */
    public boolean f3217q;

    /* JADX INFO: renamed from: r */
    public boolean f3218r;

    /* JADX INFO: renamed from: a */
    public List<Key> m1788a() {
        if (!this.f3213m) {
            this.f3213m = true;
            this.f3202b.clear();
            List<ModelLoader.a<?>> listM1790c = m1790c();
            int size = listM1790c.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.a<?> aVar = listM1790c.get(i);
                if (!this.f3202b.contains(aVar.f3433a)) {
                    this.f3202b.add(aVar.f3433a);
                }
                for (int i2 = 0; i2 < aVar.f3434b.size(); i2++) {
                    if (!this.f3202b.contains(aVar.f3434b.get(i2))) {
                        this.f3202b.add(aVar.f3434b.get(i2));
                    }
                }
            }
        }
        return this.f3202b;
    }

    /* JADX INFO: renamed from: b */
    public DiskCache m1789b() {
        return ((Engine.c) this.f3208h).m1820a();
    }

    /* JADX INFO: renamed from: c */
    public List<ModelLoader.a<?>> m1790c() {
        if (!this.f3212l) {
            this.f3212l = true;
            this.f3201a.clear();
            List listM1633f = this.f3203c.f2881c.m1633f(this.f3204d);
            int size = listM1633f.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.a<?> aVarMo1847b = ((ModelLoader) listM1633f.get(i)).mo1847b(this.f3204d, this.f3205e, this.f3206f, this.f3209i);
                if (aVarMo1847b != null) {
                    this.f3201a.add(aVarMo1847b);
                }
            }
        }
        return this.f3201a;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: d */
    public <Data> LoadPath<Data, ?, Transcode> m1791d(Class<Data> cls) {
        LoadPath<Data, ?, Transcode> loadPath;
        ArrayList arrayList;
        TranscoderRegistry.a<?, ?> next;
        ResourceTranscoder resourceTranscoder;
        Registry registry = this.f3203c.f2881c;
        Class<?> cls2 = this.f3207g;
        Class<Transcode> cls3 = this.f3211k;
        LoadPathCache loadPathCache = registry.f2903i;
        MultiClassKey andSet = loadPathCache.f3709c.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey();
        }
        andSet.f3825a = cls;
        andSet.f3826b = cls2;
        andSet.f3827c = cls3;
        synchronized (loadPathCache.f3708b) {
            loadPath = (LoadPath) loadPathCache.f3708b.getOrDefault(andSet, null);
        }
        loadPathCache.f3709c.set(andSet);
        Objects.requireNonNull(registry.f2903i);
        if (LoadPathCache.f3707a.equals(loadPath)) {
            return null;
        }
        if (loadPath != null) {
            return loadPath;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : (ArrayList) registry.f2897c.m1966b(cls, cls2)) {
            for (Class<?> cls5 : (ArrayList) registry.f2900f.m1935a(cls4, cls3)) {
                ResourceDecoderRegistry resourceDecoderRegistry = registry.f2897c;
                synchronized (resourceDecoderRegistry) {
                    arrayList = new ArrayList();
                    Iterator<String> it = resourceDecoderRegistry.f3712a.iterator();
                    while (it.hasNext()) {
                        List<ResourceDecoderRegistry.a<?, ?>> list = resourceDecoderRegistry.f3713b.get(it.next());
                        if (list != null) {
                            for (ResourceDecoderRegistry.a<?, ?> aVar : list) {
                                if (aVar.m1967a(cls, cls4)) {
                                    arrayList.add(aVar.f3716c);
                                }
                            }
                        }
                    }
                }
                TranscoderRegistry transcoderRegistry = registry.f2900f;
                synchronized (transcoderRegistry) {
                    if (cls5.isAssignableFrom(cls4)) {
                        resourceTranscoder = UnitTranscoder.f3668a;
                    } else {
                        Iterator<TranscoderRegistry.a<?, ?>> it2 = transcoderRegistry.f3664a.iterator();
                        do {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                            }
                            next = it2.next();
                        } while (!next.m1936a(cls4, cls5));
                        resourceTranscoder = next.f3667c;
                    }
                }
                arrayList2.add(new DecodePath(cls, cls4, cls5, arrayList, resourceTranscoder, registry.f2904j));
            }
        }
        LoadPath<Data, ?, Transcode> loadPath2 = arrayList2.isEmpty() ? null : new LoadPath<>(cls, cls2, cls3, arrayList2, registry.f2904j);
        LoadPathCache loadPathCache2 = registry.f2903i;
        synchronized (loadPathCache2.f3708b) {
            loadPathCache2.f3708b.put(new MultiClassKey(cls, cls2, cls3), loadPath2 != null ? loadPath2 : LoadPathCache.f3707a);
        }
        return loadPath2;
    }

    /* JADX INFO: renamed from: e */
    public <X> Encoder<X> m1792e(X x) throws Registry.e {
        Encoder<X> encoder;
        EncoderRegistry encoderRegistry = this.f3203c.f2881c.f2896b;
        Class<?> cls = x.getClass();
        synchronized (encoderRegistry) {
            for (EncoderRegistry.a<?> aVar : encoderRegistry.f3703a) {
                if (aVar.f3704a.isAssignableFrom(cls)) {
                    encoder = (Encoder<X>) aVar.f3705b;
                }
            }
            encoder = null;
        }
        if (encoder != null) {
            return encoder;
        }
        throw new Registry.e(x.getClass());
    }

    /* JADX INFO: renamed from: f */
    public <Z> Transformation<Z> m1793f(Class<Z> cls) {
        Transformation<Z> transformation = (Transformation) this.f3210j.get(cls);
        if (transformation == null) {
            for (Map.Entry<Class<?>, Transformation<?>> entry : this.f3210j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.f3210j.isEmpty() || !this.f3217q) {
            return (UnitTransformation) UnitTransformation.f3512b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public boolean m1794g(Class<?> cls) {
        return m1791d(cls) != null;
    }
}
