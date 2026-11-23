package p007c.p085g.p086a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p090s.InputStreamRewinder;
import p007c.p085g.p086a.p089m.p090s.ParcelFileDescriptorRewinder;
import p007c.p085g.p086a.p089m.p092t.Engine;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPoolAdapter;
import p007c.p085g.p086a.p089m.p092t.p093c0.LruArrayPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.LruBitmapPool;
import p007c.p085g.p086a.p089m.p092t.p094d0.InternalCacheDiskCacheFactory;
import p007c.p085g.p086a.p089m.p092t.p094d0.LruResourceCache;
import p007c.p085g.p086a.p089m.p092t.p094d0.MemoryCache;
import p007c.p085g.p086a.p089m.p092t.p094d0.MemorySizeCalculator;
import p007c.p085g.p086a.p089m.p092t.p095e0.GlideExecutor;
import p007c.p085g.p086a.p089m.p096u.AssetUriLoader;
import p007c.p085g.p086a.p089m.p096u.ByteArrayLoader;
import p007c.p085g.p086a.p089m.p096u.ByteBufferEncoder;
import p007c.p085g.p086a.p089m.p096u.ByteBufferFileLoader;
import p007c.p085g.p086a.p089m.p096u.DataUrlLoader;
import p007c.p085g.p086a.p089m.p096u.FileLoader;
import p007c.p085g.p086a.p089m.p096u.GlideUrl;
import p007c.p085g.p086a.p089m.p096u.MediaStoreFileLoader;
import p007c.p085g.p086a.p089m.p096u.ResourceLoader;
import p007c.p085g.p086a.p089m.p096u.StreamEncoder;
import p007c.p085g.p086a.p089m.p096u.StringLoader;
import p007c.p085g.p086a.p089m.p096u.UnitModelLoader;
import p007c.p085g.p086a.p089m.p096u.UriLoader;
import p007c.p085g.p086a.p089m.p096u.UrlUriLoader;
import p007c.p085g.p086a.p089m.p096u.p097y.HttpGlideUrlLoader;
import p007c.p085g.p086a.p089m.p096u.p097y.HttpUriLoader;
import p007c.p085g.p086a.p089m.p096u.p097y.MediaStoreImageThumbLoader;
import p007c.p085g.p086a.p089m.p096u.p097y.MediaStoreVideoThumbLoader;
import p007c.p085g.p086a.p089m.p096u.p097y.QMediaStoreUriLoader;
import p007c.p085g.p086a.p089m.p096u.p097y.UrlLoader;
import p007c.p085g.p086a.p089m.p098v.p099d.BitmapDrawableDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.BitmapDrawableEncoder;
import p007c.p085g.p086a.p089m.p098v.p099d.BitmapEncoder;
import p007c.p085g.p086a.p089m.p098v.p099d.ByteBufferBitmapDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.ByteBufferBitmapImageDecoderResourceDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser;
import p007c.p085g.p086a.p089m.p098v.p099d.Downsampler;
import p007c.p085g.p086a.p089m.p098v.p099d.ExifInterfaceImageHeaderParser;
import p007c.p085g.p086a.p089m.p098v.p099d.InputStreamBitmapImageDecoderResourceDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.ParcelFileDescriptorBitmapDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.ResourceBitmapDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.StreamBitmapDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.UnitBitmapDecoder;
import p007c.p085g.p086a.p089m.p098v.p099d.VideoDecoder;
import p007c.p085g.p086a.p089m.p098v.p100e.ByteBufferRewinder;
import p007c.p085g.p086a.p089m.p098v.p101f.ResourceDrawableDecoder;
import p007c.p085g.p086a.p089m.p098v.p101f.UnitDrawableDecoder;
import p007c.p085g.p086a.p089m.p098v.p102g.FileDecoder;
import p007c.p085g.p086a.p089m.p098v.p103h.ByteBufferGifDecoder;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawable;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawableEncoder;
import p007c.p085g.p086a.p089m.p098v.p103h.GifFrameResourceDecoder;
import p007c.p085g.p086a.p089m.p098v.p103h.StreamGifDecoder;
import p007c.p085g.p086a.p089m.p098v.p104i.BitmapBytesTranscoder;
import p007c.p085g.p086a.p089m.p098v.p104i.BitmapDrawableTranscoder;
import p007c.p085g.p086a.p089m.p098v.p104i.DrawableBytesTranscoder;
import p007c.p085g.p086a.p089m.p098v.p104i.GifDrawableBytesTranscoder;
import p007c.p085g.p086a.p105n.ConnectivityMonitorFactory;
import p007c.p085g.p086a.p105n.DefaultConnectivityMonitorFactory;
import p007c.p085g.p086a.p105n.RequestManagerRetriever;
import p007c.p085g.p086a.p106o.GlideModule;
import p007c.p085g.p086a.p106o.ManifestParser;
import p007c.p085g.p086a.p107p.ImageHeaderParserRegistry;
import p007c.p085g.p086a.p108q.RequestListener;
import p007c.p085g.p086a.p108q.p109h.ImageViewTargetFactory;
import p007c.p085g.p086a.p112s.LruCache;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.c, reason: use source file name */
/* JADX INFO: compiled from: Glide.java */
/* JADX INFO: loaded from: classes.dex */
public class Glide implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: f */
    public static volatile Glide f2854f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f2855g;

    /* JADX INFO: renamed from: h */
    public final BitmapPool f2856h;

    /* JADX INFO: renamed from: i */
    public final MemoryCache f2857i;

    /* JADX INFO: renamed from: j */
    public final GlideContext f2858j;

    /* JADX INFO: renamed from: k */
    public final Registry f2859k;

    /* JADX INFO: renamed from: l */
    public final ArrayPool f2860l;

    /* JADX INFO: renamed from: m */
    public final RequestManagerRetriever f2861m;

    /* JADX INFO: renamed from: n */
    public final ConnectivityMonitorFactory f2862n;

    /* JADX INFO: renamed from: o */
    public final List<RequestManager> f2863o = new ArrayList();

    /* JADX INFO: renamed from: c.g.a.c$a */
    /* JADX INFO: compiled from: Glide.java */
    public interface a {
    }

    public Glide(Context context, Engine engine, MemoryCache memoryCache, BitmapPool bitmapPool, ArrayPool arrayPool, RequestManagerRetriever requestManagerRetriever, ConnectivityMonitorFactory connectivityMonitorFactory, int i, a aVar, Map<Class<?>, TransitionOptions<?, ?>> map, List<RequestListener<Object>> list, boolean z, boolean z2) {
        ResourceDecoder byteBufferBitmapDecoder;
        ResourceDecoder streamBitmapDecoder;
        this.f2856h = bitmapPool;
        this.f2860l = arrayPool;
        this.f2857i = memoryCache;
        this.f2861m = requestManagerRetriever;
        this.f2862n = connectivityMonitorFactory;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f2859k = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        ImageHeaderParserRegistry imageHeaderParserRegistry = registry.f2901g;
        synchronized (imageHeaderParserRegistry) {
            imageHeaderParserRegistry.f3706a.add(defaultImageHeaderParser);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            ExifInterfaceImageHeaderParser exifInterfaceImageHeaderParser = new ExifInterfaceImageHeaderParser();
            ImageHeaderParserRegistry imageHeaderParserRegistry2 = registry.f2901g;
            synchronized (imageHeaderParserRegistry2) {
                imageHeaderParserRegistry2.f3706a.add(exifInterfaceImageHeaderParser);
            }
        }
        List<ImageHeaderParser> listM1632e = registry.m1632e();
        ByteBufferGifDecoder byteBufferGifDecoder = new ByteBufferGifDecoder(context, listM1632e, bitmapPool, arrayPool);
        VideoDecoder videoDecoder = new VideoDecoder(bitmapPool, new VideoDecoder.g());
        Downsampler downsampler = new Downsampler(registry.m1632e(), resources.getDisplayMetrics(), bitmapPool, arrayPool);
        if (!z2 || i2 < 28) {
            byteBufferBitmapDecoder = new ByteBufferBitmapDecoder(downsampler);
            streamBitmapDecoder = new StreamBitmapDecoder(downsampler, arrayPool);
        } else {
            streamBitmapDecoder = new InputStreamBitmapImageDecoderResourceDecoder();
            byteBufferBitmapDecoder = new ByteBufferBitmapImageDecoderResourceDecoder();
        }
        ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(context);
        ResourceLoader.c cVar = new ResourceLoader.c(resources);
        ResourceLoader.d dVar = new ResourceLoader.d(resources);
        ResourceLoader.b bVar = new ResourceLoader.b(resources);
        ResourceLoader.a aVar2 = new ResourceLoader.a(resources);
        BitmapEncoder bitmapEncoder = new BitmapEncoder(arrayPool);
        BitmapBytesTranscoder bitmapBytesTranscoder = new BitmapBytesTranscoder();
        GifDrawableBytesTranscoder gifDrawableBytesTranscoder = new GifDrawableBytesTranscoder();
        ContentResolver contentResolver = context.getContentResolver();
        registry.m1628a(ByteBuffer.class, new ByteBufferEncoder());
        registry.m1628a(InputStream.class, new StreamEncoder(arrayPool));
        registry.m1631d("Bitmap", ByteBuffer.class, Bitmap.class, byteBufferBitmapDecoder);
        registry.m1631d("Bitmap", InputStream.class, Bitmap.class, streamBitmapDecoder);
        registry.m1631d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new ParcelFileDescriptorBitmapDecoder(downsampler));
        registry.m1631d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, videoDecoder);
        registry.m1631d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new VideoDecoder(bitmapPool, new VideoDecoder.c(null)));
        UnitModelLoader.a<?> aVar3 = UnitModelLoader.a.f3467a;
        registry.m1630c(Bitmap.class, Bitmap.class, aVar3);
        registry.m1631d("Bitmap", Bitmap.class, Bitmap.class, new UnitBitmapDecoder());
        registry.m1629b(Bitmap.class, bitmapEncoder);
        registry.m1631d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, byteBufferBitmapDecoder));
        registry.m1631d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, streamBitmapDecoder));
        registry.m1631d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, videoDecoder));
        registry.m1629b(BitmapDrawable.class, new BitmapDrawableEncoder(bitmapPool, bitmapEncoder));
        registry.m1631d("Gif", InputStream.class, GifDrawable.class, new StreamGifDecoder(listM1632e, byteBufferGifDecoder, arrayPool));
        registry.m1631d("Gif", ByteBuffer.class, GifDrawable.class, byteBufferGifDecoder);
        registry.m1629b(GifDrawable.class, new GifDrawableEncoder());
        registry.m1630c(GifDecoder.class, GifDecoder.class, aVar3);
        registry.m1631d("Bitmap", GifDecoder.class, Bitmap.class, new GifFrameResourceDecoder(bitmapPool));
        registry.m1631d("legacy_append", Uri.class, Drawable.class, resourceDrawableDecoder);
        registry.m1631d("legacy_append", Uri.class, Bitmap.class, new ResourceBitmapDecoder(resourceDrawableDecoder, bitmapPool));
        registry.m1634g(new ByteBufferRewinder.a());
        registry.m1630c(File.class, ByteBuffer.class, new ByteBufferFileLoader.b());
        registry.m1630c(File.class, InputStream.class, new FileLoader.e());
        registry.m1631d("legacy_append", File.class, File.class, new FileDecoder());
        registry.m1630c(File.class, ParcelFileDescriptor.class, new FileLoader.b());
        registry.m1630c(File.class, File.class, aVar3);
        registry.m1634g(new InputStreamRewinder.a(arrayPool));
        registry.m1634g(new ParcelFileDescriptorRewinder.a());
        Class cls = Integer.TYPE;
        registry.m1630c(cls, InputStream.class, cVar);
        registry.m1630c(cls, ParcelFileDescriptor.class, bVar);
        registry.m1630c(Integer.class, InputStream.class, cVar);
        registry.m1630c(Integer.class, ParcelFileDescriptor.class, bVar);
        registry.m1630c(Integer.class, Uri.class, dVar);
        registry.m1630c(cls, AssetFileDescriptor.class, aVar2);
        registry.m1630c(Integer.class, AssetFileDescriptor.class, aVar2);
        registry.m1630c(cls, Uri.class, dVar);
        registry.m1630c(String.class, InputStream.class, new DataUrlLoader.c());
        registry.m1630c(Uri.class, InputStream.class, new DataUrlLoader.c());
        registry.m1630c(String.class, InputStream.class, new StringLoader.c());
        registry.m1630c(String.class, ParcelFileDescriptor.class, new StringLoader.b());
        registry.m1630c(String.class, AssetFileDescriptor.class, new StringLoader.a());
        registry.m1630c(Uri.class, InputStream.class, new HttpUriLoader.a());
        registry.m1630c(Uri.class, InputStream.class, new AssetUriLoader.c(context.getAssets()));
        registry.m1630c(Uri.class, ParcelFileDescriptor.class, new AssetUriLoader.b(context.getAssets()));
        registry.m1630c(Uri.class, InputStream.class, new MediaStoreImageThumbLoader.a(context));
        registry.m1630c(Uri.class, InputStream.class, new MediaStoreVideoThumbLoader.a(context));
        if (i2 >= 29) {
            registry.m1630c(Uri.class, InputStream.class, new QMediaStoreUriLoader.c(context));
            registry.m1630c(Uri.class, ParcelFileDescriptor.class, new QMediaStoreUriLoader.b(context));
        }
        registry.m1630c(Uri.class, InputStream.class, new UriLoader.d(contentResolver));
        registry.m1630c(Uri.class, ParcelFileDescriptor.class, new UriLoader.b(contentResolver));
        registry.m1630c(Uri.class, AssetFileDescriptor.class, new UriLoader.a(contentResolver));
        registry.m1630c(Uri.class, InputStream.class, new UrlUriLoader.a());
        registry.m1630c(URL.class, InputStream.class, new UrlLoader.a());
        registry.m1630c(Uri.class, File.class, new MediaStoreFileLoader.a(context));
        registry.m1630c(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.a());
        registry.m1630c(byte[].class, ByteBuffer.class, new ByteArrayLoader.a());
        registry.m1630c(byte[].class, InputStream.class, new ByteArrayLoader.d());
        registry.m1630c(Uri.class, Uri.class, aVar3);
        registry.m1630c(Drawable.class, Drawable.class, aVar3);
        registry.m1631d("legacy_append", Drawable.class, Drawable.class, new UnitDrawableDecoder());
        registry.m1635h(Bitmap.class, BitmapDrawable.class, new BitmapDrawableTranscoder(resources));
        registry.m1635h(Bitmap.class, byte[].class, bitmapBytesTranscoder);
        registry.m1635h(Drawable.class, byte[].class, new DrawableBytesTranscoder(bitmapPool, bitmapBytesTranscoder, gifDrawableBytesTranscoder));
        registry.m1635h(GifDrawable.class, byte[].class, gifDrawableBytesTranscoder);
        if (i2 >= 23) {
            VideoDecoder videoDecoder2 = new VideoDecoder(bitmapPool, new VideoDecoder.d());
            registry.m1631d("legacy_append", ByteBuffer.class, Bitmap.class, videoDecoder2);
            registry.m1631d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, videoDecoder2));
        }
        this.f2858j = new GlideContext(context, arrayPool, registry, new ImageViewTargetFactory(), aVar, map, list, engine, z, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m1623a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List<GlideModule> list;
        if (f2855g) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f2855g = true;
        GlideBuilder glideBuilder = new GlideBuilder();
        Context applicationContext = context.getApplicationContext();
        List listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo1961c()) {
            ManifestParser manifestParser = new ManifestParser(applicationContext);
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = manifestParser.f3702a.getPackageManager().getApplicationInfo(manifestParser.f3702a.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(ManifestParser.m1963a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                list = arrayList;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        } else {
            list = listEmptyList;
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo12563d().isEmpty()) {
            Set<Class<?>> setMo12563d = generatedAppGlideModule.mo12563d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GlideModule glideModule = (GlideModule) it.next();
                if (setMo12563d.contains(glideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + glideModule);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (GlideModule glideModule2 : list) {
                StringBuilder sbM1556G = outline.m1556G("Discovered GlideModule from manifest: ");
                sbM1556G.append(glideModule2.getClass());
                Log.d("Glide", sbM1556G.toString());
            }
        }
        glideBuilder.f2876m = generatedAppGlideModule != null ? generatedAppGlideModule.mo12564e() : null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((GlideModule) it2.next()).mo1960a(applicationContext, glideBuilder);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo1960a(applicationContext, glideBuilder);
        }
        if (glideBuilder.f2869f == null) {
            int iM1786a = GlideExecutor.m1786a();
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException(outline.m1599u("Name must be non-null and non-empty, but given: ", "source"));
            }
            glideBuilder.f2869f = new GlideExecutor(new ThreadPoolExecutor(iM1786a, iM1786a, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new GlideExecutor.a("source", GlideExecutor.b.f3197b, false)));
        }
        if (glideBuilder.f2870g == null) {
            int i = GlideExecutor.f3190g;
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException(outline.m1599u("Name must be non-null and non-empty, but given: ", "disk-cache"));
            }
            glideBuilder.f2870g = new GlideExecutor(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new GlideExecutor.a("disk-cache", GlideExecutor.b.f3197b, true)));
        }
        if (glideBuilder.f2877n == null) {
            int i2 = GlideExecutor.m1786a() >= 4 ? 2 : 1;
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException(outline.m1599u("Name must be non-null and non-empty, but given: ", "animation"));
            }
            glideBuilder.f2877n = new GlideExecutor(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new GlideExecutor.a("animation", GlideExecutor.b.f3197b, true)));
        }
        if (glideBuilder.f2872i == null) {
            glideBuilder.f2872i = new MemorySizeCalculator(new MemorySizeCalculator.a(applicationContext));
        }
        if (glideBuilder.f2873j == null) {
            glideBuilder.f2873j = new DefaultConnectivityMonitorFactory();
        }
        if (glideBuilder.f2866c == null) {
            int i3 = glideBuilder.f2872i.f3169a;
            if (i3 > 0) {
                glideBuilder.f2866c = new LruBitmapPool(i3);
            } else {
                glideBuilder.f2866c = new BitmapPoolAdapter();
            }
        }
        if (glideBuilder.f2867d == null) {
            glideBuilder.f2867d = new LruArrayPool(glideBuilder.f2872i.f3172d);
        }
        if (glideBuilder.f2868e == null) {
            glideBuilder.f2868e = new LruResourceCache(glideBuilder.f2872i.f3170b);
        }
        if (glideBuilder.f2871h == null) {
            glideBuilder.f2871h = new InternalCacheDiskCacheFactory(applicationContext);
        }
        if (glideBuilder.f2865b == null) {
            glideBuilder.f2865b = new Engine(glideBuilder.f2868e, glideBuilder.f2871h, glideBuilder.f2870g, glideBuilder.f2869f, new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, GlideExecutor.f3189f, TimeUnit.MILLISECONDS, new SynchronousQueue(), new GlideExecutor.a("source-unlimited", GlideExecutor.b.f3197b, false))), glideBuilder.f2877n, false);
        }
        List<RequestListener<Object>> list2 = glideBuilder.f2878o;
        if (list2 == null) {
            glideBuilder.f2878o = Collections.emptyList();
        } else {
            glideBuilder.f2878o = Collections.unmodifiableList(list2);
        }
        Glide glide = new Glide(applicationContext, glideBuilder.f2865b, glideBuilder.f2868e, glideBuilder.f2866c, glideBuilder.f2867d, new RequestManagerRetriever(glideBuilder.f2876m), glideBuilder.f2873j, glideBuilder.f2874k, glideBuilder.f2875l, glideBuilder.f2864a, glideBuilder.f2878o, false, false);
        for (GlideModule glideModule3 : list) {
            try {
                glideModule3.mo1962b(applicationContext, glide, glide.f2859k);
            } catch (AbstractMethodError e2) {
                StringBuilder sbM1556G2 = outline.m1556G("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                sbM1556G2.append(glideModule3.getClass().getName());
                throw new IllegalStateException(sbM1556G2.toString(), e2);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo1962b(applicationContext, glide, glide.f2859k);
        }
        applicationContext.registerComponentCallbacks(glide);
        f2854f = glide;
        f2855g = false;
    }

    /* JADX INFO: renamed from: b */
    public static Glide m1624b(Context context) {
        if (f2854f == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                m1626d(e);
                throw null;
            } catch (InstantiationException e2) {
                m1626d(e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m1626d(e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m1626d(e4);
                throw null;
            }
            synchronized (Glide.class) {
                if (f2854f == null) {
                    m1623a(context, generatedAppGlideModule);
                }
            }
        }
        return f2854f;
    }

    /* JADX INFO: renamed from: c */
    public static RequestManagerRetriever m1625c(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m1624b(context).f2861m;
    }

    /* JADX INFO: renamed from: d */
    public static void m1626d(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* JADX INFO: renamed from: e */
    public static RequestManager m1627e(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m1624b(context).f2861m.m1947b(context);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Util4.m2046a();
        ((LruCache) this.f2857i).m2043e(0L);
        this.f2856h.mo1750b();
        this.f2860l.mo1742b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        long j2;
        Util4.m2046a();
        Iterator<RequestManager> it = this.f2863o.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
        LruResourceCache lruResourceCache = (LruResourceCache) this.f2857i;
        Objects.requireNonNull(lruResourceCache);
        if (i >= 40) {
            lruResourceCache.m2043e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (lruResourceCache) {
                j2 = lruResourceCache.f3822b;
            }
            lruResourceCache.m2043e(j2 / 2);
        }
        this.f2856h.mo1749a(i);
        this.f2860l.mo1741a(i);
    }
}
