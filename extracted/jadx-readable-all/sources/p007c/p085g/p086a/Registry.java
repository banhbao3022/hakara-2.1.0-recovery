package p007c.p085g.p086a;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Encoder;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.ResourceEncoder;
import p007c.p085g.p086a.p089m.p090s.DataRewinder;
import p007c.p085g.p086a.p089m.p090s.DataRewinderRegistry;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderRegistry;
import p007c.p085g.p086a.p089m.p096u.MultiModelLoaderFactory;
import p007c.p085g.p086a.p089m.p098v.p104i.ResourceTranscoder;
import p007c.p085g.p086a.p089m.p098v.p104i.TranscoderRegistry;
import p007c.p085g.p086a.p107p.EncoderRegistry;
import p007c.p085g.p086a.p107p.ImageHeaderParserRegistry;
import p007c.p085g.p086a.p107p.LoadPathCache;
import p007c.p085g.p086a.p107p.ModelToResourceClassCache;
import p007c.p085g.p086a.p107p.ResourceDecoderRegistry;
import p007c.p085g.p086a.p107p.ResourceEncoderRegistry;
import p007c.p085g.p086a.p112s.p113k.FactoryPools;
import p007c.p085g.p086a.p112s.p113k.FactoryPools2;
import p007c.p085g.p086a.p112s.p113k.FactoryPools3;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools4;

/* JADX INFO: renamed from: c.g.a.g, reason: use source file name */
/* JADX INFO: compiled from: Registry.java */
/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: a */
    public final ModelLoaderRegistry f2895a;

    /* JADX INFO: renamed from: b */
    public final EncoderRegistry f2896b;

    /* JADX INFO: renamed from: c */
    public final ResourceDecoderRegistry f2897c;

    /* JADX INFO: renamed from: d */
    public final ResourceEncoderRegistry f2898d;

    /* JADX INFO: renamed from: e */
    public final DataRewinderRegistry f2899e;

    /* JADX INFO: renamed from: f */
    public final TranscoderRegistry f2900f;

    /* JADX INFO: renamed from: g */
    public final ImageHeaderParserRegistry f2901g;

    /* JADX INFO: renamed from: h */
    public final ModelToResourceClassCache f2902h = new ModelToResourceClassCache();

    /* JADX INFO: renamed from: i */
    public final LoadPathCache f2903i = new LoadPathCache();

    /* JADX INFO: renamed from: j */
    public final Pools2<List<Throwable>> f2904j;

    /* JADX INFO: renamed from: c.g.a.g$a */
    /* JADX INFO: compiled from: Registry.java */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: c.g.a.g$b */
    /* JADX INFO: compiled from: Registry.java */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: renamed from: c.g.a.g$c */
    /* JADX INFO: compiled from: Registry.java */
    public static class c extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        public c(Object obj) {
            StringBuilder sbM1556G = outline.m1556G("Failed to find any ModelLoaders registered for model class: ");
            sbM1556G.append(obj.getClass());
            super(sbM1556G.toString());
        }

        public <M> c(M m, List<ModelLoader<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* JADX INFO: renamed from: c.g.a.g$d */
    /* JADX INFO: compiled from: Registry.java */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: renamed from: c.g.a.g$e */
    /* JADX INFO: compiled from: Registry.java */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        FactoryPools.c cVar = new FactoryPools.c(new Pools4(20), new FactoryPools2(), new FactoryPools3());
        this.f2904j = cVar;
        this.f2895a = new ModelLoaderRegistry(cVar);
        this.f2896b = new EncoderRegistry();
        ResourceDecoderRegistry resourceDecoderRegistry = new ResourceDecoderRegistry();
        this.f2897c = resourceDecoderRegistry;
        this.f2898d = new ResourceEncoderRegistry();
        this.f2899e = new DataRewinderRegistry();
        this.f2900f = new TranscoderRegistry();
        this.f2901g = new ImageHeaderParserRegistry();
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (resourceDecoderRegistry) {
            ArrayList<String> arrayList2 = new ArrayList(resourceDecoderRegistry.f3712a);
            resourceDecoderRegistry.f3712a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                resourceDecoderRegistry.f3712a.add((String) it.next());
            }
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    resourceDecoderRegistry.f3712a.add(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public <Data> Registry m1628a(Class<Data> cls, Encoder<Data> encoder) {
        EncoderRegistry encoderRegistry = this.f2896b;
        synchronized (encoderRegistry) {
            encoderRegistry.f3703a.add(new EncoderRegistry.a<>(cls, encoder));
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public <TResource> Registry m1629b(Class<TResource> cls, ResourceEncoder<TResource> resourceEncoder) {
        ResourceEncoderRegistry resourceEncoderRegistry = this.f2898d;
        synchronized (resourceEncoderRegistry) {
            resourceEncoderRegistry.f3717a.add(new ResourceEncoderRegistry.a<>(cls, resourceEncoder));
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public <Model, Data> Registry m1630c(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<Model, Data> modelLoaderFactory) {
        ModelLoaderRegistry modelLoaderRegistry = this.f2895a;
        synchronized (modelLoaderRegistry) {
            MultiModelLoaderFactory multiModelLoaderFactory = modelLoaderRegistry.f3436a;
            synchronized (multiModelLoaderFactory) {
                MultiModelLoaderFactory.b<?, ?> bVar = new MultiModelLoaderFactory.b<>(cls, cls2, modelLoaderFactory);
                List<MultiModelLoaderFactory.b<?, ?>> list = multiModelLoaderFactory.f3451c;
                list.add(list.size(), bVar);
            }
            modelLoaderRegistry.f3437b.f3438a.clear();
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public <Data, TResource> Registry m1631d(String str, Class<Data> cls, Class<TResource> cls2, ResourceDecoder<Data, TResource> resourceDecoder) {
        ResourceDecoderRegistry resourceDecoderRegistry = this.f2897c;
        synchronized (resourceDecoderRegistry) {
            resourceDecoderRegistry.m1965a(str).add(new ResourceDecoderRegistry.a<>(cls, cls2, resourceDecoder));
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public List<ImageHeaderParser> m1632e() {
        List<ImageHeaderParser> list;
        ImageHeaderParserRegistry imageHeaderParserRegistry = this.f2901g;
        synchronized (imageHeaderParserRegistry) {
            list = imageHeaderParserRegistry.f3706a;
        }
        if (list.isEmpty()) {
            throw new b();
        }
        return list;
    }

    /* JADX INFO: renamed from: f */
    public <Model> List<ModelLoader<Model, ?>> m1633f(Model model) {
        List<ModelLoader<?, ?>> listUnmodifiableList;
        ModelLoaderRegistry modelLoaderRegistry = this.f2895a;
        Objects.requireNonNull(modelLoaderRegistry);
        Class<?> cls = model.getClass();
        synchronized (modelLoaderRegistry) {
            ModelLoaderRegistry.a.C8504a<?> c8504a = modelLoaderRegistry.f3437b.f3438a.get(cls);
            listUnmodifiableList = c8504a == null ? null : c8504a.f3439a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(modelLoaderRegistry.f3436a.m1866c(cls));
                if (modelLoaderRegistry.f3437b.f3438a.put(cls, new ModelLoaderRegistry.a.C8504a<>(listUnmodifiableList)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new c(model);
        }
        int size = listUnmodifiableList.size();
        List<ModelLoader<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ModelLoader<?, ?> modelLoader = listUnmodifiableList.get(i);
            if (modelLoader.mo1846a(model)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(modelLoader);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new c(model, (List<ModelLoader<Model, ?>>) listUnmodifiableList);
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: g */
    public Registry m1634g(DataRewinder.a<?> aVar) {
        DataRewinderRegistry dataRewinderRegistry = this.f2899e;
        synchronized (dataRewinderRegistry) {
            dataRewinderRegistry.f3051b.put(aVar.mo1724a(), aVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public <TResource, Transcode> Registry m1635h(Class<TResource> cls, Class<Transcode> cls2, ResourceTranscoder<TResource, Transcode> resourceTranscoder) {
        TranscoderRegistry transcoderRegistry = this.f2900f;
        synchronized (transcoderRegistry) {
            transcoderRegistry.f3664a.add(new TranscoderRegistry.a<>(cls, cls2, resourceTranscoder));
        }
        return this;
    }
}
